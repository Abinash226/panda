package com.sumitFood.ravenshaw.userservice.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class InterchangeFee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long icId;
	private String Ccy;
	private String Amt;
	public String getCcy() {
		return Ccy;
	}
	public void setCcy(String ccy) {
		Ccy = ccy;
	}
	public String getAmt() {
		return Amt;
	}
	public void setAmt(String amt) {
		Amt = amt;
	}
	@Override
	public String toString() {
		return "InterchangeFee [Ccy=" + Ccy + ", Amt=" + Amt + "]";
	}
	public InterchangeFee() {
		super();
	}
	public Long getIcId() {
		return icId;
	}
	public void setIcId(Long icId) {
		this.icId = icId;
	}
	
	

}
