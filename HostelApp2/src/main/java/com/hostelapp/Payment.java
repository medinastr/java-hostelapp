package com.hostelapp;

import jdk.vm.ci.meta.Local;

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
        System.out.println(t);
    }

    public String getDetails() {
        String temp = t + "$" + "\n" +
                t.getDetails();
        return temp;
    }
}
