package Tasks_4th_April;

import java.util.Scanner;

public class Task_Max_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");

        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();

        if(num1>num2){

            System.out.println(num1 + " is the Maximum Number");
        }
        else {
            System.out.println(num2 + " is the Maximum Number");
        }









    }
}
