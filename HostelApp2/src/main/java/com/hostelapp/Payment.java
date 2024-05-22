package com.hostelapp;

import java.time.LocalDateTime;

public class Payment extends Expense implements Processable {
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

    @Override
    public void process() {
        System.out.println("Processing payment");
        System.out.println(super.getDetails());
        System.out.println(t.getDetails());
    }

    public String getDetails() {
        String temp = super.getDetails() + "\n" +
                t.getDetails();
        return temp;
    }
}
