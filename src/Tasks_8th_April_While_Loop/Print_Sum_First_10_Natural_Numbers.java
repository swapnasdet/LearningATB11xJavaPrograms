package Tasks_8th_April_While_Loop;

public class Print_Sum_First_10_Natural_Numbers {
    public static void main(String[] args) {
        Sum_Of_Natural_Numbers();

    }

    public static void Sum_Of_Natural_Numbers(){
        int i=1,sum=0;
        while(i<=10){
            sum=sum+i;
            System.out.println(sum);
            i++;
        }

    }
}
