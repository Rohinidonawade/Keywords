package com.vstl.oopsMethodOverriding;

public class HDFCBank extends Bank{
	
		//The method name and parameter is same but having different behavior.
	
	    int intMin_Amount;       
        int intMax_Amount;
    
        
    public void getBankName(String strName) {
    	System.out.println("Bank name is HDFC Bank");  	
    } 
    
	public void getMin_Balance() {
		System.out.println("My Account Minimum balance is 500");
	}
	
	public void getWithDrow(int intMin_Amount, int intMax_Amount) {
		intMin_Amount = 1000;
		System.out.println("I can Withdro minimum amount is :" +intMin_Amount);
		
		intMax_Amount = 30000;
		System.out.println("I can Withdro maximum amount is :" +intMax_Amount);
	}
	
}
