package com.hl.model;

public class Customer {

	private int cusId;
	private String cusName;
	private String cusSex;
	private String cusPhone;
	private String cusDate;
	private int cusArea;
	private int cusUserId;
	private int cusStat;
	private String cusBz;

	public String getCusBz() {
		return cusBz;
	}

	public void setCusBz(String cusBz) {
		this.cusBz = cusBz;
	}

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

	public int getCusArea() {
		return cusArea;
	}

	public void setCusArea(int cusArea) {
		this.cusArea = cusArea;
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
				+ ", cusDate=" + cusDate + ", cusArea=" + cusArea + ", cusUserId=" + cusUserId + ", cusStat=" + cusStat
				+ ", cusBz=" + cusBz + "]";
	}

}
