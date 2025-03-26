package Tasks;

import java.util.Scanner;

public class Task003_GradeCalculator {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");

        int Score=sc.nextInt();

        String grade= (Score >= 90 && Score <= 100) ? "Grade A" :
                      (Score >= 80 && Score <= 89) ? "Grade B" :
                              (Score >= 70 && Score <= 79) ? "Grade C" :
                                      (Score >= 60 && Score <= 69) ? "Grade D" : "Grade E";
        System.out.println(" Your grade is "+ grade);


    }
}
