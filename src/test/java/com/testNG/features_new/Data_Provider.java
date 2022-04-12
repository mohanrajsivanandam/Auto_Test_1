package com.testNG.features_new;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "test_data",groups = "B")
	private void adactin_Runner(@Optional("Mohan") String username,@Optional("1234") int password) {
		System.out.println("Adactin Username: "+username);
		System.out.println("Adactin Password: "+password);
	}
	@Test(dataProvider = "test_data", groups="Z")
	private void mohan(String username, int password) {
		System.out.println("Username: "+username);
		System.out.println("Password"+password);
	}
	@Test(dataProvider = "test_dat", groups = "A")
	private void automation_Runner(String username, int password) {
		System.out.println("Automation Username: "+username);
		System.out.println("Automation Password: "+password);
	}
	@DataProvider
	private Object[][] test_data() {
		return new Object [] [] {
			{"Mark",123},
			{"Stark",1234},
			{"Steve",12345}
		};
	}
	
	@DataProvider
	private Object[][] testtttt() {
		return new Object[][] {
			{"username",8778676},
			{},
			{},
			{}		
		};
	}
	
	
	@DataProvider
	private Object[][] test_dat() {
		return new Object [] [] {
			{"Wayne", 123},
			{"Mwayne", 1234},
			{"Ma. Wayne",123455}			
		};
	}
	@Test(groups = "C")
	private void gog1() {
		System.out.println("Gog1");
	}
	@Test(groups = "C")
	private void gog2() {
		System.out.println("Gog2");
	}
}