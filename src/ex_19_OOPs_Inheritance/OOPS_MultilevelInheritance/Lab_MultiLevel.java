package ex_19_OOPs_Inheritance.OOPS_MultilevelInheritance;

public class Lab_MultiLevel {

    public static void main(String[] args) {

        GrandFather gf= new GrandFather();
        gf.gf();

        System.out.println("--------");

        Father f= new Father();
        f.f();
        f.gf();

        System.out.println("--------");

        Son s1= new Son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
