package com.testNG.features_new;

import java.net.URL;

import org.testng.annotations.Test;

public class Invocation_count_concept {
	@Test(priority = -1)
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	@Test(priority = 0)
	private void url() {
		System.out.println("URL");
	}
	@Test(priority = 1,invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh");
	}
	@Test(priority = 2)
	private void credentials() {
		System.out.println("Credentials");
	}
}
