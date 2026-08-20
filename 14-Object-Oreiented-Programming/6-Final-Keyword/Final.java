// final keyword

public class Final {
    public static void main(String[] args){
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;  // theoratically not allowed 
        x = 4;  // but here x=4 first time assigning so it is allowed.
        System.out.println(x);
    }
}

// why main is static in java
// Final f1 = new Final();
// f1.main()
// Final.main() 

// class Random{
//     // final double PI = 3.14;
//     final double PI;

//     Random() { //constructor
//         this.PI = 3.14;
//     }
    class Random{
    // static final double PI;  //it is belong to class
    static final double PI=3.14;

    // Random() { //constructor  we cann't create for that we have to create
    //     this.PI = 3.14;  //static block bcz constructor related to object
    // }
    
    // static block
    // static {
    //     PI = 3.14;
    // }

}