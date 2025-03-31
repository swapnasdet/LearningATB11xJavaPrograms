package Tasks;

import java.util.Scanner;

public class Task008_Triangle_Classifier {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of first side of triangle");
        int a= sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the length of second side of triangle");
        int b= sc1.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter the length of third side of triangle");
        int c= sc2.nextInt();

        if(a<=0 || b<=0 || c<=0) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if(a==b && a==c){
            System.out.println("This is an Equilateral Triangle ( All sides are equal) ");
            System.exit(0);
        } else if (a==c || b==c || a==b) {
            System.out.println("This is an Isosceles Triangle (Two sides are equal )");
            
        }
        else{
            System.out.println("This is an Scalene Triangle");
        }

    }
}
