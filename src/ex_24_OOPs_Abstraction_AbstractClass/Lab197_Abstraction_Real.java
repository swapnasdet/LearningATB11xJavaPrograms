package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab197_Abstraction_Real {

}

abstract class Employee{

    private String name;
    private String address;
    private int number;
    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
            this.name = name;
            this.address = address;
            this.number = number;
    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " "+ this.address + " " + this.number+" " );
    }
}

class C1 extends Employee{

    @Override
    double computePay() {

        return 0;
    }
}
