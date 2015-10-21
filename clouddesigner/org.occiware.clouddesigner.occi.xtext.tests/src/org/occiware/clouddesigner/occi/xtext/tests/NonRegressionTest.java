package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

public class NonRegressionTest implements FileFilter {
	private File current = null;
	private static Collection<String> ignored = new ArrayList<String>();

	static {
		 ignore("clouddesigner");
	}

	@Test
	public void test() throws IOException {
		for (File test : new File("data/input").listFiles(this)) {
			if (test.isDirectory()) {
				for (File file : test.listFiles(this)) {
					current = file;
					String fileName = file.getName();
					String expectedPath = null;
					String actualPath = null;
					if (fileName.endsWith(".occie.txt") || fileName.endsWith(".occic.txt")) {
						expectedPath = file.getPath().replaceAll(".txt", "");
						actualPath = expectedPath.replaceAll("input", "output");
						log("Parsing " + file + " to " + actualPath);
						XTextUtils.parse(URI.createURI(file.getPath()), URI.createURI(actualPath));
					} else if (fileName.endsWith(".occie") || fileName.endsWith(".occic")) {
						expectedPath = file.getPath() + ".txt";
						actualPath = expectedPath.replaceAll("input", "output");
						log("Serializing " + file + " to " + actualPath);
						XTextUtils.serialize(URI.createURI(file.getPath()), URI.createURI(actualPath));
					}
					log("Comparing " + expectedPath + " with " + actualPath);
					Assert.assertEquals(current.getPath(), XTextUtils.getFileAsString(new File(expectedPath)),
							XTextUtils.getFileAsString(new File(actualPath)));
				}
			}
		}
	}

	protected static void ignore(String test) {
		ignored.add("data\\input\\" + test);
	}

	protected static void ignore(String test, String file) {
		ignored.add("data\\input\\" + test + "\\" + file);
	}

	protected void log(String msg) {
		System.out.println(msg);
	}

	@Override
	public boolean accept(File pathname) {
		System.err.println(pathname);
		return !ignored.contains(pathname.toString());
	}
}
