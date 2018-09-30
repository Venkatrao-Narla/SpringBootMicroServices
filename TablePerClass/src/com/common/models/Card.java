package com.common.models;
public class Card extends Payement {
private int cardNumber;
private String cardType;
public int getCardNumber() {
	return cardNumber;
}
public void setCardNumber(int cardNumber) {
	this.cardNumber = cardNumber;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public Card() {
	// TODO Auto-generated constructor stub
}
public Card(int cardNumber, String cardType) {
	super();
	this.cardNumber = cardNumber;
	this.cardType = cardType;
}


}
