package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {

    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());

//            how would we skip to the next one? would have to be handled in the while loop, not here.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fileReader.close();
        }
        // the above could be written as instead of having multiple catches.
//    } catch (FileNotFoundException | InputMismatchException e){
//        e.printStackTrace();
//    }

    }
}
