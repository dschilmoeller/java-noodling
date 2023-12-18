// error thrown due to file structuring. Is fine and runs. Would be declared public as part of larger system.
// package Introduction;
import java.io.FileReader;
import java.io.IOException;

class Introduction {
  public static void main(String[] args) throws IOException {
    String path = "./input.txt";
    FileReader input1 = new FileReader(path);

    int counter = 0;
    while((counter = input1.read()) != -1) {
      System.out.print((char)counter);
    }

   input1.close();
  }
}