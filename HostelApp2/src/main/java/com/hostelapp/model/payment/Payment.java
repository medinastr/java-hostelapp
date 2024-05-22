package com.hostelapp.model.payment;

import com.hostelapp.model.payment.type.PaymentType;

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

    private String dateTime() {
        this.localDateTime = LocalDateTime.now();
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonth().getValue();
        int year = localDateTime.getYear();
        int hour = localDateTime.getHour();
        int minutes = localDateTime.getMinute();
        String temp = day + "/" + month + "/" + year
                + " - " + hour + ":" + minutes;
        return temp;
    }

    @Override
    public void process() {
        System.out.println(dateTime());
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
