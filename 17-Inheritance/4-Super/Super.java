public class Super {
    public static void main(String[] args){
        EngStudent es = new EngStudent();
        es.name = "Sriji";
        es.age =14;
        es.print();

    }
}

class Student{
    String name;
    int age;
    int rn;

    void print(){
        System.out.println(name + "," + age  + "," + rn);
    }
}

class EngStudent extends Student{
    String college;
    int rn;

    void print(){
        // System.out.println(name + "," + super.age + "," + college + "," + super.rn);
        super.print();
        System.out.println(college);
    }

}