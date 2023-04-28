import java.io.*;
import java.net.*;
import java.util.*;

public class E8_2_client {

  public static void main(String[] args) throws Exception {
    Socket s = new Socket("Meet", 1111);
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    dout.writeUTF(" hello meet vaghasiya ");
  }
}
