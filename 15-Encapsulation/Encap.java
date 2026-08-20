// Encapsulation

public class Encap {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        // ba.balance = 10000.00;

        // System.out.println(ba.balance);

        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getbalance());

        Student s1 = new Student("Sriji", 14, 101);
        System.out.println(s1.getName());
        s1.setName("Shyam");
        System.out.println(s1.getName());



    }
}

class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    // getters / Setters
    public double getbalance(){
        return balance;
    }

}

class Student {
    private String name;
    private int age;
    private int rollNo;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo =rollNo;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}