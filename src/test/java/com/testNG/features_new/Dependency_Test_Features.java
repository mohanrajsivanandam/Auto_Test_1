package com.testNG.features_new;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Test_Features {
	@Test
	private void mobile() {
		System.out.println("Mobile");
	}
	@Test(dependsOnMethods = "watch")
	private void offer() {
		System.out.println("OFfer");
	}
	//@Ignore
	@Test
	private void watch() {
		System.out.println("Watch");
	}//Prints in ASCII Value order - Alphabetical order
	@Test(dependsOnMethods = "offer")
	private void suboffer() {
		System.out.println("Sub-Offer");
	}
}