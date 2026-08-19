public class Overload {
    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student("Sriji");
        Student s3 = new Student("Sriji", 14);
        Student s4 = new Student("Sriji", 14, 101);
        Student s5 = new Student("Sriji", 14, 101, "Mohan");

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
        System.out.println(s2.college);
    }

    static class Student { 
        String name;
        int age;
        int rollNo;
        String college;

        // Default constructor
        Student() {}

        // Parameterized constructor 
        Student(String name) {
            this.name = name;
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Student(String name, int age, int rollNo) {
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }

        Student(String name, int age, int rollNo, String college) {
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
            this.college = college;
        }
        

        void markAttendance() {  
            System.out.println("Attendance marked by " + name);
        }
    }
}