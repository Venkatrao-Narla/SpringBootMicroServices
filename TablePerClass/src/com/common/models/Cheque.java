package com.common.models;

public class Cheque extends Payement {
	private int chequeNumber;
	private String chequeType;
	public int getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public Cheque() {
		// TODO Auto-generated constructor stub
	}
	public Cheque(int chequeNumber, String chequeType) {
		super();
		this.chequeNumber = chequeNumber;
		this.chequeType = chequeType;
	}
	

}
