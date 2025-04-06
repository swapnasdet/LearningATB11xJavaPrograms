package Tasks;

import java.util.Scanner;

public class Task_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        double acc_bal= 10000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");

        int withdrawal_amount=sc.nextInt();

        if(withdrawal_amount <= 0){
            System.out.println("Withdrawal amount should be more than zero");

        } else if (withdrawal_amount<acc_bal){
            double available_bal=(acc_bal-withdrawal_amount);
            System.out.println(withdrawal_amount+ " is withdrawan successfully");
            System.out.println(available_bal+ " is the available balance");

        }
        else{

            System.out.println("Withdrawal Amount Exceeded Account Balance");

        }


    }
}

/*public void Withdrawal(){



}*/