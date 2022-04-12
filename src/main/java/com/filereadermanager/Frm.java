package com.filereadermanager;

import com.configuration.reader.Config_Reader;

public class Frm {
	private Frm() {
		
	}
	public static Frm get_instance_FRM() {
		Frm frmobj = new Frm();
		return frmobj;
	}
	
	public Config_Reader get_instance_CR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;
	}	
}
