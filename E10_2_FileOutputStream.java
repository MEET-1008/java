import java.io.*;

public class E10_2_FileOutputStream {

  public static void main(String args[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("A1.txt");
    String s = "file editing";
    byte b[] = s.getBytes(); 
    fos.write(b);
    fos.close();
    System.out.println("success...");
  }
}
