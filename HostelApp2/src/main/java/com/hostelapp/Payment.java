package com.hostelapp;

import java.time.LocalDateTime;

public class Payment extends Expense {
    private PaymentType t;

    public Payment(double amount) {
        super(amount);
    }

    public PaymentType getT() {
        return t;
    }

    public void setT(PaymentType t) {
        this.t = t;
    }

    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    public String getDetails() {
        String temp = t + "$" + "\n" +
                t.getDetails();
        return temp;
    }
}
