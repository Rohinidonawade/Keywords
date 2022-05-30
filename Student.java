package com.vstl.oopsSuperKeywordExample;

public class Student extends Collage {
	
	
	public void getCollageName(String strName) {
		strName = super.strCollageName;
		System.out.println("Collage name is :" +strName);		
	}
	
	public void getCollageTotalGirls(int intGirlsStudent) {
		intGirlsStudent= super.intTotalStudents;
		System.out.println("Total students :" +intGirlsStudent);		
	}
	
	public void getCollageTotalStudentList() {
		super.getCollageTotalStudent(500);
	}
	
/*	public Student(String strFirstName, String strLastName) {
		super("Rohini", "Donawade");
	}	*/
}
