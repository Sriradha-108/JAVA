public class Para {
    public static void main(String[] args){

        Student s1 = new Student("Sriji",14,101,"Mohan");

        // Student s1 = new Student();

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

        // Parameterized constructor 
        Student(String n, int a, int rn, String c) {
            name = n;
            age = a;
            rollNo = rn;
            college = c;
        }
        

        void markAttendance() {  
            System.out.println("Attendance marked by " + name);
        }
    }
}