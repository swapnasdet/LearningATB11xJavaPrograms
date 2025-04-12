package ex_25_OOPs_Abstraction_Interface;

public class Lab199_I {
    public static void main(String[] args) {
        Car1 c1= new Car1();
        c1.drive();
    }
}


class Car1 implements Brakes, Engine1{

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }
    @Override
    public void applyBrake() {
        System.out.println("Apply Brake ");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}

interface Brakes{

    void applyBrake();

}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("Concrete");
    }

}
