package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        System.out.println(temp_sum(6,3));
        System.out.println(temp_sum(3.16, 5.12));
        System.out.println(temp_sum("Hello", "World!"));
    }

    //By using generics all the methods with different data types can be operated in a single method as below


    //Method Overloading
    static int temp_sum(int a, int b){
        return a+b;
    }
    // if we want to use double datatype we have to do method overloading
    static double temp_sum(double a, double b){
        return a+b;
    }

    static String temp_sum(String a, String b){
        return a+b;
    }

    // expand to see the method overloading code



}
