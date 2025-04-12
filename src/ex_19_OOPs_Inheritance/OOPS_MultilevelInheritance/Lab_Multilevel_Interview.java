package ex_19_OOPs_Inheritance.OOPS_MultilevelInheritance;
// **************Dynamic Dispatch****************
// 1. In case of D.Dispatch, we can only call the same name functions or behaviour by using gf, f reference
// 2. we can create Son class object with father and Grand father reference
public class Lab_Multilevel_Interview {

    public static void main(String[] args) {

       // Son s1= new GrandFather(); // Son is present when GF was born // Invalid
        // Son s2= new Father(); //Invalid
        Son amit= new Son(); // Valid

        //Dynamic Dispatch-- we can have grand father references on son object
        GrandFather g1= new Son(); // GrandFather is present when Son was born // Valid
        GrandFather g2= new Father(); // Valid
        Father f2= new Son(); // Valid

        g1.home();// calls the Son home method,as g1 is the object is for the Son, here we dont go with the reference
        f2.home();// this also calls the Son home method, as f2 is the object is for Son
        g2.home();// calls the father home method, as g2 is the reference for father
        // Father f3= new GrandFather(); // Father is present when GrandFather is born // Invalid

        //WebDriver driver = new ChromeDriver();



    }
}
