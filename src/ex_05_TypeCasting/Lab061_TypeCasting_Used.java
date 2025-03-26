package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course=100;
        float GST= 18.45f;

      //  int total= course+GST; // Narrowing -- Implicit casting is not allowed

        int total1= course+(int)GST; // Narrowing -- Explicit casting -- data loss
        System.out.println(total1); // 118

        float total2= course+GST; // Widening -- Implicit-- automatically happening
        float total3= course+(float)GST; // Widening -- Explicit
        System.out.println(total2); // 118.45
        System.out.println(total3); // 118.45

    }
}
