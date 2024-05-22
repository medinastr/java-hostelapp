package com.hostelapp.model.payment.type;

import java.time.LocalDate;

public class CreditCardPayment extends CardPayment {
    private String issuer;
    private LocalDate expirationDate;
    private String securityCode;

    public CreditCardPayment(String issuer, String cardNumber, String nameOnCard) {
        super("Credit Card Payment", cardNumber, nameOnCard);
        this.issuer = issuer;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    // same of ccp.equals(ccp2) on main
    public boolean equals(Object object) {
        CreditCardPayment ccp = null;
        if(object instanceof CreditCardPayment) {
            ccp = (CreditCardPayment)object;
            if(ccp.getCardNumber().equals(this.getCardNumber())) {
                return true;
            }
        }
        return false;
    }

    public String getDetails() {
        String temp = "Payment details\n" +
                super.getDetails() +
                "\nIssuer: " + this.issuer + "\n";
        return temp;
    }
}
