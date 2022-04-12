package com.testNG.features_new;

import org.testng.annotations.Test;

public class Grouping_Concepts {
	@Test(priority = 5,groups = "Books")
	private void books() {
		System.out.println("Books");
	}
	@Test(priority=0,groups = "Social Media")
	private void Instagram() {
		System.out.println("Instagram");
	}
	@Test(priority=-1,groups = "Social Media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(priority = 1,groups = "Music")
	private void Spotify() {
		System.out.println("Spotify");		
	}
	@Test(priority = 2,groups = "Music")
	private void wynkmusic() {
		System.out.println("Wynk Music");
	}
}
