package com.hostelapp.model.payment.type;

public class CashPayment extends PaymentType {
    private double amountTendered;

    public CashPayment(double amountTendered) {
        super("Cash payment");
        this.amountTendered = amountTendered;
    }

    public double getAmountTendered() {
        return amountTendered;
    }

    public void setAmountTendered(double amountTendered) {
        this.amountTendered = amountTendered;
    }

    public String getDetails() {
        String temp = "Total amount: " + this.getType() +
                "\nAmount tendered:" + this.amountTendered +
                super.getDetails();
        return temp;
    }
}
