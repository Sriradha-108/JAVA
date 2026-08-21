public class Demo2 {
    public static void main(String[] args){
        // Animal a = new Animal(); // cannot instantiate 
        Animal a = new Dog("Puapi");
        a.makesound();

    }
}

abstract class Animal {
    String name;

    Animal(String name){   //constructor
        this.name = name;
    }
    abstract void makesound();

    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {

    Dog(String name){
        super(name);  //called parent constructor
    }
    @Override
    void makesound(){
        System.out.println("Making working sound ");

    }
}

// Abstract classes. 
// 1.Cannot be instantiated directly 
// 2.Can contain abstract method (method without implementations)
// 3.Can also contain normal methods 
// 4.Is meant to be extended  

// Question
// 1.Can abstract classes have constructors? --> yes
// 2.Can abstract classes be final? --> No
// 3.Can abstract classes have static methods/variables? --> yes
// 4.Can abstract classes have private methods? --> yes but non abstract
// 5.Can abstract classes have final methods? --> yes But non abstract. 
// 6.Can abstract classes have no abstract methods? --> yes 