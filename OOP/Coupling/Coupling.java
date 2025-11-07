package OOP.Coupling;
//Loose Coupling...
interface Engine {
    void startEngine();
}
class PetrolEngine implements Engine {
    public void startEngine() {
        System.out.println("Petrol Engine started...");
    }
}
class DieselEngine implements Engine {
    public void startEngine() {
        System.out.println("Diesel Engine started...");
    }
}
class Car {
    private Engine engine;   // Loose Coupling
    // Constructor Injection (Dependency Injection)
    Car(Engine engine) {
        this.engine = engine;
    }
    void startCar() {
        engine.startEngine();
    }
}
public class Coupling {
    public static void main(String[] args) {
        Engine petrol = new PetrolEngine();
        Car car1 = new Car(petrol);
        car1.startCar();

        Engine diesel = new DieselEngine();
        Car car2 = new Car(diesel);
        car2.startCar();
    }
}



//Tight Coupling

//class Engine {
//    void startEngine() {
//        System.out.println("Engine started...");
//    }
//}

//class Car {
//    Engine engine = new Engine();  // Tight Coupling
//
//    void startCar() {
//        engine.startEngine();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.startCar();
//    }
//}