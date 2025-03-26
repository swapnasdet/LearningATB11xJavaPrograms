package ex_06_Ternary_Operator;

public class Lab066_TernaryOp_Even_Odd {
    public static void main(String[] args) {
        int num=13;

        String result= (num%2==0) ? "num is even" : "num is odd";
        System.out.println(result);
    }
}
