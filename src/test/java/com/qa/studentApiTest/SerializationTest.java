package com.qa.studentApiTest;

import org.testng.annotations.Test;

import com.qa.apiConfigs.APIPath;
import com.qa.apiConfigs.HeadersConfig;
import com.qa.apiVerifications.APIVerifications;
import com.qa.baseTest.BaseTest;
import com.qa.builders.PostAPIBuilders;
import com.qa.pojo.PostAPIPojo;
import com.qa.utils.JavaUtilis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializationTest extends BaseTest {
	
	
	HeadersConfig header = new HeadersConfig();
	PostAPIPojo pojo = new PostAPIPojo("Sun", "Set", 13, 21);
	

	
	@Test
	public void serTest1() {
		
		Response response = RestAssured.given().when().headers(header.defaultHeaders())
		.body(pojo)
		.when().post(APIPath.apipath.CREATE_USER);
		
		System.out.println(response.getBody().asString());
	}

}
