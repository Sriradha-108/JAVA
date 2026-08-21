public class Nested {
    public static void main(String[] args){
        Outer outer = new Outer();
        // Outer.x = 10;
        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun(outer);

    }
}

// static Nested class
class Outer{
    
    private static int x =4; //no need of object to access this
    int y;

    // static void greet(){}

    static class Inner{

        Outer outer;

        Inner(Outer outer){
            this.outer = outer;
        }

        void fun(Outer outer){
            System.out.println("Hello");
            System.out.println(x);
            System.out.println(outer.y); //non-static variable y cannot be referenced from a static
        }

    }
} 

class BankAccount {

    private static class InterestCalculator {
        static double calculateYearly(double principle, double rate) {
            return principle * rate;
        }
    }

    public double computeInterest(double principle) {
        return InterestCalculator.calculateYearly(principle, 0.09);

    }
}

// Use cases of static nested classes :
/*
 1. As helper class for any outer class.
 2. Builder Design pattern
 3. If you want to have static methods inside a nested class.
 4. Request/Response DTO

*/