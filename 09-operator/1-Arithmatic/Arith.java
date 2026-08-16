public class Arith {
    public static void main(String[] args){
        //Operator in Java. 
        // Arithmetic Operator --> +, -, *, /, %, +=, -=, *=,  /=, %=, ++, --

        int a = 5;
        int b = 10;

        int c = a+b;
        int d =a-b;
        int e =a*b;  
        int f = b/a; //2
        int g = b%a; //0

        System.out.println(c + "," + d + "," + e + "," + f + "," + g );

        int h = a + 2;

        //h = h + 2;  //Since this is ok in CSE
        h += 2;  //h = h + 2;
        h -= 2;  //h = h-2;

        h *= 2;
        h /= 2;   // 7

        h %= 7;    // 0

        System.out.println(h);

        int i = 6;
        i++;  // i = i + 1 --> i += 1;

        System.out.println(i);

        // pre increment/decrement  and post increment/decrement
        int j =8;
        j++;  //prefix
        ++j;  //postfix   //10

        System.out.println(j);

        int k = j++;
        int l = ++j;

        System.out.println(j + "," + k + "," + l );


    }
}