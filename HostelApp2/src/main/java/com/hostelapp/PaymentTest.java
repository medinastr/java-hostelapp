package com.hostelapp;

import com.hostelapp.authorization.Authorization;
import com.hostelapp.authorization.AuthorizationMasterCard;
import com.hostelapp.authorization.AuthorizationVISA;
import com.hostelapp.model.payment.Payment;
import com.hostelapp.model.payment.type.*;

public class PaymentTest {

    public static void main(String[] args) {
        //    1. Create the payment with initial amount
        //    2. Create the payment type
        //    3. Associate Payment with PaymentType
        //    4. Create authorization
        //    5. Associate Payment with Authorization
        //    6. Authorizes the payment
        //        6.1 if authorized change the status of the payment type to authorized (default not authorized)
        //    7. Process the payment

        PaymentTest pt = new PaymentTest();

        Payment paymentCC = new Payment(500.00);
        PaymentType ccp = new CreditCardPayment("Visa", "0000-1111-2222-3333", "Pedro Medina");
        paymentCC.setT(ccp);
        Authorization aCC = new AuthorizationVISA();
        paymentCC.setAuthorization(aCC);
        paymentCC.authorize();
        pt.processPayment2(paymentCC);

        Payment paymentDC = new Payment(200.00);
        PaymentType dcp = new DebitCardPayment("Master Card", "9999-8888-7777-6666", "João Silva");
        paymentDC.setT(dcp);
        Authorization aDC = new AuthorizationMasterCard();
        paymentDC.setAuthorization(aDC);
        paymentDC.authorize();
        pt.processPayment2(paymentDC);

        Payment c = new Payment(25.00);
        PaymentType cash = new CashPayment(200);
        c.setT(cash);
        pt.processPayment2(c);

    }

    public void processPayment2(Payment p) {
        p.process();
    }
}
