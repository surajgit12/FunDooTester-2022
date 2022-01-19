package com.qa.baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import com.qa.utils.ExtentReportListner;
import com.qa.utils.FileandEnv;
import io.restassured.RestAssured;

@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner {
	

	@BeforeClass
	public void baseTest() {
		
		System.out.println(" FileandEnv.envAndFile().get(\"serverURl\")" +  FileandEnv.envAndFile().get("serverURl"));
		
		RestAssured.baseURI = FileandEnv.envAndFile().get("serverURl");
	
		
	}
	
}
