package ex_07_Increment_Decrement_Op;

public class Lab073_Post_ID {
    public static void main(String[] args) {
        int a= 10;
        int result= a++; // a = 11
        System.out.println(a); // 10
        System.out.println(result); // 11

        // Line no  | a | Exp
        // 5  | 10 | NA
        // 6  | 11 | 10
        // 7  | 10 | NA
        // 8  | NA | 11
    }
}
