package com.vstl.assignment;

import java.time.ZoneId;

import com.vstl.javatraining.StringConcatenation;

public class TestFaceBookPage {

	public static void main(String[] args) {

		FaceBookPage objFaceBookPage = new FaceBookPage();
		
		UtilityFaceBookPage objUtilityFaceBookPage = new UtilityFaceBookPage();
		       System.out.println("***********************");
		       
		objFaceBookPage.setMobileNumber(objUtilityFaceBookPage.getMobileNumber(10));
	           System.out.println("***********************");
  		
		objFaceBookPage.setDateAndTime(objUtilityFaceBookPage.getDateAndTimeFormat().trim());
	           System.out.println("***********************");
		
		objFaceBookPage.setTimeZone(objUtilityFaceBookPage.getAllZoneIds(""));
	           System.out.println("***********************");
		
		objFaceBookPage.setZoneWithTime(objUtilityFaceBookPage.getExactZoneId("Europe/Monaco"));
	           System.out.println("***********************");

		objFaceBookPage.setDate(objUtilityFaceBookPage.getRandomDate());
	           System.out.println("***********************");

		objFaceBookPage.setRandomString(objUtilityFaceBookPage.getRandomString(9).toLowerCase());
	           System.out.println("***********************");

		objFaceBookPage.setRandomNumberWithString(objUtilityFaceBookPage.getRandomNumberWithString(10).toUpperCase());
	           System.out.println("***********************");

		objFaceBookPage.setRandomNumberWithSpecialCharecter(objUtilityFaceBookPage.getRandomNumberWithSpecialCharecter(10));

	}

}
