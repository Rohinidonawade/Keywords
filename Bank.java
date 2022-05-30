package com.vstl.oopsMethodOverriding;

public class Bank {
	
	//Method overriding:-Same method is present in parent and Child class with same name and same number of parameter.
    //Run time Polymorphism.
	
	    int intMin_Amount;       
	    int intMax_Amount;
	    
	public void getBankName(String strName) {
	    	System.out.println("Bank name is State Bank");  	
	}
	
	public void getMin_Balance() {
		System.out.println("In Account Minimum balance is 1000");
	}
	
	public void getWithDrow(int intMin_Amount, int intMax_Amount) {
		intMin_Amount = 500;
		System.out.println("Minimum withdrow amount :" +intMin_Amount);
		
		intMax_Amount = 50000;
		System.out.println("Maximum withdrow amount :" +intMax_Amount);
	}
}
