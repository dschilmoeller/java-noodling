package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary  = getSalary();
        int creditScore = getCreditScore();
//        System.out.println("salary: " + salary + " \n " + "credit: " + creditScore);
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if (qualified){
            System.out.println("You have qualified!");
        } else System.out.println("You have been denied :( ");
    }

    public static double getSalary(){
        System.out.println("What is your salary?");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore(){
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        } else {
            return false;
        }
    }

}
