package com.qa.functional;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.BaseMatcher.*;
import static org.hamcrest.Matchers.hasXPath;
import org.testng.annotations.Test;

public class GetRequest {

	@Test
	public void testGetRequest() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		Response response = RestAssured.given().param("page", 2).when().get();
		System.out.println(response.asString());
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.contentType());
		System.out.println(response.getTime());
		System.out.println(response.getCookies());
		
		System.out.println(response.prettyPrint());
		
		
		/*
		 * RestAssured.baseURI = "https://reqres.in/api/users";
		 * RestAssured.given().param("page", 2) .when() .get() .then() .assertThat()
		 * .log().all() .statusCode(200);
		 */
	}

}
