package Tasks_5th_April;

/*
10) Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)

1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output.

📌 Grading Criteria (Example)

Marks Range Grade 

90 - 100   A+ 
80 - 89     A
70 - 79      B
60 - 69     C
50 - 59      D
40 - 49      E

Below 40   Fail
 */
import java.util.Scanner;

public class Task_Calculate_Grade {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marks");

        int marks= sc.nextInt();

        if( marks<0 && marks>100){
            System.out.println("Please enter the valid marks between 0 and 100");
        } else if (marks>=90 && marks<100) {
            System.out.println("Grade A+");
        }
        else if(marks>=80 && marks<89){
            System.out.println("Grade A");
        } else if (marks>=70 && marks< 79) {
            System.out.println("Grade B");
        }
        else if (marks>=60 && marks< 69) {
            System.out.println("Grade C");
        }
        else if (marks>=50 && marks< 59) {
            System.out.println("Grade D");
        } else if (marks>=40 && marks<49) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }
    }

}
