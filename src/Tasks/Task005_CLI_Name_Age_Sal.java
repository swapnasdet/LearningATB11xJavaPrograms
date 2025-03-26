package Tasks;

public class Task005_CLI_Name_Age_Sal {
    public static void main(String[] args) {
        String name= args[0];
        String st_age= args[1];
        int age= Integer.parseInt(st_age);

        String st_sal= args[2];
        int sal= Integer.parseInt(st_sal);

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
    }
}
