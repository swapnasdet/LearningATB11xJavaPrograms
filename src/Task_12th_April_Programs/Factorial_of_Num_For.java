package Task_12th_April_Programs;

import java.util.Scanner;

public class Factorial_of_Num_For {
    public static void main(String[] args) {
        Fact_Num();
    }

    public static void Fact_Num(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int fact= sc.nextInt();
        int factorial=1;
        for(int i=1;i<=fact;i++){
            factorial=(factorial*i);
           // if(i==0 || i==1)
             //   break;
        }
        System.out.println(factorial);

    }
}
