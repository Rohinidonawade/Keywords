package com.vstl.oopsFinalExample;

public class Employee extends Company {

	public void getCompanyName(String strName) {
		strName = super.strCompanyName;
		System.out.println("Company name is :" +strCompanyName);
	}

	// it is giving error that final method can't overridden from company
	
	public String getLoginPage(String strCompanyFullName) {
		String strCompanyFirstName = "Verve Square";
		String strCompanyLastName = "Technology in pune";
		String strFullName = strCompanyFirstName.concat(strCompanyLastName);
		System.out.println("Company name is :" +strFullName);
		
		return strFullName;		
	}

}
