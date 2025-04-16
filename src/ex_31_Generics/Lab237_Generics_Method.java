package ex_31_Generics;

public class Lab237_Generics_Method {
    public static void main(String[] args) {
        System.out.println(temp_sum(6,3));
        System.out.println(temp_sum(3.16, 5.12));
        System.out.print(temp_sum("Hello", "World!"));
    }

    // we can use any letter in place of T, like G, K, Pramod anything can be used to indicate Generics
    static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
