package methods;

import java.util.Scanner;

public class GreetUser {

    public static void main(String[] args) {
        String firstName = getUserName();
//        String lastName = getUserLastName();
        greetUser(firstName);
    }

    public static String getUserName(){
        System.out.println("Enter your first name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }
//    public static String getUserLastName(){
//        System.out.println("Enter your last name:");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        scanner.close();
//        return name;
//    }


    public static void greetUser(String name){
        System.out.println("Hello " + name + "!");
    }
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + "?");
    }
}
