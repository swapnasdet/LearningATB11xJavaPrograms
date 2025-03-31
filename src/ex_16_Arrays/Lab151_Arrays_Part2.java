package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String [] names= { "Sunday","Monday","Tuesday"};
        System.out.println(names.length); // 3
        System.out.println(names[0] );
        System.out.println(names[2] );
        System.out.println(names[1] );

        String [] atb11x= new String[4];
        atb11x[0]= "Moon";
        atb11x[1]= "Stars";
        atb11x[2]= "Sun";
        atb11x[3]= "Planets";

        System.out.println(atb11x[2] );
        System.out.println(atb11x[3] );
    }
}
