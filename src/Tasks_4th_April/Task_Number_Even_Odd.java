package Tasks_4th_April;

import java.util.Scanner;

public class Task_Number_Even_Odd {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");

        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
