package OOPS;

class STudent {
    private String name;
    private int age;
    private int rollNumber;
    private String college;

    STudent(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //getters and setters

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        //In this we can add validation as well that is why it's better to create a method than to give full access
        //to the person using default instance variable
        this.name = name;
    }
}

class BankAccount {
    private int balance;


    //we are using public with these function because if we don't use public then by default these
    //are going to be default access level means not package level access we can't use the methods in other packages
    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        //you can apply validation like,
        // amount <= balance then only one can withdraw
        balance -= amount;
    }

    //Getter / Setters --> Functions which we can use to get or set values
    public void getBalance() {
        System.out.println(balance);
    }
}

public class Encapsulationn {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.getBalance();
        b1.deposit(1000);
        b1.withdraw(500);
        b1.getBalance();
    }
}
