package arrays;

import java.util.Random;
import java.util.Arrays;

public class LotteryTicket {

    // this is a CONSTANT. Variable should/cannot be changed. Made clear by being in all caps.
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicekt(ticket);
    }

    private static void printTicekt(int[] array) {
        // sort array in ascending order.
        Arrays.sort(array);
        System.out.print("Ticket: | d");
        for(int number : array) {
            System.out.print(number + " | ");
        }

//        alternate method:
//        for(int i = 0; i<array.length; i++){
//            System.out.println(array[i] + " | ");
//        }
    }

    /**
    Generates a number between 1 and the MAX_TICKET_NUMBER. Checks to ensure number is unique.
     **/
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor){
        for(int value : array){
            if (value == numberToSearchFor) return true;
        }
        return false;
    }
}
