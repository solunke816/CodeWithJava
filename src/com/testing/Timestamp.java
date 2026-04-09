package com.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp{
	
	public static void main(String args []) {
		
		String time= new SimpleDateFormat("YYYY_dd_MM_mm.ss").format(new Date());
		System.out.println("Current time is "+time);
	}
	
}