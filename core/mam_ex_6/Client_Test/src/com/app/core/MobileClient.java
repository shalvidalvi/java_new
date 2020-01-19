package com.app.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MobileClient implements Serializable
{
	private String mobileNo,name;
	private Date dob;
	private List<Double> bills;

	public MobileClient(String mobileNo, String name, Date dob) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.dob = dob;
		bills=new ArrayList< Double>();
		
	}
	
	public List<Double> getBills() {
		return  bills;
	}

	public void setBills(List<Double> bills) {
		this.bills = bills;
	}

	public void addBill(double bill)
	{
		bills.add(bill);
	}
	
	
	@Override
	public String toString() {
		return "MobileClient [mobileNo=" + mobileNo + ", name=" + name + ", dob=" + dob + ", bills=" + bills + "]";
	}

	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
