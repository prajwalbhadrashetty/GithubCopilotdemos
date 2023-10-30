package org.example.oops;

//create and example of ploymorphism with payment method
//make two payment methods, cash and credit
//create a class to pay by cash and credit
//create a class to test the payment methods
//explain the code with comments
//give a main method to test the payment methods

public class Polymorphism {

    public static void main(String[] args) {
        // Here the runtime polymorphism fundamental is not applied, as it is of single CashPayment form
        CashPayment c = new CashPayment();
        c.pay();

        // Now the initialization is done using runtime polymorphism and it can have many forms at runtime
        // Single payment "p" instance can be used to pay by cash and credit card
        Payment p = new CashPayment();
        p.pay(); // Pay by cash

        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }

}

interface Payment {
    public void pay();
}

class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

}
class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }

}