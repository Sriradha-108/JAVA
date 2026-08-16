public class Var {
    public static void main(String[] args) {
        //Integers --> byte, short, int, long
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 10000;

        // Real numbers
        float f = 10.54f;
        double d = 23.0987;

        //charcters
        char c = 'a'; // 'a' --> integer --> binary --> store

        // boolean
        boolean bool = false;

        System.out.println("Integer values --> " + b + " , " + s + " , " + i + " , " + l);
        System.out.println("Floating values --> " + f + " , " + d);
        System.out.println("Character values --> " + c);
        System.out.println("Boolean values --> " + bool);
    }
}