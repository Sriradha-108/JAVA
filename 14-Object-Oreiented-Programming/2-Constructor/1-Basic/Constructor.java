public class Constructor {
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Sriji";
        s1.age = 14;
        s1.rollNo = 101;
        s1.college = "Mohan";

        // constructors --> to create an object

        // default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        // int x; // local variable --> No default values
        // System.out.println(x);



    }

    // void fun(){
    //     int x;
    // }

    /*
    integer --> 0
    floating --> 0.0
    Boolean --> false
    String --> null (nothing)
    */
    static class Student {  //information/data/characteristics --> instance variable
        String name;
        int age;
        int rollNo;
        String college;

        void markAttendance() {  // behaviour --> function --> instance method or method
            System.out.println("Attendance marked by " + name);
        }
    }
}
