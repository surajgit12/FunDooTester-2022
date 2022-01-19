package com.qa.builders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuilders {
	
	public Map<String, String> postRequestBody(String firstname ,String lastname, String id, String SubjectId) {
		Map<String, String> body = new HashMap<String, String>();
		body.put("first_name", firstname);
		body.put("last_name", lastname);
		body.put("id", id);
		body.put("subjectId",SubjectId);
		return body;

	}

}
