import java.net.*;

class E9_1_DReceiver {

  public static void main(String args[]) throws Exception {
    DatagramSocket DS = new DatagramSocket(3000);
    byte[] b = new byte[100];
    DatagramPacket DP = new DatagramPacket(b, b.length);
    DS.receive(DP);

    String mes = new String(b);
    System.out.println("message :- " + mes);
  }
}
