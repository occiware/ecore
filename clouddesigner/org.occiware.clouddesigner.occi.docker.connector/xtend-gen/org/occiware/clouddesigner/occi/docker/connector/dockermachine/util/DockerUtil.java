/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util;

import com.google.common.base.Objects;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;

@SuppressWarnings("all")
public class DockerUtil {
  public static JsonNode jsonify(final String jsonString) {
    try {
      boolean _or = false;
      boolean _notEquals = (!Objects.equal(jsonString, null));
      if (_notEquals) {
        _or = true;
      } else {
        boolean _equals = Objects.equal(jsonString, "");
        _or = _equals;
      }
      if (_or) {
        final ObjectMapper mapper = new ObjectMapper();
        final JsonFactory factory = mapper.getJsonFactory();
        final JsonParser parser = factory.createJsonParser(jsonString);
        final JsonNode node = mapper.readTree(parser);
        return node;
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Map<String, String> getHosts() {
    Runtime _runtime = Runtime.getRuntime();
    final String data = DockerMachineManager.listHostCmd(_runtime);
    Map<String, String> hosts = new HashMap<String, String>();
    boolean _notEquals = (!Objects.equal(data, null));
    if (_notEquals) {
      String[] st = data.split("\\r?\\n");
      int _length = st.length;
      final String[] list = Arrays.<String>copyOfRange(st, 1, _length);
      for (final String line : list) {
        {
          String l = line;
          String _replaceAll = l.replaceAll("\\*", "");
          l = _replaceAll;
          final String[] lsCmd = l.split("\\s+");
          boolean _and = false;
          int _length_1 = lsCmd.length;
          boolean _greaterEqualsThan = (_length_1 >= 3);
          if (!_greaterEqualsThan) {
            _and = false;
          } else {
            int _length_2 = lsCmd.length;
            boolean _lessThan = (_length_2 < 5);
            _and = _lessThan;
          }
          if (_and) {
            String _get = lsCmd[0];
            String _get_1 = lsCmd[2];
            hosts.put(_get, _get_1);
          } else {
            int _length_3 = lsCmd.length;
            boolean _greaterEqualsThan_1 = (_length_3 >= 5);
            if (_greaterEqualsThan_1) {
              String _get_2 = lsCmd[0];
              String _get_3 = lsCmd[3];
              hosts.put(_get_2, _get_3);
            }
          }
        }
      }
    }
    return hosts;
  }
  
  public static String getActiveHost() {
    final Map<String, String> hosts = DockerUtil.getHosts();
    Set<Map.Entry<String, String>> _entrySet = hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      String _value = entry.getValue();
      boolean _equals = Objects.equal(_value, "Running");
      if (_equals) {
        return entry.getKey();
      }
    }
    Set<String> _keySet = hosts.keySet();
    final String firstHost = ((String[])Conversions.unwrapArray(_keySet, String.class))[0];
    InputOutput.<String>println(("first host" + firstHost));
    Runtime _runtime = Runtime.getRuntime();
    boolean _startCmd = DockerMachineManager.startCmd(_runtime, firstHost);
    if (_startCmd) {
      return firstHost;
    }
    return null;
  }
  
  public static Map<String, String> getActiveHosts() {
    Map<String, String> hosts = new HashMap<String, String>();
    Set<Map.Entry<String, String>> _entrySet = hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      String _value = entry.getValue();
      boolean _equals = Objects.equal(_value, "Running");
      if (_equals) {
        String _key = entry.getKey();
        String _value_1 = entry.getValue();
        hosts.put(_key, _value_1);
      }
    }
    return hosts;
  }
  
  public static String getEnv(final String machineName) {
    Runtime _runtime = Runtime.getRuntime();
    final String data = DockerMachineManager.getEnvCmd(_runtime, machineName);
    List<String[]> hosts = new ArrayList<String[]>();
    String[] result = null;
    boolean _notEquals = (!Objects.equal(data, null));
    if (_notEquals) {
      String[] st = data.split("\\r?\\n");
      for (final String line : st) {
        boolean _startsWith = line.startsWith("export");
        if (_startsWith) {
          final String[] lsCmd = line.split("\\s+");
          hosts.add(lsCmd);
        }
      }
      String[] _get = hosts.get(1);
      String currentLine = ((String[]) _get)[1];
      String[] _split = currentLine.split("=");
      result = _split;
    }
    String _get_1 = result[1];
    return _get_1.replaceAll("\"", "");
  }
  
  public boolean deleteAllOldModels() {
    boolean _xblockexpression = false;
    {
      final File myFile = new File("Models");
      boolean _xifexpression = false;
      boolean _isDirectory = myFile.isDirectory();
      if (_isDirectory) {
        _xifexpression = myFile.delete();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String asString(final InputStream response) {
    final StringWriter logwriter = new StringWriter();
    try {
      final LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
      while (itr.hasNext()) {
        {
          String line = itr.next();
          boolean _hasNext = itr.hasNext();
          if (_hasNext) {
            logwriter.write((line + "\n"));
          } else {
            logwriter.write((line + ""));
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
  
  public static boolean isInteger(final String value) {
    try {
      Integer.parseInt(value);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }
}
