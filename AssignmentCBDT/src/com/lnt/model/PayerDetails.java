package com.lnt.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
@XmlRootElement(name = "PayerDetails")
@XmlType(propOrder = {"firstname", "address", "panNo", "dateOfBirth","assessmentYear","income","tds","taxDeduction"})
public class PayerDetails {
	private String firstname;
	private String address;
	private String panNo;
	private String dateOfBirth;
	private String assessmentYear;	
	private double income;
	private double tds;
	private double taxDeduction;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAssessmentYear() {
		return assessmentYear;
	}
	public void setAssessmentYear(String assessmentYear) {
		this.assessmentYear = assessmentYear;
	}
	public double getTaxDeduction() {
		return taxDeduction;
	}
	public void setTaxDeduction(double taxDeduction) {
		this.taxDeduction = taxDeduction;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getTds() {
		return tds;
	}
	public void setTds(double tds) {
		this.tds = tds;
	}
}
