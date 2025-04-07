package Tasks_6th_April;

import java.util.Scanner;

public class Determine_Type_of_Website {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the website address");

        String website= sc.next();
        if (website.endsWith(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (website.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (website.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (website.endsWith(".net")){
            System.out.println("The website type is: Network-related website");
        } else if (website.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        }
        else{
            System.out.println("Unknown or other types of websites");
        }

    }
}
