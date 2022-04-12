package com.configuration.reader;

public class Frm2 {
	//Private Constructor
	private Frm2() {
		
	}
	//Static method
	public static Frm2 get_Instance_Frm() {
		Frm2 ref = new Frm2();
		return ref;
	}
	//Non-Static Method
	public Configuration_Reader get_Instance_CR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
}
