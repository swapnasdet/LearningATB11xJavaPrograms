package Tasks;

import java.util.Scanner;

public class Task_Character_IsAlphabet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");

        char ch= sc.next().charAt(0);
        char ch1=Character.toLowerCase(ch);

        if((ch1>='a' && ch1<='z') || (ch1>='A' && ch1<='Z')){
            System.out.println(ch1 + " is an alphabet");
        }
        else {
            System.out.println(ch1+ " is not an alphabet");
        }
    }
}
