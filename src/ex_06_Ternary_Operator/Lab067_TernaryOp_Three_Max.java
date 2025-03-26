package ex_06_Ternary_Operator;

public class Lab067_TernaryOp_Three_Max {
    public static void main(String[] args) {
        // Maximum between three numbers

        int n1=30;
        int n2=12;
        int n3=28;

        // Logic Building

        // Step 1: Find inputs/outputs
        // Input : int -- > n1,n2,n3
        // Output : String --> max number

        // Step 2: Rough logic, Think about it
        // n1>n2, n1>n3  then n1 is max
        // n2>n3, n2>n1 then n2 is max
        // n3>n1, n3>n2 then n3 is max

        int max= (n1 > n2) ? (n1>n3) ? n1:n3 :((n2>n3) ? n2 : n3);
        System.out.println(max);


    }
}
