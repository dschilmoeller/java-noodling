package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
//    Resource must be part of the autocloseable classes within java, e.g. scanner
    public static void main(String[] args) {

        File inputFile = new File("files/numbers.txt");

        try (Scanner fileReader = new Scanner(inputFile)){
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
