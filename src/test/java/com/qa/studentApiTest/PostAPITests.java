package com.qa.studentApiTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.qa.apiConfigs.APIPath;
import com.qa.apiConfigs.HeadersConfig;
import com.qa.apiVerifications.APIVerifications;
import com.qa.baseTest.BaseTest;
import com.qa.builders.PostAPIBuilders;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import com.qa.utils.JavaUtilis;

public class PostAPITests extends BaseTest{
	
	@Test
	public void PostAPITests() {
		
		test.log(LogStatus.INFO, "My Test is starting.......");

		JavaUtilis utils = new JavaUtilis();
		
		HeadersConfig header = new HeadersConfig();
		
		PostAPIBuilders builder = new PostAPIBuilders();
		
		// To generate Random interger values
		
		
		 Response response = RestAssured.given().when().headers(header.defaultHeaders())
		.body(builder.postRequestBody(JavaUtilis.randomString(),JavaUtilis.randomString(),JavaUtilis.randomNumber(),JavaUtilis.randomSubjectNumber())) // we have 4 inputs for post request 
		.when()
		.post(APIPath.apipath.CREATE_USER);
		
		//System.out.println(response.getBody().asString());
		//System.out.println(response.statusCode());
		
		APIVerifications.responseStatusCodeValidations(response, 201);
	    APIVerifications.responseKeyValidationfromJSON(response, "first_name");
		
		test.log(LogStatus.INFO, "My Test is Ended.......");
		
	}

}
