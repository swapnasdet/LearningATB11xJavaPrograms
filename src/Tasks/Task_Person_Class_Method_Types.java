package Tasks;

public class Task_Person_Class_Method_Types {
    public static void main(String[] args) {


        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
    Person p1= new Person();
    p1.Welcome_Onboard();
    p1.Admit_Confirm("Vicky");
    p1.Admission_No();
    p1.Student_Details("Vicky","Vicky@gmail.com","ATB11x");

    }
}

class Person {
    String name;
    int id;
    //long phone;
    String course;
    String email;
    //String gender;

    // 1.Without Parameters and Without Return Type
    void Welcome_Onboard() {
        System.out.println("Welcome to ATB11xJavaProgram");

    }
    // 3.With Parameters and Without Return Type
    void Admit_Confirm(String name){
        System.out.println("Hello Thank you for the Payment, your admission is confirmed " + name);

    }
    // 2.Without Parameters but With Return Type
    public int Admission_No(){
        id=123;
        System.out.println("Your Admission No is "+ id);
        return id;
    }

    // 4. With Parameters and With Return Type
    public String Student_Details(String name, String email, String course ) {
        System.out.println("Your Details are "+"Name: "+name+" " +"Email: "+ email+" "+ "Course: "+" "+ course);
        return ( "name"+name +"email"+ email+ "course"+ course);
    }

}