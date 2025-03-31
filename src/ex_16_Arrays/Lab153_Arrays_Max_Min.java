package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array =  { 56, 37, 12, 78, 43, 94, 10, 78  };

        int max_output=give_me_max(array);
        System.out.println(max_output);

    }

    private static int give_me_max(int[] array) {
        int max=array[0];

        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
