package com.hostelapp.authorization;

import com.hostelapp.model.payment.type.CardPayment;

public interface Authorization {
    public abstract boolean authorize(CardPayment cardPayment, double amount);
}
