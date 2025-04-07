package Tasks_6th_April;

import java.util.Scanner;

public class Number_IsDivisible_by_5_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");

        int num= sc.nextInt();
        if( num%5 == 0 && num%11 == 0 ){
            System.out.println(num + " is divisible by 5 and 11");
        } else if ( num%5 == 0 ) {
            System.out.println(num + " is divisible by 5 ");

        } else if ( num%11 == 0 ){
            System.out.println(num + " is divisible by 11");
        }
        else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}
