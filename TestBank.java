package com.vstl.oopsMethodOverriding;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank objHDFCBank = new HDFCBank();
		objHDFCBank.getBankName("ICIC Bank");
		
		objHDFCBank.getMin_Balance();
		
		objHDFCBank.getWithDrow(1500,25000);
		
	}
}
