package com.hostelapp.authorization;

import com.hostelapp.model.payment.type.CardPayment;

public class AuthorizationMasterCard implements Authorization {
    public boolean authorize(CardPayment cardPayment, double amount) {
        // code to communicate with Master Card
        System.out.println("Master Card: Authorizing payment");
        if(Math.random() < 0.8)
            return true;
        else
            return false;
    }
}
