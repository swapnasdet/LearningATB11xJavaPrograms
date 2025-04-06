package Tasks_4th_April;

import java.util.Scanner;

public class Task_Charac_Vowel_Consonant {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Character");

        char ch= sc.next().charAt(0);
        char ch1= Character.toLowerCase(ch);
        System.out.println(ch1);

        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
            System.out.println(ch+ " is a vowel");
        }
        else{
            System.out.println(ch+ " is a consonant");
        }


    }
}
