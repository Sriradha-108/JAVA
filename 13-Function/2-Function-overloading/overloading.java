public class overloading {
    public static void main(String[] args){
        // Function overloading
        int x = sum(2, 3);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        // int z = sum(2, 3) + 5;    // for 3 number addition
        // System.out.println(z);

        int z = sum(2, 3, 5);
        System.out.println(z);

    }

    static int sum(int a, int b){
        return (a + b);
    }

    static int sum(int a, int b, int c){ // Different number of parameters 
        return (a + b + c);
    }

    static int sum(double a, double b){ // different types of parameters
        return (int)(a + b);
    }

    static void greet(String name, int age){
        System.out.println("Hi " + name + ". your age is " + age);
    }

    static void greet(int age, String name){ // ordering of parameters is different
        System.out.println("Hi " + name + ". your age is " + age);
    }

    static void fun(){
        System.out.println("Sriji");
    }

    static int fun2(){
        System.out.println("Sriji");
        return 5;
    }
}