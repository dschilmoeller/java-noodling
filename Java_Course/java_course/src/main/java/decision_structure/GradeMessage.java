package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade");

        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();

        scanner.close();

        String message;

        // Fall Through: Omitting break statement results in next case executing.
        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Good work, keep at it!";
                break;
            case "C":
                message = "You're doing okay, but try harder";
                break;
            case "D":
                message = "You really must try harder next time.";
                break;
            case "F":
                message = "Report for immediate butterification in the lab.";
                break;
            default:
                message = "That's not a letter Grade bub.";
                break;
        }

        System.out.println(message);
    }
}
