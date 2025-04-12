package Tasks_8th_April_While_Loop;

public class Print_Mul_Table_7 {
    public static void main(String[] args) {
        print_Mul_Table7();
    }

    public static void print_Mul_Table7(){
        int table=7;
        int i=1;
        while(i<=10){
            System.out.println(table+"*"+i+" "+"="+" "+table*i);
            i++;
        }

    }
}
