import java.io.*;

public class E11_1_Buffered_I_S {

  public static void main(String args[]) throws Exception {
    FileInputStream FIS = new FileInputStream("A1.txt");
    BufferedInputStream BIS = new BufferedInputStream(FIS);
    int i;
    while ((i = BIS.read()) != -1) {
      System.out.print((char) i);
    }
    BIS.close();
    FIS.close();
  }
}
