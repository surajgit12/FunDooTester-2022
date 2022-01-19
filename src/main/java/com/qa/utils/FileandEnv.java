package com.qa.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnv {

	public static Map<String, String> fileandEnv = new HashMap<String, String>();

	public static Properties propMain = new Properties();

	public static Properties propPreSet = new Properties();

	public static Map<String, String> envAndFile() // this will going to written me a Map object of all the data which
													// ever I used in property file.
	{
		// So whenever we are running the place from particular enviroment ,
		// so VM argument we have to pass this as env and we have to pass enviroment
		// name. this will check while running test

		String enviroment = System.getProperty("env");

		try {
			if (enviroment.equalsIgnoreCase("dev")) {

				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
				propMain.load(fisDev);
				fileandEnv.put("serverURl", propMain.getProperty("serverURl"));
				fileandEnv.put("portNo", propMain.getProperty("portNo"));
				fileandEnv.put("username", propMain.getProperty("username"));
				fileandEnv.put("password", propMain.getProperty("password"));

			} else if (enviroment.equalsIgnoreCase("qa")) {

				FileInputStream fisQa = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
				propMain.load(fisQa);
				fileandEnv.put("serverURl", propMain.getProperty("serverURl"));
				fileandEnv.put("portNo", propMain.getProperty("portNo"));
				fileandEnv.put("username", propMain.getProperty("username"));
				fileandEnv.put("password", propMain.getProperty("password"));

			} else if (enviroment.equalsIgnoreCase("staging")) {

				FileInputStream fisStaging = new FileInputStream(
						System.getProperty("user.dir") + "/inputs/staging.properties");
				propMain.load(fisStaging);
				fileandEnv.put("serverURl", propMain.getProperty("serverURl"));
				fileandEnv.put("portNo", propMain.getProperty("portNo"));
				fileandEnv.put("username", propMain.getProperty("username"));
				fileandEnv.put("password", propMain.getProperty("password"));
			}

		} catch (Exception e) {

		}

		return fileandEnv;

	}
	
	public static Map<String, String> getConfigReader(){
		if(fileandEnv== null) {
			fileandEnv=envAndFile();
		}
		
		
		return fileandEnv;
	}

}
