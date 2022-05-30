package com.vstl.oopsFinalExample;

public class Company {

	//Final:- is used to restrict the user.
	//Variable, method & class can be defined final keyword.
	
	//*variable:- can't change.
	
	final String strCompanyName = "VSTL";
	String strFullName = "Verve Square Verve Square";
	
	public void getCompanyName() {		
		System.out.println("Company name is :" +strCompanyName);
	}
	
	//*method can't overridden in any child class
	//*final class can't extend in java.
	
	public final String getLoginPage(String strFirstName, String strLastName) {
		String strCompanyFirstName = "Verve Square";
		String strCompanyLastName = "Technology in pune";
		String strFullName = strCompanyFirstName.concat(strCompanyLastName);
		System.out.println("Company name is :" +strFullName);
		
		return strFullName;
		
	}
	
}
