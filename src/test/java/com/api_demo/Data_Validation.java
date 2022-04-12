package com.api_demo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	@Test
	public void data_validation() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");	
		String string = response.asString();
		System.out.println(string); //Response print - after clicking
		
		int actual = response.getStatusCode();
		System.out.println(actual);
		
		ResponseBody body2 = response.getBody();
		String asString = body2.asString();
		System.out.println(asString);
		
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		
		Calendar instance = Calendar.getInstance();
		Date time = instance.getTime();
		System.out.println(time);
		
		long timeIn = response.getTimeIn(TimeUnit.MILLISECONDS);
		System.out.println(timeIn);
		
		String sessionId = response.getSessionId();
		System.out.println(sessionId);
		
		Assert.assertEquals(200, actual);
		System.out.println("Data Validated Successfully");
	}
}