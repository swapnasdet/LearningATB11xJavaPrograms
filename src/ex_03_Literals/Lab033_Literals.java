package ex_03_Literals;

public class Lab033_Literals {
    public static void main(String[] args) {

        int age=56;

        //Binary Literal
        int binary_num=0b1010; // Decimal system=10

        //Octal base -> 8
        int octal=0101;

        //Hexadecimal literals-16
        int hex=0Xface;
        System.out.println(age); // 56
        System.out.println(binary_num); // 10
        System.out.println(octal); // 65
        System.out.println(hex); //64206

    }
}
