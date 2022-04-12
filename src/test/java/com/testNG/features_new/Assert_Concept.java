package com.testNG.features_new;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	@Test
	private void username() {
		String actualun = "Mohan";
		String expectedun = "Mohan";
		
		
		
//		Assert.assertNotNull(expectedun);
//		System.out.println("Test Passed");
//		
	//	Assert.assertSame(actualun, expectedun);
		//Assert.assertFalse(actualun);
		
		
//		
//		if (actualun.equals(expectedun)) {
//			System.out.println("Passed");
//		}else {
//			System.out.println("Check");
//		}
	
	//-----------------------------------SoftAssert------------------------
	
		SoftAssert soft = new SoftAssert();
		
		soft.assertAll();
//		soft.assertEquals(actualun, expectedun);
//		System.out.println("Test Passed");
//		
	
	}
}
