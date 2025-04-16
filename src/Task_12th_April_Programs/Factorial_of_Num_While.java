package Task_12th_April_Programs;

import java.util.Scanner;

public class Factorial_of_Num_While {
    public static void main(String[] args) {
        Fact_Num();
    }
    public static void Fact_Num(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number for factorial");

        int fact= sc.nextInt();
        int factorial=1;
        int i=1;
        while(i<=fact){
            factorial=(factorial*i);
            i++;
            //if(i==0 || i==1)
              //  break;
        }
        System.out.println(factorial);

    }
}
