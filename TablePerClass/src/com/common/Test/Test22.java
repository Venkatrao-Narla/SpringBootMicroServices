package com.common.Test;

import java.util.Date;

import com.common.dao.Payment;
import com.common.dao.PaymentDaoFactory;
import com.common.models.Card;
import com.common.models.Cheque;
import com.common.models.Payement;

@SuppressWarnings("unused")
public class Test22 {

	public static void main(String[] args) {
Payment dao=PaymentDaoFactory.getInstance();
Card card=new Card();
card.setCardNumber(123456);
card.setCardType("MASTER");
card.setAmount(25800);
card.setPaymentId(1230);
card.setPaymentDate(new Date());
dao.saveCard(card);
System.out.println("===================================");
Cheque cheque=new Cheque();
cheque.setChequeNumber(125893);
cheque.setChequeType("VISA");
cheque.setPaymentId(100);
cheque.setAmount(89756);
cheque.setPaymentDate(new Date());
dao.saveCheque(cheque);
System.out.println("======================================");
		
		
	}

}
