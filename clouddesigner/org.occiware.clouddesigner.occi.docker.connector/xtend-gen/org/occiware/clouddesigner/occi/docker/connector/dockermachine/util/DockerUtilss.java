package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerUtilss {
  protected static String OS = System.getProperty("os.name").toLowerCase();
  
  private static Logger LOGGER = LoggerFactory.getLogger(DockerUtilss.class);
  
  private static String DOCKER_MACHINE = "/usr/local/bin/docker-machine";
  
  /**
   * Instance an unique pre-initialise
   */
  private static DockerUtilss INSTANCE = new DockerUtilss();
  
  /**
   * Private Constructor
   */
  private DockerUtilss() {
  }
  
  /**
   * Access Point for unique singleton instance.
   */
  public static DockerUtilss getInstance() {
    return DockerUtilss.INSTANCE;
  }
  
  /**
   * Security.
   */
  private Object readResolve() {
    return DockerUtilss.INSTANCE;
  }
  
  /**
   * Run the good docker-machine according to the OS.
   */
  public String getDockerMachineCmd() {
    String command = "docker-machine";
    String _oS = this.getOS();
    boolean _equalsIgnoreCase = _oS.equalsIgnoreCase("osx");
    if (_equalsIgnoreCase) {
      command = DockerUtilss.DOCKER_MACHINE;
      String _oS_1 = this.getOS();
      DockerUtilss.LOGGER.info("Machine OS={}", _oS_1);
    }
    return command;
  }
  
  /**
   * Parse String to Json data.
   */
  public JsonNode jsonify(final String jsonString) {
    if (((jsonString != null) || (jsonString == ""))) {
      ObjectMapper mapper = new ObjectMapper();
      JsonFactory factory = mapper.getJsonFactory();
      JsonParser parser = null;
      JsonNode node = null;
      try {
        JsonParser _createJsonParser = factory.createJsonParser(jsonString);
        parser = _createJsonParser;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      try {
        JsonNode _readTree = mapper.readTree(parser);
        node = _readTree;
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof IOException) {
          final IOException e_1 = (IOException)_t_1;
          e_1.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t_1);
        }
      }
      return node;
    }
    return null;
  }
  
  /**
   * Parse `docker-machine ls` host from the running environment.
   */
  public Map<String, String> getHosts() {
    Runtime _runtime = Runtime.getRuntime();
    String data = DockerMachineManager.listHostCmd(_runtime);
    Map<String, String> hosts = new HashMap<String, String>();
    if ((data != null)) {
      String[] st = data.split("\\r?\\n");
      int _length = st.length;
      String[] list = Arrays.<String>copyOfRange(st, 1, _length);
      for (final String line : list) {
        {
          String l = line;
          String _replaceAll = l.replaceAll("\\*", "");
          l = _replaceAll;
          String[] _split = l.split("\\s+");
          List<String> lsCmd = Arrays.<String>asList(_split);
          if (((lsCmd.size() >= 3) && (lsCmd.size() < 5))) {
            String _get = lsCmd.get(0);
            String _get_1 = lsCmd.get(2);
            hosts.put(_get, _get_1);
          } else {
            int _size = lsCmd.size();
            boolean _greaterEqualsThan = (_size >= 5);
            if (_greaterEqualsThan) {
              boolean _contains = lsCmd.contains("(master)");
              if (_contains) {
                String _get_2 = lsCmd.get(0);
                String _get_3 = lsCmd.get(3);
                hosts.put(_get_2, _get_3);
              } else {
                String _get_4 = lsCmd.get(0);
                String _get_5 = lsCmd.get(3);
                hosts.put(_get_4, _get_5);
              }
            }
          }
        }
      }
    }
    return hosts;
  }
  
  /**
   * Get all existing hosts.
   */
  private String getActiveHost() {
    Map<String, String> hosts = this.getHosts();
    Set<Map.Entry<String, String>> _entrySet = hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      String _value = entry.getValue();
      boolean _tripleEquals = (_value == "Running");
      if (_tripleEquals) {
        return entry.getKey();
      }
    }
    Set<String> _keySet = hosts.keySet();
    Iterator<String> _iterator = _keySet.iterator();
    String firstHost = _iterator.next();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The first host: ");
    _builder.append(firstHost, "");
    DockerUtilss.LOGGER.info(_builder.toString());
    Runtime _runtime = Runtime.getRuntime();
    boolean _startCmd = DockerMachineManager.startCmd(_runtime, firstHost);
    if (_startCmd) {
      return firstHost;
    }
    return null;
  }
  
  /**
   * Get all active hosts.
   */
  public Map<String, String> getActiveHosts() {
    Map<String, String> hosts = new HashMap<String, String>();
    Map<String, String> _hosts = this.getHosts();
    Set<Map.Entry<String, String>> _entrySet = _hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      String _value = entry.getValue();
      boolean _equalsIgnoreCase = _value.equalsIgnoreCase("Running");
      if (_equalsIgnoreCase) {
        String _key = entry.getKey();
        String _value_1 = entry.getValue();
        hosts.put(_key, _value_1);
      }
    }
    return hosts;
  }
  
  /**
   * Parse `docker-machine ls` command as table.
   */
  public String getEnv(final String machineName) {
    Runtime _runtime = Runtime.getRuntime();
    String data = DockerMachineManager.getEnvCmd(_runtime, machineName);
    List<List<String>> hosts = new ArrayList<List<String>>();
    List<String> result = new ArrayList<String>();
    String charset = "DOCKER_CERT_PATH";
    if ((data != null)) {
      String[] st = data.split("\\r?\\n");
      for (final String line : st) {
        if ((line.startsWith("export") && line.contains(charset))) {
          String[] _split = line.split("\\s+");
          List<String> lsCmd = Arrays.<String>asList(_split);
          hosts.add(lsCmd);
          String currentLine = lsCmd.get(1);
          String[] _split_1 = currentLine.split("=");
          List<String> _asList = Arrays.<String>asList(_split_1);
          result = _asList;
          String _get = result.get(1);
          return _get.replaceAll("\"", "");
        }
      }
    }
    return null;
  }
  
  /**
   * Delete a model.
   */
  private Boolean deleteAllOldModels() {
    File myFile = new File("Models");
    boolean _isDirectory = myFile.isDirectory();
    if (_isDirectory) {
      return Boolean.valueOf(myFile.delete());
    }
    return Boolean.valueOf(false);
  }
  
  /**
   * Transform InputStream into String.
   */
  private String asString(final InputStream response) {
    StringWriter logwriter = new StringWriter();
    try {
      LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
      while (itr.hasNext()) {
        {
          String line = itr.next();
          boolean _hasNext = itr.hasNext();
          if (_hasNext) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(line, "");
            _builder.newLineIfNotEmpty();
            logwriter.write(_builder.toString());
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(line, "");
            logwriter.write(_builder_1.toString());
          }
        }
      }
      response.close();
      return logwriter.toString();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    } finally {
      IOUtils.closeQuietly(response);
    }
  }
  
  /**
   * Parse String in order to detect if it is Integer.
   */
  private Boolean isInteger(final String value) {
    try {
      Integer.parseInt(value);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        return Boolean.valueOf(false);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return Boolean.valueOf(true);
  }
  
  /**
   * Get the OS.
   */
  private boolean isWindows() {
    int _indexOf = DockerUtilss.OS.indexOf("win");
    return (_indexOf >= 0);
  }
  
  private boolean isMac() {
    int _indexOf = DockerUtilss.OS.indexOf("mac");
    return (_indexOf >= 0);
  }
  
  private boolean isUnix() {
    return (((DockerUtilss.OS.indexOf("nix") >= 0) || (DockerUtilss.OS.indexOf("nux") >= 0)) || (DockerUtilss.OS.indexOf("aix") > 0));
  }
  
  private boolean isSolaris() {
    int _indexOf = DockerUtilss.OS.indexOf("sunos");
    return (_indexOf >= 0);
  }
  
  public String getOS() {
    boolean _isWindows = this.isWindows();
    if (_isWindows) {
      return "win";
    } else {
      boolean _isMac = this.isMac();
      if (_isMac) {
        return "osx";
      } else {
        boolean _isUnix = this.isUnix();
        if (_isUnix) {
          return "uni";
        } else {
          boolean _isSolaris = this.isSolaris();
          if (_isSolaris) {
            return "sol";
          } else {
            return "err";
          }
        }
      }
    }
  }
}
