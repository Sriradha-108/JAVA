public class Iteration {
    public static void main(String[] args) {
        // Loops

        // int i = 1; // 1 to 5
        // int i = 0; // 1 to 5

        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;
        // System.out.println(i);

        // Loops --> while
        /*  
          while(expression){
              do something
        }
        */
        
        // while(i <= 5){   // boolean --> true/false
        //     System.out.println(i);
        //     i++;
        // }
        // while(i++ < 5){
        //     System.out.println(i);
            
        // }

        // do while
        // do {
        //     System.out.println(i);
        //     i++;
        
        // } while(i <= 5);

        // Menu item selection --> do-while
        /*
           1.play game
           2.Return saved game
           3.Exit
        */

       // for loop
    //    for (int i = 1; i <= 5; i++){
    //         System.out.println(i);
    //    }
        
        // infinite loop
    //     for (int i = 1; ; i++){
    //         System.out.println(i);
    //    }
        //  for (; i <= 5; i++){
        //     System.out.println(i);
        //  }
        // comma seprated variation
        // for (int i =1 , j = 1; i <= 5 && j <= 5; i++, j+=2 ){
        //     System.out.println(i * j);

        // }
        // boolean b = true;
        // for (int i=1; b == true; i++){
        //     if(condition){
        //         b = false;
        //     }
        // }

        // Integers --> byte, short, int, long

        // for (int i =1 ; i <= 5; i++ ){
        //     System.out.println(i);
        // }

        // Nested loops
        // for (int i =1 ; i <= 5; i++ ){
        //     for (int j =1 ; j <= i; j++ ){
        //         System.out.print("*");
                
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }

        // for (int i =1 ; i <= 10; i++ ){
        //     for (int j =1 ; j <= i; j++ ){
        //         System.out.print("*");
        //         if (j >= 5){
        //             // break;
        //             continue;
        //         }
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }

        outer: for (int i =1 ; i <= 10; i++ ){
            inner: for (int j =1 ; j <= i; j++ ){
                System.out.print("*");
                if (j >= 5){
                    break outer;
                    // continue outer;
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        
    }
}