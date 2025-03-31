package ex_14_Strings;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        //Strings

        String S0 = "Pramod"; // In JVM it is stored in String constant pool
        String S1 = new String("Pramod"); // Stored in Object area

        StringBuffer strBuffer = new StringBuffer("Pramod");
        StringBuilder strBuilder= new StringBuilder("Pramod");

        System.out.println(S0);
        System.out.println(S1);
        System.out.println(strBuffer);
        System.out.println(strBuilder);
    }
}
