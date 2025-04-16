package Task_12th_April_Programs;

public class Cal_Sum_Num_1_to_100 {
    public static void main(String[] args) {
       Calc_Sum();
    }

    public static void Calc_Sum(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
