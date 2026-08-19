public class Default {
    public static void main(String[] args){

        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);
    }

    static class Student { 
        String name;
        int age;
        int rollNo;
        String college;

        // default constructor -->   optional
        Student() {
            // name = "Sriji";
            // age = 14;
            // rollNo = 101;
            // college = "Mohan";
        }
        

        void markAttendance() {  
            System.out.println("Attendance marked by " + name);
        }
    }
}