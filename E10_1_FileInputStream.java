import java.io.*;

class E10_1_FileInputStream {

  public static void main(String args[]) throws Exception {
    FileInputStream fis = new FileInputStream("A1.txt");
    int a ;
    while ((a = fis.read()) != -1) {
      System.out.print((char) a);
    }
    fis.close();
  }
}
