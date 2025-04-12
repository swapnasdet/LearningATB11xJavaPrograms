package ex_23_OOPs_Super;
// Super Keyword in java is a reference variable that allows access to method, variables and constructors of parent
// use of super with Variables
// use of super with Methods
// use of super with Constructors

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1= new Car(100);
        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 100;

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Param Constructor");

    }

    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}
    class Car extends Vehicle{
        private int maxSpeed= 281;

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        Car(){
            super(); // Default Constructor of Parent
            //System.out.println("Car- Default Const");
        }

        Car(int a){
            super(10); // Parameterized Constructor of Parent
            //System.out.println("Car- Param Const");
        }

        // Method Overloading
        @Override
        void display() {
            System.out.println(this.maxSpeed); // current class instance variable--281
            //Parent
            System.out.println(super.maxSpeed); // 100
            super.message();
            super.message(10);

            System.out.println("Override");
        }
    }
