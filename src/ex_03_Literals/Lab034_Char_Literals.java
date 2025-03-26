package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {
        //char c1='A'; // A to Z. a to z, !@#$%^&*()_+
        //char c2="A";// this is not a char, its a string
        /*char c2='B';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='1';
        char c7='(';
        char c8=' ';//blank space */

        //Escape Char
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';


        System.out.println("Pramod"+new_line+"Dutta"); // prints Pramod and Dutta in two different lines
        System.out.println("Pramod"+tab_line+"Dutta"); // Pramod Dutta
        System.out.println("Pramod"+back_space+"Dutta"); // PramoDutta  --> deletes 'd' for back space
        System.out.println("Pramod"+carriage_return+"Dutta"); //Dutta --> deletes Pramod for carriage return
        System.out.println("Pramod is a online tutor"+carriage_return+"He teaches Selenium");

        System.out.println("Hello, I am learning Java\n I will learn Selenium\n I will do automation of webapplications");

        System.out.println("Hello, I am learning Java"+new_line+ "I will learn Selenium\n I will do automation of webapplications");

        //storing rupees
        char rupees='₹';
        System.out.println(rupees);

        //storing smileys
        //char laugh_smiley='\u1f60';
        //System.out.println(laugh_smiley);
    }
}
