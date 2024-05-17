import java.io.*;
import java.net.*;

public class tcpserver {
    private static final int PORT = 5500;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                receiveFile(socket);
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void receiveFile(Socket socket) throws IOException {
        byte[] buffer = new byte[1024];
        InputStream inputStream = socket.getInputStream();

        String fileName = "received_file.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        System.out.println("File received and saved as: " + fileName);

        fileOutputStream.close();
    }
}
