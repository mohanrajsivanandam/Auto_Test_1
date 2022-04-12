package com.testNG.features_new;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	@Test(dataProvider="testi")
	@Parameters({"username","password"})//inside the @Test
	private void credentials(@Optional ("Smith") String username, @Optional ("123") String password) {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);		
	}	
	//https://giaccolo
	@DataProvider
	private Object[][] dataprov() {
		return new Object[][] {
			{"Mohan","123"},
			{"Jeni","345"}
		};
	}
	@DataProvider
	private Object [][] testi() {
		return new Object[][] {
			
			{"Mark","123"},
			{"Josh","456"},
			{"John","12345"}			
		};
	}
}