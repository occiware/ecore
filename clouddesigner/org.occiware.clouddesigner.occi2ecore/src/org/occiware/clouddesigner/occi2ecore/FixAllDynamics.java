package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;

public final class FixAllDynamics {
	public static void main(String[] args) throws IOException {
		File current = new File(new File("").getAbsolutePath());
		File inputDir = new File(current.getParentFile().getParent()
				+ "\\metamodel");
		for (String dirName : inputDir.list()) {
			File dir = new File(inputDir, dirName);
			if (dir.isDirectory()) {
				File[] xmiFiles = dir.listFiles(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith(".xmi") || name.endsWith(".ocl");
					}
				});
				for (File file : xmiFiles) {
					String newPath =
					// current.getParentFile().getPath() +
					// "\\org.occiware.clouddesigner.occi.samples"
					current.getPath()
							+ "\\input"
							+ file.getPath().substring(
									inputDir.getPath().length());
					File newDir = new File(newPath.substring(0,
							newPath.length() - file.getName().length()));
					if (!newDir.exists()) {
						newDir.mkdir();
					}
					fixAndCopy(file, new File(newPath));
				}
			}
		}
	}

	public static void fixAndCopy(File inputFile, File outputFile)
			throws IOException {
		String content = ConverterUtils.readFileAsString(inputFile);
		if (inputFile.getName().endsWith(".xmi")) {
			content = content.replaceAll("../OCCI.ecore",
					"http://schemas.ogf.org/occi");
		}
		ConverterUtils.writeStringToFile(outputFile, content);
	}

}
