package loops;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        int numberOfStudents = 2;
        int numberOfTests = 3;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< numberOfStudents; i++){

            double total = 0;

            for (int j = 0; j< numberOfTests; j++){
                System.out.println("Score for test #"+(j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
