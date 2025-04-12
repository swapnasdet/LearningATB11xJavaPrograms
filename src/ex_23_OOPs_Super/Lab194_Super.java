package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.display();
    }

}

class GOD{

    void sound(){
        System.out.println("God! ");
    }
}

class Animal extends GOD{
    protected String color="white";

    void sound(){
        System.out.println("Animal Sound");
        super.sound(); // God
    }

}

class Dog extends Animal{
    private String color="Black";

    void display(){
        System.out.println(this.color); // Black
        System.out.println(super.color); // White
        super.sound();
    }
}