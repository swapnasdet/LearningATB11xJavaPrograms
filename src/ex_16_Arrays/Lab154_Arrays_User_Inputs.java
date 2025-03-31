package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Arrays_User_Inputs {
    public static void main(String[] args) {

        // 1. Declare the Array Size using Scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();

        // 2. Create an array with size
        int[] numbers_marks= new int[size];
        //String[] numbers_marks= new String[size]; *** string array

        // 3. Taking user inputs to the array using for loop

        for(int i = 0; i<numbers_marks.length; i++){
            System.out.println("Enter the marks");
            numbers_marks[i]=sc.nextInt();
            // numbers_marks[i]=sc.next(); *** string array
        }
        System.out.println("------");
        // 4. Printing the array values

        for(int i=0; i<numbers_marks.length; i++){
            System.out.println(numbers_marks[i] );
        }
        sc.close();




    }
}
