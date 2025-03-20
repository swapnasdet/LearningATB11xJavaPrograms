package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name="pramod";
        String last_name="dutta";

        int a=10;
        int b=10;

        System.out.println(first_name+last_name+a+b); // pramoddutta1010
        System.out.println(first_name+last_name+(a+b)); // pramoddutta20
        System.out.println(a+b+first_name+last_name); // 20pramoddutta
    }
}
