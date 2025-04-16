package Task_12th_April_Programs;

import java.util.Scanner;

public class Multiplication_Table_With_UserInput {
    public static void main(String[] args) {
        mul_Table();
    }

    public static void mul_Table(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the table number");

        int num=sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(num+ "*" + i+" " + "=" + num*i);
            i++;
        }

    }
}
