package Tasks;

public class Task006_CLI_TerOp_MaxNum {
    public static void main(String[] args) {
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);


        //String max_num= (num1 > num2) ? "num1 is max" : "num2 is max";
        String max_num = (num1 > num2) ? (num1 +" is Big compare to " + num2) : (num2 + " is Big compare to " + num1);
        System.out.println(max_num);

        //String max1 = (num1 > num2) ? (num1 +" is Big compare to " + num2) : (num2 + " is Big compare to " + num1);

        int max= (num1 > num2) ? num1: num2;
        System.out.println(max);
    }
}
