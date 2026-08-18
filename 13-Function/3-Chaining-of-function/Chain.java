public class Chain {
    public static void main(String[] args){
        // chaining of function

        fun1();

        System.out.println("hi");

    }

    static void fun1() {
        fun2();
        System.out.println("ram");   
    }

    static void fun2() {
        fun3();
        System.out.println("shyam");   
    }

    static void fun3() {
        System.out.println("mohan");   
    }
}