package exceptions;

public class NegativeInputException extends Exception {

    public NegativeInputException(){
        this("Input must be greater than or equal to 0");
//        this calls the constructor that matches the sent argument -> in this case, line 10 with the above string.
    }

    public NegativeInputException(String message){
        super(message);
    }
}
