package com.testNG.features_new;

import org.testng.annotations.Test;

public class Multi_Threading {
	
	@Test
	private void username() {
		System.out.println("Username");
	}
	@Test
	private void password() {
		System.out.println("Password");
	}
}
