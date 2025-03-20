package ex_02_Java_Basics_part2;

public class Lab025_Constants {
    public static void main(String[] args) {
        final int a=10;
        //int a=12;
        // @line5 int a is declared as final and assigned value 10, so value of int a=12 cannot be changed @line6
        System.out.println(a);
        final float pi=3.14f;
        //pi=80; // value cannot be changed as pi is final
        System.out.println(pi);
    }
}
