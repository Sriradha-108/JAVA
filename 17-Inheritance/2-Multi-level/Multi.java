public class Multi {
    public static void main(String[] args) {
        CSEEngineerStudent es = new CSEEngineerStudent();
        es.attendLab();
        es.markAttendance();
        es.attendCSELab();

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

class CSEEngineerStudent extends EngineerStudent {
    void attendCSELab(){
        System.out.println("CSElab attended");
    }
}