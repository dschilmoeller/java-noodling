// again folder structure bad.
// package Introduction;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
  public static void main(String[] args) throws IOException {
    // Your code here:
  FileWriter output = new FileWriter("output.txt");

  String outputText = "Words words words";
  output.write(outputText);

  output.close();
  }
}