public class Scope {

    static String name = "ram";   // global scope 
    public static void main(String[] args){
        // scope of a variable

        int x = 4;  // local scope
        int y = 5;

        System.out.println(x + "," + y);

        fun();
    }

    static void fun() {
        int x = 4; // local scope
        int y = 5;
        System.out.println(x + "," + y);

    }
}