/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util

import java.io.BufferedReader
import java.io.DataInputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.PrintWriter
import java.util.LinkedList
import java.io.IOException

class ProcessManager {

	def static String getOutputCommand(String command, Runtime r) {

		var StringBuffer result = new StringBuffer
		var String[] env = null
		try {
			if (DockerUtil.getOS.equalsIgnoreCase("osx") || DockerUtil.getOS.equalsIgnoreCase("uni")) {
				env = #["/bin/bash", "-c", command]
			} else if(DockerUtil.getOS.equalsIgnoreCase("win")){
				env = #["cmd", "/c", command]
			}
			//val String[] env = #["/bin/bash", "-c", command]
			val Process process = r.exec(env)
			val input = new InputStreamReader(process.inputStream)
			var BufferedReader reader = new BufferedReader(input)
			var String line
			while ((line = reader.readLine()) != null) {
				result.append(line + "\n")
			}
			reader.close
		} catch (IOException e) {
			e.printStackTrace()
		}

		return result.toString

	}

	def static String getCommandOutput(String command, Runtime r, boolean suppress) {
		try {
			var String[] env = #["/bin/bash", "-c", command]
			var Process process = r.exec(env)
			var OutputHandler out = new OutputHandler(process.inputStream)
			new StreamHandler(process.errorStream, System.err)
			val int result = process.waitFor
			println("Proces: " + result)
			println(out.getData())

			Output.flushErr
			Output.flushOut

			if (!suppress) {
				if (result != 0) {
					Output.printlnErr("Could not get output!")
				}
			}

			Output.flushOut()

			return out.getData()
		} catch (Exception e) {
			if (!suppress) {
				Output.printErr("An Error occurred: ")
				e.printStackTrace()
			}
		}

		return null;
	}

	def static boolean runCommand(String command, Runtime r, boolean output) {
		try {
			val Process process = r.exec(command);
			if (output) {
				new StreamHandler(process.getInputStream(), System.out)
			} else {
				new StreamHandler(process.getInputStream(), null)
			}
			new StreamHandler(process.getErrorStream(), System.err)
			val int result = process.waitFor()

			Output.flushErr
			Output.flushOut

			return result == 0;
		} catch (Exception e) {
		}

		return false

	}

	def static boolean runCommand(String[] args, Runtime r, boolean output) {
		try {
			val Process process = r.exec(args);
			if (output) {
				new StreamHandler(process.getInputStream, System.out)

			} else {
				new StreamHandler(process.getInputStream, null)
			}
			new StreamHandler(process.getErrorStream, System.err)
			val int result = process.waitFor
			return result == 0;
		} catch (Exception e) {
		}

		return false;
	}

	static class OutputHandler extends StreamHandler {
		LinkedList<Byte> bytes
		Thread thread
		DataInputStream din

		new(InputStream inputStream) {
			super(inputStream, null)
			this.din = new DataInputStream(inputStream)

		// this.reader = null
		// this.writer = null
		}

		def getData() {
			if (thread != null) {
				thread.interrupt()
			}

			try {
				thread.join();
			} catch (Exception e) {
			}
			thread = null;
			var byte[] array = newArrayList
			array = bytes
			return new String(array)
		}

		override handle() {
			var Runnable r = [
				try {
					this.bytes = new LinkedList<Byte>()
					while (true) {
						try {
							this.bytes.add(this.din.readByte)
						} catch (Exception e) {
							return;
						}
					}

				} catch (Exception e) {
				}
			]
			val thread = new Thread(r)
			thread.start
		}
	}

	static class StreamHandler {
		BufferedReader reader
		PrintWriter writer

		new(InputStream inputStream, OutputStream outputStream) {
			this.reader = new BufferedReader(new InputStreamReader(inputStream))

			if (outputStream != null) {
				this.writer = new PrintWriter(outputStream)
			}

			handle
		}

		def void handle() {
			val Runnable r = [
				while (true) {
					val String message = reader.readLine()
					if (message == null) {
						return;
					}
					if (writer != null) {
						writer.println(message)
						writer.flush()
					}

				}
			]
			try {
				val thread = new Thread(r)
				thread.start
			} catch (Exception e) {
				writer = null
				reader = null
			}

		}
	}

	def static void main(String[] args) {
		val command = " docker-machine ls"
		val p = ProcessManager.getOutputCommand(command, Runtime.getRuntime())
		println(p)
	}

}
