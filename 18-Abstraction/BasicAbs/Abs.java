public class Abs {
    public static void main(String[] args) {

    // Car car =new ElectricCar();
    Car car =new FuelCar();
    car.start(); 
    car.accelerate();
    car.brake();
        
    }
}

abstract class Car {
    void start() {
        System.out.println("car started");
    }

    abstract void accelerate() ;

    abstract void brake() ;
}

class FuelCar extends Car {
    @Override   // YE BATA RAHA HAI accelerate and brake hamne 
    void accelerate() { // alag se implement kiya hai uper wale ka use nahi kar rahe hai
        System.out.println("Fuel car is accelerating. ");
      
    }
    @Override
    void brake() {
        System.out.println("Fuel car is stooping. ");
        
    }

}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("ElectricCar is accelerating. ");

    }
    @Override
    void brake() {
        System.out.println("ElectricCar is stopping. ");
        
    }
}