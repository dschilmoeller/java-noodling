package basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner (System.in);

        // read integer on the console
        int hours = scanner.nextInt();

        System.out.println("What is your hourly rate?");
        // read double on console.
        double rate = scanner.nextDouble();

        // close input
        scanner.close();

        double payRate = hours * rate;
        System.out.println("Gross pay: " + payRate);
    }
}
