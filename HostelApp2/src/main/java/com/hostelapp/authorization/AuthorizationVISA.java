package com.hostelapp.authorization;

import com.hostelapp.model.payment.type.CardPayment;

public class AuthorizationVISA implements Authorization {
    public boolean authorize(CardPayment cardPayment, double amount) {
        // code to communicate with VISA
        System.out.println("VISA: Authorizing payment");
        return true;
    }
}
