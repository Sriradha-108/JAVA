// use of String[] args

public class StringArgsDemo {
    public static void main(String[] args) {
        System.out.println("Number of arguments are " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + "=" + args[i]);
        }

        // java StringArgsDemo  input.txt output.txt
        // java StringArgsDemo  Sriji, Mohan
    }
}