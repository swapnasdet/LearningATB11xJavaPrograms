package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        // ways of creating array
        int [] marks= { 1,2,3,4,5 };

        int[] marks1= new int [5]; // Fixed size
        int marks2[]= new int [3]; // Fixed size

        String[] names= new String[3];
        names[0]= "Hello";
        names[1]= "Good";
        names[2]= "Morning";

        // print array elements 1. by index 2. by for loop
        // 1. by index
        System.out.println(marks[3]); //4
        System.out.println(names[1]); // Good
        System.out.println(names[2]); // Morning
    }
}
