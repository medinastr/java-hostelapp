package com.hostelapp.model.payment.type;

public abstract class PaymentType {
    private String type;

    public PaymentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return "Payment type: " + type;
    }
}
