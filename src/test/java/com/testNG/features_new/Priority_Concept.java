package com.testNG.features_new;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = -1)
	private void username() {
		System.out.println("User Name");
	}
	
	@Test(priority = 0)
	private void password() {
		System.out.println("Password");
	}
	@Test (priority = +1)
	private void login() {
		System.out.println("Login");
	}
	
}
