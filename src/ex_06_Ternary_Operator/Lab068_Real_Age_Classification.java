package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // take inputs from user or runtime inputs
        String age1= args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String); // true

        int age= Integer.parseInt(age1);

        String result= (age < 18) ? "Minor" : (age <65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
