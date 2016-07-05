package org.occiware.clouddesigner.occi.infrastructure.connector;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 * Created by mael on 04/07/16.
 */
public class ConnectPCA {

    /**
     * Initialize the logger.
     */
    private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

    /**
     * Send a request to pca service with a header containing the session id and sending content
     * @param input which is send to the cloud automation service
     * @return the information about gathered from cloud automation service
     */
    public JSONObject postRequest(JSONObject input) {

        final String url = getProperty("server.endpoint")+"/compute/";
        System.out.println("get property ok");
        JSONObject result;
        try {

            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost postRequest = new HttpPost(url);
            StringEntity entity = new StringEntity(input.toJSONString());
            entity.setContentType("application/json");
            postRequest.setEntity(entity);
            System.out.println("input:"+input);
            System.out.println("content : "+input.toString());
            HttpResponse response = httpClient.execute(postRequest);
            System.out.println("envoie de requete ok"+response.toString());
            String serverOutput = readHttpResponse(response);
            httpClient.close();
            System.out.println("lecture reponse ok");
            result = (JSONObject) new JSONParser().parse(serverOutput);
        } catch (Exception ex) {
            System.out.println("exception "+ex.getMessage());
            return null;
        }
        return result;
    }

    /**
     * Get the property from the configuration file config.properties
     * @param propertyKey is the key of the variable
     * @return the value of the variable
     */
    String getProperty(String propertyKey){
        Properties prop = new Properties();
        InputStream input = null;

        try {

            prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

            // return the property value
            return prop.getProperty(propertyKey);

        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Unable to get the cloud automation service url from config.properties");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Read an http respond and convert it into a string
     * @param response is the http response
     * @return a string containing the information from response
     * @throws IOException occur if problem occur with the buffer
     */
    private String readHttpResponse(HttpResponse response) throws IOException {
        StringBuffer serverOutput = new StringBuffer();
        System.out.println("response "+response.toString());
        if (response.getStatusLine().getStatusCode() != 201) {
            throw new RuntimeException("Send Request Failed : HTTP error code : "
                    + response.getStatusLine().getStatusCode());
        }

        BufferedReader br = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));

        String output;
        while ((output = br.readLine()) != null) {
            serverOutput.append(output);
        }
        return serverOutput.toString();
    }

}
