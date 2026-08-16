public class Bitw {
    public static void main(String[] args) {
        int a = 2; // 00000000 00000000 00000000 00000010
        int b = 3; // 00000000 00000000 00000000 00000011
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~ a;

        System.out.println(c + "," + d + "," + e + "," + f);

        //shift operation
        int g = 1; // 00000000 00000000 00000000 00000001
        //g = g << 31;  // become -ve number
        g = g << 32;  //  g =1

        System.out.println(g);

        // >>   and >>>

        byte h = 1;  // 00000001
        h = (byte)(h << 1); // 00000000 00000000 00000000 00000010  
        // 1'st it will auto promotion to int h << 1 and then truncate to 8 bit 00000010   

        System.out.println(h);

    }
}