public class Super2 {
    public static void main(String[] args){
        // EngStudent es = new EngStudent();
        // es.name = "Sriji";
        // es.age =14;
        // es.print();

        EngStudent es2 = new EngStudent("Sriji", 14, 101, "Mohan");
        es2.print();

    }
}

class Student{
    String name;
    int age;
    int rn;

    Student() {}

    Student(String name, int age, int rn){
        this.name = name;
        this.age = age;
        this.rn =rn;
    }

    void print(){
        System.out.println(name + "," + age  + "," + rn);
    }
}

class EngStudent extends Student{
    String college;
    int rn;

    EngStudent(String name, int age, int rn, String college) {
        super( name, age, rn);
        this.college = college;
    }

    void print(){
        // System.out.println(name + "," + super.age + "," + college + "," + super.rn);
        super.print();
        System.out.println(college);
    }

}