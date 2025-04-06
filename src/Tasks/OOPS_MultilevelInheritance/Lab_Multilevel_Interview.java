package Tasks.OOPS_MultilevelInheritance;

public class Lab_Multilevel_Interview {

    public static void main(String[] args) {

       // Son s1= new GrandFather(); // Son is present when GF was born // Invalid
        // Son s2= new Father(); //Invalid
        Son amit= new Son(); // Valid

        //Dynamic Dispatch-- we can have grand father references on son object
        GrandFather g1= new Son(); // GrandFather is present when Son was born // Valid
        GrandFather g2= new Father(); // Valid
        Father f2= new Son();

        // Father f3= new GrandFather(); // Father is present when GrandFather is born // Invalid

        //WebDriver driver = new ChromeDriver();



    }
}
