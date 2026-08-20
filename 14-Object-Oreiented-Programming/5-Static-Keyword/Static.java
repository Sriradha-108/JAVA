// static keyword

public class Static {
    public static void main(String[] args){
        Student s1 = new Student("Sriji", 14, 101);
        Student s2 = new Student("Shyam", 15, 102);

        // Student.college = "Mohan";

        System.out.println(s1.name + "," + s1.age + "," + s1.rollNo + "," + s1.college + "," + s1.grade);
        System.out.println(s2.name + "," + s2.age + "," + s2.rollNo + "," + Student.college + "," + Student.grade);

    }
}

class Student{
    String name;
    int age;
    int rollNo;
    static String college;
    // static int grade;
    static int grade = 8;

    Student(String name, int age, int rollNo){
        this.name =name;
        this.age =age;
        this.rollNo = rollNo;

    }

    // static block
    static void main() {
        college = "Mohan";
        // grade = 8;
    }
}