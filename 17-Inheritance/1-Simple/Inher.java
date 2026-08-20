public class Inher {
    public static void main(String[] args) {
        EngineerStudent es = new EngineerStudent();
        es.attendLab();
        es.markAttendance();

        Student s1 = new Student();
        s1.markAttendance();
    }
}

class Student {
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineerStudent extends Student {
    void attendLab(){
        System.out.println("lab attended");
    }
}