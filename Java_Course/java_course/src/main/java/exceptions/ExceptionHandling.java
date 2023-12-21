package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
//            let's do everything in main.
        File file = new File("resources/nonexistent.txt");
//        file.createNewFile(); // note this alone already is throwing an IO exception error.

        try {
            file.createNewFile();
        } catch(IOException e) {
            System.out.println("An error has occurred, exiting gracefully because: " + e.getMessage());
        }
    }
}
