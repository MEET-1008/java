import java.net.*; 
import java.io.*;
import java.util.*;
public class E8_1_client {

public static void main(String[] args){  

	 try {      
 			Socket s=new Socket("localhost",1111); 
				DataOutputStream dout=new  DataOutputStream(s.getOutputStream()); 
            Scanner sc= new Scanner(System.in);
			System.out.println("Enter redius value");
			int r= sc.nextInt();
			String rd= new String();
			rd=Integer.toString(r);
				 dout.writeUTF(rd);  
 					//Writes string to underlying o/p   	       stream
                }
  		catch(Exception e)
  			{System.out.println(e);}  
  
}
}