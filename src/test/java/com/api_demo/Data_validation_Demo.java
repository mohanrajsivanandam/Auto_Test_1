package com.api_demo;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_validation_Demo {
	@Test
	public void data_validation() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		System.out.println(request);
		Response r = request.get("api/users");
		String asString = r.asString();
		System.out.println(asString);
		
		int statusCode = r.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = r.getBody();
		String asString2 = body.asString();
		System.out.println(asString2);
		
	}
}
