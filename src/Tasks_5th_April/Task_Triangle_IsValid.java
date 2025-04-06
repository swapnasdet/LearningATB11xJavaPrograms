package Tasks_5th_April;

import java.util.Scanner;

public class Task_Triangle_IsValid {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        int a= sc.nextInt();
        System.out.println("Enter the second side of triangle");
        int b= sc.nextInt();
        System.out.println("Enter the third side of triangle");
        int c= sc.nextInt();


        if(a+b > c && b+c > a && c+a > b){
            System.out.println("This is a valid triangle");
        }
        else {
            System.out.println("This is not a valid triangle");
        }
    }
}
