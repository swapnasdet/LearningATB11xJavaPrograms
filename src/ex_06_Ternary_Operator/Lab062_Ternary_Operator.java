package ex_06_Ternary_Operator;

public class Lab062_Ternary_Operator {
    public static void main(String[] args) {
        int age=40;
        String canIVote= age>=18 ? "Yes, You can vote" : "No, You can't Vote";
        System.out.println(canIVote);
    }
}
