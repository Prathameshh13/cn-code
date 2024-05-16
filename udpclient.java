import java.net.*;
import java.io.*;

public class udpclient {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket
        DatagramSocket ds = new DatagramSocket();

        // Define the data to be sent
        byte[] b = "Hello".getBytes();

        // Get the IP address of the server (localhost) and the port (2000)
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 2000;

        // Create a DatagramPacket containing the data, IP address, and port
        DatagramPacket dp = new DatagramPacket(b, b.length, ip, port);

        // Send the DatagramPacket to the server
        ds.send(dp);

        // Close the DatagramSocket
        ds.close();
    }
}
