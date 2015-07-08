package org.occiware.clouddesigner.dependencies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FeatureBuilder {

	private static final String PLUGINS_DECLARATION_TAG = "%PLUGINS_DECLARATION";
	private static final String TARGET_LINE_START = "<stringAttribute key=\"selected_target_plugins\" value=\"";
	private static final String WORKSPACE_PATH = new File(new File("").getAbsolutePath()).getParent();

	public static void main(String[] args) throws IOException {
		// get arguments
		String launchFilePath = WORKSPACE_PATH + args[0];
		String featureFilePath = WORKSPACE_PATH + args[1];

		// load template
		String templateFile = FeatureBuilder.class.getResource("feature.xml.template").toExternalForm().toString()
				.replaceFirst("file:/", "");
		byte[] encoded = Files.readAllBytes(Paths.get(templateFile));
		String template = new String(encoded);

		// read launch config & prepare declaration
		StringBuffer pluginsDeclaration = new StringBuffer();
		String line;
		BufferedReader br = new BufferedReader(new FileReader(launchFilePath));
		while ((line = br.readLine()) != null) {
			if (line.startsWith(TARGET_LINE_START)) {
				String pluginsField = line.replaceFirst(TARGET_LINE_START, "");
				pluginsField = pluginsField.replaceAll("\"/>", "");
				String[] pluginsList = pluginsField.split(",");

				for (String plugin : pluginsList) {
					if (!plugin.contains("win32")) {
						String pluginName = plugin.split("@")[0];
						String pluginVersion = "0.0.0";
						if (pluginName.contains("*")) {
							pluginVersion = pluginName.split("\\*")[1];
							pluginName = pluginName.split("\\*")[0];
						}
						pluginsDeclaration.append(
								"\t<plugin id=\"" + pluginName + "\" download-size=\"0\" install-size=\"0\" version=\""
										+ pluginVersion + "\" unpack=\"false\"/>\n");
					}
				}

				break;
			}
		}
		br.close();

		// write feature
		template = template.replaceFirst(PLUGINS_DECLARATION_TAG, pluginsDeclaration.toString());
		PrintWriter out = new PrintWriter(featureFilePath);
		out.write(template);
		out.close();

	}

}
