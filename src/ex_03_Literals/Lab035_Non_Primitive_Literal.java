package ex_03_Literals;

public class Lab035_Non_Primitive_Literal {
    public static void main(String[] args) {
        //Primitive Data Type (Defined by java guys)
        //Min, Max, size is defined
        byte b=10; // 1 Byte= 8 bits
        int age=49; // 4 Byte=32 bits

        //Non Primitive (Defined by users) also called as Reference Data type
        //Size is not defined, no max, min
        //String, Arrays, Classes, enum
        String name="Pramod";
        //int[] array= new int[5];

        System.out.println(b);
        System.out.println(age);
        System.out.println(name);
    }
}
