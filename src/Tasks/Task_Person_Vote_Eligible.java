package Tasks;

import java.util.Scanner;

public class Task_Person_Vote_Eligible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Age of Voter");
        int age= sc.nextInt();

        if(age >= 18){

            System.out.println(" You are eligible to Vote ");

        }
        else {
            System.out.println(" You are not eligible to Vote");
        }

    }
}
