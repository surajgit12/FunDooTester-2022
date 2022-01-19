package com.qa.studentApiTest;

import org.testng.annotations.Test;
import com.qa.apiConfigs.APIPath;
import com.qa.apiVerifications.APIVerifications;
import com.qa.baseTest.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest {

	@Test
	public void getAPITests() {

		// RestAssured.given().when().get(APIPath.apipath.GET_LIST_OF_USERS).then().log().all();

		test.log(LogStatus.INFO, "My Test is starting.......");

		Response response = RestAssured.given().when().get(APIPath.apipath.GET_LIST_OF_USERS);

		APIVerifications.responseStatusCodeValidations(response, 200);
		APIVerifications.responseKeyValidationfromArray(response,"first_name");
		APIVerifications.responseTimeValidations(response);
		APIVerifications.responseBodyValidation(response);
		APIVerifications.responseHeaderValidation(response,"Content-Type");
		
	//	System.out.println(response.body().asString());
		
		test.log(LogStatus.INFO, "My Test is Ended.......");

	}
}
