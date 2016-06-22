package com.lnt.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lnt.controller.PersonalDetailsController;
import com.lnt.model.PayerDetails;

public class TestDetails {

	PersonalDetailsController pdc = new PersonalDetailsController();
	PayerDetails pdetails1 = null;
	PayerDetails pdetails2 = new PayerDetails();

	 @BeforeClass  
	 public static void setUpBeforeClass() throws Exception {  
	     System.out.println("before class");  
	 }
	 
	 @Before  
	 public void setUp() throws Exception {  
	        System.out.println("before");  
	 }  
	    
	@Test
	public void testNull() {
		assertNull((pdetails1));
	}
	
	@Test
	public void testNotNull(){
		pdetails2.setFirstname("Test1");
		pdetails2.setAddress("TestAddress");
		pdetails2.setPanNo("TestPan123");
		pdetails2.setDateOfBirth("01-01-1990");
		pdetails2.setAssessmentYear("2014-15");	
		pdetails2.setIncome(10000);
		pdetails2.setTds(1000);
		pdetails2.setTaxDeduction(10);
		
		assertNotNull(pdc.printToXML(pdetails2));
	}
}
