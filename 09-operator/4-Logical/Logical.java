public class Logical {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        // boolean d = (a < b) && (b < c);
        // boolean e = (a < b) || (b < c);

        // //short-circut
        // System.out.println(d + "," + e);

        boolean f = (a < b) & (b < c); // no short-circuit
        System.out.println(f);
        
    }
}