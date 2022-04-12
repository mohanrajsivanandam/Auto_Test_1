package com.configuration.reader;

public class File_Reader_Manager {
	//SDP
	
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	public static File_Reader_Manager get_Instance_FRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
		
	}
	
	public Configuration_Reader get_Instance_CR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
//		reader.get_Config_email();
//		reader.get_Config_Url();
//		reader.get_Config_Pass();
		return reader;
	}
	
	
}
