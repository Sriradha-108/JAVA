public class Recursive {
    public static void main(String[] args){
        int n = 5;  // number of terms

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int x = fib(n - 1);
        int y = fib(n - 2);
        return x + y;
    }
}