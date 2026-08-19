public class Class {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Sriji";
        s1.age = 14;
        s1.rollNo = 101;
        s1.college = "Mohan";

        s2.name = "Shyam";
        s2.age = 15;
        s2.rollNo = 102;
        s2.college = "Kishori";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();

    }

    static class Student {
        String name;
        int age;
        int rollNo;
        String college;

        void markAttendance() {
            System.out.println("Attendance marked by " + name);
        }

        void print() {
            System.out.println(name + "," + age + "," + rollNo + "," + college);

        }
    }
}

// Java is almost an object-oriented program. 