package Practice;

public class Max_ArrayElements {
    public static void main(String[] args) {
        int[] array = { 55, 64,73, 82,45,102 };
        int max_output=give_me_max(array);
        System.out.println(max_output);

    }

    private static int give_me_max(int[] array){
        int max= array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
