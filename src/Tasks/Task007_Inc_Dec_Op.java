package Tasks;

public class Task007_Inc_Dec_Op {
    public static void main(String[] args) {
        int a=10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);


        // A+B+C
        // --a Exp A --> 9, a=9
        // +
        // a++ Exp B --> 9, a=10
        // +
        // a-- Exp C--> 10, a=9

        // A+B+C= 9+9+10= 28, a=9

        int b= 20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);

        // A+B+C
        // --b Exp A --> 19, b=19
        // +
        // b++ Exp B --> 19, b= 20
        // +
        // b-- Exp C --> 20, b=19

        // A+B+c= 19+19+20=58, b=19

    }
}
