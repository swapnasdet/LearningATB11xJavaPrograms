package Task_12th_April_Programs;

import java.util.Scanner;

public class Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
