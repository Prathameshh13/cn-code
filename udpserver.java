import java.net.*;
import java.io.*;

public class udpserver {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket bound to port 2000
        DatagramSocket ds = new DatagramSocket(2000);

        // Create a byte array to store received data
        byte[] b = new byte[100];

        // Create a DatagramPacket to receive data
        DatagramPacket dp = new DatagramPacket(b, b.length);

        // Receive data into the DatagramPacket
        ds.receive(dp);

        // Convert the received data to a String
        String msg = new String(dp.getData());

        // Print the received message
        System.out.println("Received message: " + msg);

        // Close the DatagramSocket
        ds.close();
    }
}
