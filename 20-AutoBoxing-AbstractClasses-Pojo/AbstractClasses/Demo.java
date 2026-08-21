public class Demo {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;

        // System.out.println(a == b);  // refer address
        System.out.println(a.intValue() == b.intValue());  //refer value
        System.out.println(a.equals(b));  //refer value

    }
}