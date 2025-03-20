package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less than
        // <= Less than equal to
        // > Greater than
        // >= Greater than equal to
        // == Equal to
        // != Not equal

        // All of them result in Boolean output

        int a=10;
        int b=30;
        boolean c= a>b; // 10> 30-- false
        System.out.println(c); // false


        int age_mamitha= 34;
        int age_pramod= 34;
        boolean result= age_mamitha>=age_pramod;
        System.out.println(result); // true
    }
}
