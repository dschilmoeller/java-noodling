package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade");

        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();

        scanner.close();


        String message = switch (grade){
            case "A", "B"-> "Excellent job";
            // case "B" -> "Good work, keep at it!";
            case "C" -> {
                System.out.println("Secret message");
                // Do some things - then yield a result. Can manipulate values.
                yield "You're doing okay, but try harder";
            }
            case "D" -> "You really must try harder next time.";
            case "F" -> "Report for immediate butterification in the lab.";
            default -> "That's not a letter Grade bub.";
        };

        System.out.println(message);
    }
}
