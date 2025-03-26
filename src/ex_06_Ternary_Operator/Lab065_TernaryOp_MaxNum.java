package ex_06_Ternary_Operator;

public class Lab065_TernaryOp_MaxNum {
    public static void main(String[] args) {
        // Find the maximum number between two numbers
        int x = 10;
        int y = 20;
        // 1. using math function
        System.out.println(Math.max(x,y));

        String max= x > y ? "x is max" : "y is max";
        System.out.println(max);

        int maximum= x > y ? x : y;
        System.out.println(maximum);
    }
}
