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
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.Output;

@SuppressWarnings("all")
public class ProcessManager {
  public static class OutputHandler extends ProcessManager.StreamHandler {
    private LinkedList<Byte> bytes;
    
    private Thread thread;
    
    private DataInputStream din;
    
    public OutputHandler(final InputStream inputStream) {
      super(inputStream, null);
      DataInputStream _dataInputStream = new DataInputStream(inputStream);
      this.din = _dataInputStream;
    }
    
    public String getData() {
      boolean _notEquals = (!Objects.equal(this.thread, null));
      if (_notEquals) {
        this.thread.interrupt();
      }
      try {
        this.thread.join();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      this.thread = null;
      byte[] array = ((byte[])Conversions.unwrapArray(CollectionLiterals.<Byte>newArrayList(), byte.class));
      array = ((byte[])Conversions.unwrapArray(this.bytes, byte.class));
      return new String(array);
    }
    
    public void handle() {
      final Runnable _function = new Runnable() {
        public void run() {
          try {
            LinkedList<Byte> _linkedList = new LinkedList<Byte>();
            OutputHandler.this.bytes = _linkedList;
            while (true) {
              try {
                byte _readByte = OutputHandler.this.din.readByte();
                OutputHandler.this.bytes.add(Byte.valueOf(_readByte));
              } catch (final Throwable _t) {
                if (_t instanceof Exception) {
                  final Exception e = (Exception)_t;
                  return;
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
            }
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      };
      Runnable r = _function;
      final Thread thread = new Thread(r);
      thread.start();
    }
  }
  
  public static class StreamHandler {
    private BufferedReader reader;
    
    private PrintWriter writer;
    
    public StreamHandler(final InputStream inputStream, final OutputStream outputStream) {
      InputStreamReader _inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
      this.reader = _bufferedReader;
      boolean _notEquals = (!Objects.equal(outputStream, null));
      if (_notEquals) {
        PrintWriter _printWriter = new PrintWriter(outputStream);
        this.writer = _printWriter;
      }
      this.handle();
    }
    
    public void handle() {
      final Runnable _function = new Runnable() {
        public void run() {
          try {
            while (true) {
              {
                final String message = StreamHandler.this.reader.readLine();
                boolean _equals = Objects.equal(message, null);
                if (_equals) {
                  return;
                }
                boolean _notEquals = (!Objects.equal(StreamHandler.this.writer, null));
                if (_notEquals) {
                  StreamHandler.this.writer.println(message);
                  StreamHandler.this.writer.flush();
                }
              }
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      final Runnable r = _function;
      try {
        final Thread thread = new Thread(r);
        thread.start();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.writer = null;
          this.reader = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  public static String getOutputCommand(final String command, final Runtime r) {
    StringBuffer result = new StringBuffer();
    try {
      final Process process = r.exec(command);
      InputStream _inputStream = process.getInputStream();
      final InputStreamReader input = new InputStreamReader(_inputStream);
      BufferedReader reader = new BufferedReader(input);
      String line = null;
      while ((!Objects.equal((line = reader.readLine()), null))) {
        result.append((line + "\n"));
      }
      reader.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return result.toString();
  }
  
  public static String getCommandOutput(final String command, final Runtime r, final boolean suppress) {
    try {
      Process process = r.exec(command);
      InputStream _inputStream = process.getInputStream();
      ProcessManager.OutputHandler out = new ProcessManager.OutputHandler(_inputStream);
      InputStream _errorStream = process.getErrorStream();
      new ProcessManager.StreamHandler(_errorStream, System.err);
      final int result = process.waitFor();
      InputOutput.<String>println(("Proces: " + Integer.valueOf(result)));
      String _data = out.getData();
      InputOutput.<String>println(_data);
      Output.flushErr();
      Output.flushOut();
      if ((!suppress)) {
        if ((result != 0)) {
          Output.printlnErr("Could not get output!");
        }
      }
      Output.flushOut();
      return out.getData();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        if ((!suppress)) {
          Output.printErr("An Error occurred: ");
          e.printStackTrace();
        }
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public static boolean runCommand(final String command, final Runtime r, final boolean output) {
    try {
      final Process process = r.exec(command);
      if (output) {
        InputStream _inputStream = process.getInputStream();
        new ProcessManager.StreamHandler(_inputStream, System.out);
      } else {
        InputStream _inputStream_1 = process.getInputStream();
        new ProcessManager.StreamHandler(_inputStream_1, null);
      }
      InputStream _errorStream = process.getErrorStream();
      new ProcessManager.StreamHandler(_errorStream, System.err);
      final int result = process.waitFor();
      Output.flushErr();
      Output.flushOut();
      return (result == 0);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return false;
  }
  
  public static boolean runCommand(final String[] args, final Runtime r, final boolean output) {
    try {
      final Process process = r.exec(args);
      if (output) {
        InputStream _inputStream = process.getInputStream();
        new ProcessManager.StreamHandler(_inputStream, System.out);
      } else {
        InputStream _inputStream_1 = process.getInputStream();
        new ProcessManager.StreamHandler(_inputStream_1, null);
      }
      InputStream _errorStream = process.getErrorStream();
      new ProcessManager.StreamHandler(_errorStream, System.err);
      final int result = process.waitFor();
      return (result == 0);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return false;
  }
}
