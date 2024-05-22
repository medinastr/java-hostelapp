package com.hostelapp;

public class CardPayment extends PaymentType {
    private String cardNumber;
    private String nameOnCard;

    public CardPayment(String type, String cardNumber, String nameOnCard) {
        super(type);
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
    }

//    public CardPayment() {
//    }

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

    public String getDetails() {
        String temp = super.getDetails() + "\n" +
                "Number: " + this.getCardNumber() +
                "\nName on card: " + this.getNameOnCard();
        return temp;
    }
}
