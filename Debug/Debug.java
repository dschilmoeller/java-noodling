package Debug;
// Error handling - try and catch pattern.
// NullPointerException
// ArithmeticException
// Finally block also exists - always executes. Close files, recover resources, o/w clean up.
public class Debug {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    try {
      int ratio = length / width;
      System.out.println(ratio);
    } catch(ArithmeticException e) {
      System.err.println("divide by zero error: " + e.getMessage());
    }
        
  }
}