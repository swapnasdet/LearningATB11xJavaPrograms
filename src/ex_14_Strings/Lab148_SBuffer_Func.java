package ex_14_Strings;

public class Lab148_SBuffer_Func {
    public static void main(String[] args) {
        StringBuffer sbuffer= new StringBuffer("Java");
        sbuffer.append(" Programming");
        System.out.println(sbuffer);
        sbuffer.delete(5,16);
        System.out.println(sbuffer);
        sbuffer.replace(0, 4," C++ ");
        System.out.println(sbuffer);

    }
}
