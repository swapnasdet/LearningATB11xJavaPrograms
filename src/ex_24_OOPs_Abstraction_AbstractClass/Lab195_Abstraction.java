package ex_24_OOPs_Abstraction_AbstractClass;
// Notes of Abstraction below
/* Abstraction is a process in java, we hide the implementation details and showing only essential info to the user
 Abstract is a Keyword
 Abstract can be a class or method
 We are hiding important features
 show the essentials
 Car - Steering, clutch, brake, race
 Engine, tyres, gear others are hidden from the user
 if the class doesn't have any abstract methods then it is concrete class(Complete Class)
 we cannot use the modifiers with abstract methods (private, static, final,
 since the body of abstract method cannot be implemented in abstract class. An abstract class cannot be
 instantiated */
public class Lab195_Abstraction {
    public static void main(String[] args) {

    Child c= new Child();
    c.loan50k();
    c.loan25k();

   // Father f1= new Father(); Not possible, we cannot create instance of father as father is an abstract class
        Father f2 = new Child(); // possible through dynamic dispatch


    }
}

abstract class Father{

    abstract void loan50k();

    void loan25k(){
        System.out.println("Given 25k");
    }
}

class Child extends Father{

    @Override
    void loan50k() {

    }
}