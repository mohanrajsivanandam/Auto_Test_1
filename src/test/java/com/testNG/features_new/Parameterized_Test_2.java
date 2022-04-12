package com.testNG.features_new;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test_2 {

	@Test
	@Parameters({"username","passwd"})
	private void credential(@Optional("Mark") String username, @Optional("54321@543") String passwd) {
		System.out.println("Username: "+username);
		System.out.println("Password: "+passwd);
	}
}