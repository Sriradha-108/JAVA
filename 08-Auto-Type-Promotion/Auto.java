public class Auto {
    public static void main(String[] args) {
        // byte a = 50;
        // byte b = 40;
        // byte c =100;

        // int i = (a*b)/c;
        
        // System.out.println(i);

        // byte a =50;
        // a = (byte)(a*2);

        // System.err.println(a);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

        // f * b  --> float
        // i / c  --> int
        // d * s  --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result =" + result);


    }
}