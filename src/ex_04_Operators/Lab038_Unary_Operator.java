package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        //Unary Operator
        int a= +10;
        int b= -110;
        int result=a+b;
        System.out.println(a); // 10 --> symbol + is not printed in the output for unary operator
        System.out.println(b); // -110 --> symbol - gets printed in the output for unary operator
        System.out.println(result);  // -100

        int c=-1;
        c=c+1;
        System.out.println(c); //0
    }
}
