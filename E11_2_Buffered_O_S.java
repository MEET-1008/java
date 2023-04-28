import java.io.*;

public class E11_2_Buffered_O_S {

  public static void main(String args[]) throws Exception {
    FileOutputStream FOS = new FileOutputStream("A1.txt");
    BufferedOutputStream BOS = new BufferedOutputStream(FOS);
    String s = "hy meet vaghasiya...";
    byte b[] = s.getBytes();
    BOS.write(b);
    BOS.close();
    FOS.close();
    System.out.println("success");
  }
}
