package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ +  ++a); // 22
        System.out.println(a); // 12

        // A + B
        // a++ -> A -> ExpA -> 10, a-> 11
        // +
        // ++a -> B -> ExpB -> 12, a-> 12

        // A+B --> EXPA + EXPB= 10 + 12= 22, a=12
    }
}
