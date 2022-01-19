package com.qa.apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeadersConfig {

	/*
	 * If there is a GET API so there will be headers and Params If there is a POST
	 * API so there will be headers and body
	 */

	public Map<String, String> defaultHeaders() {
		Map<String, String> defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "application/json");
		return defaultHeader;

	}

	public Map<String, String> headersWithToken() {
		Map<String, String> defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "application/json");
		defaultHeader.put("Access_Token", "sdfsfdsfsfdsdsf");
		defaultHeader.put("jwt_Token", "sdfsfdfsfsfdssfsfsdfdsf");
		defaultHeader.put("Telent_user", "test");
		return defaultHeader;

	}

}
