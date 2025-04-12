package Tasks_8th_April_For_Loop;

public class Print_Sum_First_10_Natural_Numbers {
    public static void main(String[] args) {
        Sum_Of_Natural_Numbers();;
    }

    public static void Sum_Of_Natural_Numbers(){
        int sum=0;

        for(int i=1; i<=10; i++){
            sum= sum+i;

        }
        System.out.println(sum);
    }
}
