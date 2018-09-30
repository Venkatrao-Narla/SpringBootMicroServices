package com.common.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.Util.HibernateUtil;
import com.common.models.Card;
import com.common.models.Cheque;

public class PaymentDaoImpl implements Payment {
	private static SessionFactory factory;
	public PaymentDaoImpl() {
factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveCard(Card card) {
Session session=factory.openSession();
Transaction tx=session.beginTransaction();
session.save(card);
tx.commit();
session.close();
factory.close();
		
		
		
	}

	@Override
	public void saveCheque(Cheque cheque) {
Session session=factory.openSession();
Transaction tx=session.beginTransaction();
session.save(cheque);
tx.commit();
session.close();
factory.close();
		
	}

}
