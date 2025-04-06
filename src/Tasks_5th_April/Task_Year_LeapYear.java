package Tasks_5th_April;

import java.util.Scanner;

public class Task_Year_LeapYear {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year");

        int year= sc.nextInt();

        if(year%4==0){
            System.out.println("Year is a Leap Year");
        }
        else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
