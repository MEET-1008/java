import java.io.*;
import java.net.*;

public class E8_1_server {

  public static void main(String s1[]) {
    try {
      ServerSocket ss = new ServerSocket(1111);
      Socket s = ss.accept();
      DataInputStream obj1 = new DataInputStream(s.getInputStream());

      String str = (String) obj1.readUTF();
      System.out.println("message :- " + str);
      ss.close();
    } 
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
