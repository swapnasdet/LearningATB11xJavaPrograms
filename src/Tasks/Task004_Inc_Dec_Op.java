package Tasks;

public class Task004_Inc_Dec_Op {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A + B + C
        // ++a --> Exp A--> 11, a=11
        // +
        // a++ --> Exp B--> 11, a=12
        // +
        // a++ --> Exp C--> 12, a=13
        // A+B+C--> Exp A + Exp B + Exp C --> 11+11+12= 34, a=13


    }
}
