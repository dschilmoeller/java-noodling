package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payrate)
            throws NegativeInputException {

        if(hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        } else if (hours < 0 || payrate < 0){
            throw new NegativeInputException();
        }

        return hours * payrate;
    }

    public static void rethrowException() throws IOException, FileNotFoundException {
        File file = new File("notAfile.txt");
        file.createNewFile(); // note we no longer need a try catch block.
        // the burden is now on the person calling this method.
        // if there is a large number of exceptions, can just throw the superclass (Exception) instead of IOException
        Scanner fileReader = new Scanner(file);
    }

    public static void rethrowExceptionMultiple() throws Exception {
        // note we are now rethrowing exceptions from createNewFile and Scanner.
        File file = new File("notAfile.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
    }
    public static void main(String[] args) {

    }

}
