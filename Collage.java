package com.vstl.oopsSuperKeywordExample;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Collage {
	
	//Super:- it is reference variable which is used to refer immediate parent class object.
	//* super can be used to refer immediate parent class instance variable.
	
	String strCollageName = "Shivanand Collage";
	int intTotalStudents = 500;
	String strStudentFirstName = "Rohini";
	String strStudentLastName = "Donawade";
		
	public void getCollageName(String strName) {
		strCollageName = strName;
		System.out.println("Collage name is :" +strName);		
	}
	

	//*super can used to invoke immediate parent class method.
	
	public void getCollageTotalStudent(int intStudents) {
		intTotalStudents= intStudents;
		System.out.println("Total students :" +intStudents);		
	}
	
	//*it is used to invoke immediate parent class constructor
	
/*	public Collage(String strFirstName, String strLastName) {
		strStudentFirstName = strFirstName;
		System.out.println("Student First name :" +strFirstName);
		
		strStudentLastName = strLastName;
		System.out.println("Student last name : " +strLastName);			
	}    */
	











TimeZone.setDefault(TimeZone.getTimeZone("zoneid"));
String date_format = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(Calendar.getInstance().getTime());	
Date zonedate = new Date(5);
String current_date_time = date_format.formatted(zonedate);
 System.out.println(current_date_time);
return current_date_time; 
