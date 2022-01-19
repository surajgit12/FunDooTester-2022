package com.qa.utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaUtilis {

	public static String randomNumber() {

		Random randomid = new Random(); // to generate random fly id
		int randomNumber = randomid.nextInt(1000);
		String id = Integer.toString(randomNumber);
		return id;
	}
	
	public static String randomSubjectNumber() {

		Random randomid = new Random(); // to generate random fly id
		int randomNumber = randomid.nextInt(1000);
		String subjectid = Integer.toString(randomNumber);
		return subjectid;
	}
	
	

	public static String randomString() {

		String randomString = RandomStringUtils.randomAlphabetic(8);
		return randomString;

	}
}
