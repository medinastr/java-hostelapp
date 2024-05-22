package com.hostelapp;

import com.hostelapp.model.payment.Payment;
import com.hostelapp.model.payment.type.*;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentTest pt = new PaymentTest();

        Payment paymentCC = new Payment(500.00);
        CreditCardPayment ccp = new CreditCardPayment("Visa", "0000-1111-2222-3333", "Pedro Medina");
        paymentCC.setT(ccp);

        pt.processPayment2(paymentCC);

        Payment paymentDC = new Payment(200.00);
        DebitCardPayment dcp = new DebitCardPayment("Banco do Brasil", "9999-8888-7777-6666", "João Silva");
        paymentDC.setT(dcp);

        pt.processPayment2(paymentDC);

        CreditCardPayment ccp2 = new CreditCardPayment("Pedro Medina", "0000-1111-2222-3333", "Visa");
        CashPayment cash = new CashPayment(200);
        CheckPayment check = new CheckPayment("B02", 10, "Banco do Brasil");


    }

    // mostra o método para mostrar o específico de cada subclasse (issuer e bankName)
    public void processPayment1(CardPayment cp) {
        System.out.println("Processing payment");
        if(cp instanceof CreditCardPayment) {
            CreditCardPayment ccp = (CreditCardPayment)cp;
            System.out.println(ccp.getIssuer());
        } else if(cp instanceof DebitCardPayment) {
            DebitCardPayment dcp = (DebitCardPayment)cp;
            System.out.println(dcp.getBankName());
        }
    }

    public void processPayment2(Payment p) {
        p.process();
//        System.out.println("Processing payment");
//        System.out.println(p.getDetails());
    }
}
