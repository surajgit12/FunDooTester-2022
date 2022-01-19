package com.qa.studentApiTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import com.qa.apiConfigs.APIPath;
import com.qa.apiConfigs.HeadersConfig;
import com.qa.baseTest.BaseTest;
import com.qa.pojo.SerializationPostPojo;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializationWithArrayListAndObject extends BaseTest {
	

	HeadersConfig header = new HeadersConfig();
	
	ArrayList<String> courses =new ArrayList<String>(List.of("Selenium", "Java","API"));
	
	SerializationPostPojo pojo = new SerializationPostPojo(27, "Rakul", "Singh", "Rakul@.com", "QA",courses);
	
	@Test
	public void SerTest2() {
	
		Response response = RestAssured.given().when().headers(header.defaultHeaders())
		.body(pojo)
		.when().post(APIPath.apipath.CREATE_USER);
		
		System.out.println(response.getBody().asString());
		
	}



}
