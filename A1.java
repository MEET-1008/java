import java.net.*;
import java.io.*;

public class A1 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 1234);

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // send a message to the server
        String message = "Hello, server!";
        output.write(message.getBytes());

        // read the server's response
        byte[] buffer = new byte[1024];
        int bytesRead = input.read(buffer);
        String response = new String(buffer, 0, bytesRead);

        System.out.println("Server response: " + response);

        // close the socket
        socket.close();
    }
}