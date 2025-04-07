package Tasks_6th_April;

import java.util.Scanner;

public class Convert_Days_Year_Month_Days {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days");

        int total_days= sc.nextInt();

        int years= total_days / 365;
        int remaining_days= total_days % 365;

        int months= remaining_days / 30;
        int days= remaining_days % 30;

        System.out.print(years + " years"+ " " +months + " months" + " "+ days +" " + "days");

    }
}
