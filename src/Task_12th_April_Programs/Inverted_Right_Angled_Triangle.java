package Task_12th_April_Programs;

import java.util.Scanner;

public class Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n= sc.nextInt();

        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
