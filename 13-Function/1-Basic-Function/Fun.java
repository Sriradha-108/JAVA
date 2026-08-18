public class Fun {
    public static void main(String[] args) {
        // Function in java

        greet();

        sayHello("Sriji");   // Arguments

        // int x = getNumber();
        // System.out.println(x);
        System.out.println(getNumber());

        System.out.println(multiply(10, 2));  // 20

        return;  // return option is optional in main method

    }

    // No i/p no o/p
    static void greet() {
        System.out.println("Sriji");
        //return;
    }

    // i/p no o/p
    static void sayHello(String name) { // Number of parameters can be anything. 
        System.out.println("Madhav, " + name);

    }

    // no i/p o/p
    static int getNumber() {
        return 10;
    }

    // i/p o/p
    static int multiply(int a, int b) {
        return (a * b);
    }
}