package Tasks_5th_April;

import java.util.Scanner;

public class Task_Number_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();

        boolean flag= false;

        // 0 and 1 are not prime numbers
        if(num==0 || num==1){
            flag = true; // not prime numbers
        }
        for(int i=2; i<=num/2;i++){
            if(num % 2==0){
                flag= true;
                break;
            }
        }
        if(!flag){
            System.out.println(num+ " is a prime number");
        }
        else {
            System.out.println(num+ " is not a prime number");
        }
    }
}
