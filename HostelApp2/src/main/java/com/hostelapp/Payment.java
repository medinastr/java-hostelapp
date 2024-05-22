package com.hostelapp;

import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;

public class Payment extends Expense {
    private PaymentType t;
    private LocalDateTime localDateTime;

    public Payment(double amount) {
        super(amount);
    }

    public PaymentType getT() {
        return t;
    }

    public void setT(PaymentType t) {
        this.t = t;
    }

    @Override
    public LocalDateTime getTime() {
        this.localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public String getDetails() {
        String temp = t + "$" + "\n" +
                t.getDetails();
        return temp;
    }
}
