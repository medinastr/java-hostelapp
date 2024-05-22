package com.hostelapp;

public class Report {
    private Payment[] payments;
    private int contador;

    public Report() {
        payments = new Payment[2];
        contador = 0;
    }

    public void add(Payment payment) {
        payments[contador] = payment;
        contador++;
    }

    @Override
    public String toString() {
        int counter = 0;
        String temp = "";
        for(Payment p : payments) {
            counter++;
            temp += "Payment " + counter + "\n"
                    + p.getDetails() + "\n";
        }
        return temp;
    }

    public static void main(String[] args) {
        Report report =  new Report();
        Payment pCC = new Payment(200.00);
        Payment pCC2 = new Payment(300.00);

        pCC.setT(new CreditCardPayment("Gabriel Alves", "3219-2345-5432-1234", "Visa"));
        pCC2.setT(new DebitCardPayment("Banco do Brasil", "2000-0003-3456-9123", "Pedro Silva"));
        report.add(pCC);
        report.add(pCC2);

        System.out.println(report.toString());

//        report.add(new CreditCardPayment("Pedro Medina", "0000-1111-2222-3333", "Visa"));
//        report.add(new DebitCardPayment("Banco do Brasil", "9999-8888-7777-6666", "João Silva"));
    }
}
