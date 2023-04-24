import java.net.*; //required for InetAddress Class

public class E7_networking {

  public static void main(String[] args) {
    try {
      InetAddress ip = InetAddress.getByName("www.indusuni.ac.in");

      System.out.println(ip); // ip and host name both
      System.out.println("Host Name: " + ip.getHostName());
      System.out.println("IP Address:" + ip.getHostAddress());

      InetAddress ip1 = InetAddress.getLocalHost();   // local host name and ip 
      System.out.println("\n"+"local host name & ip both :- "+ip1);

      InetAddress ip2 = InetAddress.getByName("10.10.14.170"); //   local host name 
      System.out.println("\n"+"local host name :- "+ip2.getHostName());

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
