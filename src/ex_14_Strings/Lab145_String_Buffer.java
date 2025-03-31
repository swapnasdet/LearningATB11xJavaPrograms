package ex_14_Strings;

public class Lab145_String_Buffer {
    public static void main(String[] args) {

        StringBuffer sbuffer= new StringBuffer("Pramod");
        sbuffer.append("Dutta");
        System.out.println(sbuffer);
        System.out.println(sbuffer.reverse());

        String s1= "Hello";
        String s2= " World";
        String s3= s1+s2;

        System.out.println(s3);
        System.out.println(s1);
    }
}
