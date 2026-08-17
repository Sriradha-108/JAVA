public class Selection {
    public static void main(String[] args) {
        // boolean b = true;
        // int i = 5;

        //Selection statements
        //normal if
        // if (i == 5){
        //     System.out.println("i is 5 ");
        // }
        // else {
        //     System.out.println("i is not 5 ");
        // }

        // even or odd 
        // if (i % 2 == 0){
        //     System.out.println("i is even");
        // }
        // else {
        //     System.out.println("i is odd");
        // }

        //Nested ifs
        // if(i>5){
        //     if( i < 10){

        //     }
        //     else {

        //     }
        // }
        // else {

        // }

       

        // if-else-if ladder
        // if( i == 5){
        //     System.out.println("i is 5");
        // }
        // else if( i == 6){
        //     System.out.println("i is 6");
        // }
        // else if( i == 7){
        //     System.out.println("i is 7");
        // }
        // else {
        //     System.out.println("i is 10");
        // }

        // int age = 50;

        // if(age > 80){
        //     System.out.println("u are very old");
        // }
        // else if(age > 60){
        //     System.out.println("u are old");
        // }
        // else if(age > 40){
        //     System.out.println("u are becomming old");
        // }
        // else {
        //     System.out.println("u are child or young");
        // }

        boolean b = true;
        int i = 5;

        //Switch statements
        // switch(i) {
        //     case 1 -> System.out.println("One");
        //     case 2 -> System.out.println("Two");
        //     case 3 -> System.out.println("Three");
        //     default -> System.out.println("Other");
        // }
        switch(i){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
                break;
        }
        

    }
}

// switch --> limited use case -> should evaluate to byte, short, int, char, Enumeration.
// No duplicate cases allowed.
// After JDK7 Strings can also be used as switch expression.
// After JDK-14 switch is enhanced too much