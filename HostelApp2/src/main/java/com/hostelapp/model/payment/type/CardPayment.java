package com.hostelapp.model.payment.type;

public class CardPayment extends PaymentType {
    private String cardNumber;
    private String nameOnCard;
    private boolean authorization;

    public CardPayment(String type, String cardNumber, String nameOnCard) {
        super(type);
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public boolean isAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

    public String getDetails() {
        String temp = "Payment authorized? " + authorization + "\n" +
                super.getDetails() +
                "\nNumber: " + this.getCardNumber() +
                "\nName on card: " + this.getNameOnCard();
        return temp;
    }
}
