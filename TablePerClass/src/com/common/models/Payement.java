package com.common.models;

import java.util.Date;

public class Payement {
	private int paymentId;
	private double amount;
	private Date paymentDate;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payement [paymentId=" + paymentId + ", amount=" + amount + ", paymentDate=" + paymentDate
				+ ", getPaymentId()=" + getPaymentId() + ", getAmount()=" + getAmount() + ", getPaymentDate()="
				+ getPaymentDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Payement() {
		// TODO Auto-generated constructor stub
	}
	public Payement(int paymentId, double amount, Date paymentDate) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	

}
