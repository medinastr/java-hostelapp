package com.hostelapp.model.payment.type;

public class DebitCardPayment extends CardPayment {
    private String bankName;

    public DebitCardPayment(String bankName, String cardNumber, String nameOnCard) {
        super("Debit Card Payment", cardNumber, nameOnCard);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDetails() {
        String temp = "Payment details\n" +
                super.getDetails() +
                "\nBank name: " + this.bankName + "\n";
        return temp;
    }
}
