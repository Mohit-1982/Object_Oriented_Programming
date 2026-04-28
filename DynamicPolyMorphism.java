package OOPS.Day8;

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying Via Credit Card");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying Via Debit Card");
    }
}

public class DynamicPolyMorphism {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new DebitCard();

        p1.pay();
        p2.pay();
    }
}
