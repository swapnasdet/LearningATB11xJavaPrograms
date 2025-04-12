package Tasks_8th_April_While_Loop;

public class Print_Even_Number_1_to_20 {
    public static void main(String[] args) {
        print_Even_Nums();
    }

    public static void print_Even_Nums(){
        int i=1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
