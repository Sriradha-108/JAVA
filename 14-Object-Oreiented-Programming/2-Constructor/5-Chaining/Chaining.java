public class Chaining {
    public static void main(String[] args) {

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

    // Constructor chaining
    static class Student {
        String name;
        int age;
        int rollNo;
        String college;

        // Default constructor
        Student() {
            this("unknown", 0, 0, "unknown");
        }

        // Parameterized constructors
        Student(String name) {
            this(name, 0, 0, "unknown");
        }

        Student(String name, int age) {
            this(name, age, 0, "unknown");
        }

        Student(String name, int age, int rollNo) {
            this(name, age, rollNo, "unknown");
        }

        // Terminal constructor - does the actual assigning, delegates to no one
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