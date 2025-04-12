package Tasks_8th_April_For_Loop;

public class Print_Even_Number_1_to_20 {

    public static void main(String[] args) {
        //Print_Even_Number_1_to_20 numbers= new Print_Even_Number_1_to_20();
        print_Even_Nums();
    }

    public static void print_Even_Nums(){

        for(int i=1; i<=20; i++){

            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
