package com.hl.model;

public class Customer {

	
	private int cusId;
	private String cusName;
	private String cusSex;
	private String cusPhone;
	private String cusDate;
	private int cus_area;
	private int cusUserId;
	private int cusStat;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusSex() {
		return cusSex;
	}
	public void setCusSex(String cusSex) {
		this.cusSex = cusSex;
	}
	public String getCusPhone() {
		return cusPhone;
	}
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	public String getCusDate() {
		return cusDate;
	}
	public void setCusDate(String cusDate) {
		this.cusDate = cusDate;
	}
	public int getCus_area() {
		return cus_area;
	}
	public void setCus_area(int cus_area) {
		this.cus_area = cus_area;
	}
	public int getCusUserId() {
		return cusUserId;
	}
	public void setCusUserId(int cusUserId) {
		this.cusUserId = cusUserId;
	}
	public int getCusStat() {
		return cusStat;
	}
	public void setCusStat(int cusStat) {
		this.cusStat = cusStat;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusSex=" + cusSex + ", cusPhone=" + cusPhone
				+ ", cusDate=" + cusDate + ", cus_area=" + cus_area + ", cusUserId=" + cusUserId + ", cusStat="
				+ cusStat + "]";
	}
	
	
	
	
}
