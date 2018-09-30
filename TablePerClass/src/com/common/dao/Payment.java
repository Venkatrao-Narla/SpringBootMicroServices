package com.common.dao;

import com.common.models.Card;
import com.common.models.Cheque;

public interface Payment {
void saveCard(Card card);
void saveCheque(Cheque cheque);
}
