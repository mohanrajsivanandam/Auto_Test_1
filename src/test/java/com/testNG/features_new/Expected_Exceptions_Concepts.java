package com.testNG.features_new;

import org.testng.annotations.Test;

public class Expected_Exceptions_Concepts {
	
@Test(expectedExceptions = ArithmeticException.class)
private void calculator() {
	int a = 10;
	System.out.println(a/0);
	System.out.println("Display the output");
}
}