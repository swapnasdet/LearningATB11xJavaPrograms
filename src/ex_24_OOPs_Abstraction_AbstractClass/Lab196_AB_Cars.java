package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        WagonR car= new WagonR();
        car.drive();
    }

}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("Normal Function");
    }
}

class WagonR extends Engine{ // complete class- no abstract methods

    @Override
    void startEngine() {
        System.out.println("Starting the Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Car");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
