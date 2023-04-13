import java.net.*; 
import java.io.*;

public class E8_2_server {

public static void main(String s1[])
{
try{
ServerSocket ss=new ServerSocket(1111);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("message="+str);
int r=Integer.parseInt(str);
double area=3.14*r*r;
System.out.println("Area=="+area);
ss.close();
}
catch(Exception e)
{System.out.println(e);}
}
}