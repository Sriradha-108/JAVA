public class Poly {
    public static void main(String[] args) {
        A a = new B();
        // a.fun();
        // System.out.println(a.x);    // 10

        // B b = new B();
        // System.out.println(b.x);    // 20
        
        System.out.println(a.getX());    // 20


    }
}

// static --> they belongs to class not to object 
// private methods cann't be overridden
// final methods cann't be overridden

// final -->class ??? --> u can not create child of that class

// fields / variables they  cann't be polymorphic

// class A {
//     static void fun() {
//         System.out.println("Hello");
//     }

//     private void fun2() {
//         System.out.println("Hello");
//     }

//     final void fun3() {
//         System.out.println("Hello");
//     }
// }

// class B extends A {
//     static void fun(){
//         System.out.println("Bye");
//     }

    // void fun()3{
    //     System.out.println("Bye");
    // }
// }

class A {
    // int x = 10;

    int getX(){
        return 10;
    }
}

class B extends A {
    // int x = 20;

    int getX(){
        return 20;
    }
}



