package ex_05_TypeCasting;

public class Lab058_TypeCasting_Widening_Explicit {
    public static void main(String[] args) {
        //Explicit Casting -- Widening

        byte b = 10;
        int a= (int) b; // Valid -- in case of widening explicit typecasting is not required as
        // Java Compiler is taking care internally while doing implicit casting
        System.out.println(a);

        //Implicit Casting -- Widening

        int a1=b; // Valid -- Implicit Casting -- Automatically
        System.out.println(a1);


    }
}
