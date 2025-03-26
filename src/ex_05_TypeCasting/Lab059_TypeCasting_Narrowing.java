package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {

    public static void main(String[] args) {
        // Implicit Casting -- Narrowing
        int val=200;
        //byte b= val; // Invalid -- Implicit Narrowing is not allowed

        //Explicit Casting -- Narrowing
        int val1= 300;
        byte b= (byte) val1; // Valid -- Explicit Narrowing is allowed but will have data loss
        System.out.println(b); // 44
    }
}
