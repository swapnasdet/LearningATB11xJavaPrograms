package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result= condition1 ? expression1 :(condition2 ? expression2 : expression3)

        // Ternary
        int num=5;
        String result= (num > 10) ?  (num > 20 ? "num>20" : "num<20") :"B";
        System.out.println(result);

    }
}
