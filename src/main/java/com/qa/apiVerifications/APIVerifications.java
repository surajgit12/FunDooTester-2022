package com.qa.apiVerifications;

import com.qa.utils.ExtentReportListner;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

public class APIVerifications extends ExtentReportListner {

	public static void responseStatusCodeValidations(Response response, int StatusCode) {

		try {

			Assert.assertEquals(StatusCode, response.getStatusCode());
			test.log(LogStatus.PASS, "Successfully validate StatusCode, Status Code is :: " + response.getStatusCode());

		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());

			test.log(LogStatus.FAIL, "Expected Status Code is " + StatusCode,
					" instead of getting :: " + response.getStatusCode());

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}

	public static void responseKeyValidationfromArray(Response response, String key) {

		try {
			JSONArray array = new JSONArray(response.getBody().asString()); // Convert our response in JSON array
			for (int i = 0; i < array.length(); i++) {
				// test.log(LogStatus.INFO, "Response array is " +array.get(i));
				JSONObject obj = array.getJSONObject(i); // Convert array to JSON object

				test.log(LogStatus.PASS, "Response values is " + obj.get(key));
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());

		}
	}

	public static void responseKeyValidationfromJSON(Response response, String key) {

		try {
			JSONObject json = new JSONObject(response.body().asString());
			if (json.has(key) && json.get(key) != null) {
				test.log(LogStatus.INFO, "Successfully validated value of " + key + "It is" + json.get(key));
			} else {
				test.log(LogStatus.FAIL, "Key is not available");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}

	}

	public static void responseTimeValidations(Response response) {

		try {
			long time = response.time();

			test.log(LogStatus.INFO, "API Response time is.." + time);

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());

		}
	}

	public static void responseBodyValidation(Response response) {

		try {
			String responseBody = response.body().asString();
			test.log(LogStatus.PASS, "API Response Body is.." + responseBody);

		} catch (Exception e) {

			test.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	public static void responseHeaderValidation(Response response, String ContentType) {

		try {
			String responseHeader = response.header(ContentType);

			if (responseHeader.contains("application/json; charset=utf-8")) {

				test.log(LogStatus.PASS, "API Response Header value is .." + responseHeader);
			} else {
				test.log(LogStatus.FAIL, "Header value is not matched---->" + responseHeader);
			}

		} catch (Exception e) {

			test.log(LogStatus.FAIL, e.fillInStackTrace());

		}
	}
}