package com.testNG.features_new;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {
	@Test(enabled = false)
	private void books() {
		System.out.println("Books");
	}
	@Test(priority=1)
	private void Instagram() {
		System.out.println("Instagram");
	}
	@Test(priority = -2)
	private void Spotify() {
		System.out.println("Spotify");		
	}
	@Ignore
	@Test(priority=0)
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(priority=-1)
	private void wynkmusic() {
		System.out.println("Wynk Music");
	}
}
