import java.net.*;

class E9_2_DSender {

  public static void main(String args[]) throws Exception {
    DatagramSocket DS = new DatagramSocket();
    String str = "hello meet vaghasiya";
    InetAddress IP = InetAddress.getByName("localhost");
    int port = 3000;
    DatagramPacket DP = new DatagramPacket(
      str.getBytes(),
      str.length(),
      IP,
      2000
    );
    DS.send(DP);
  }
}
