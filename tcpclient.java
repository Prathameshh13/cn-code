import java.io.*;
import java.net.*;

public class tcpclient {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5500;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);

            // Send text file
            sendFile(socket, "script.txt");

            // Send audio file
            // sendFile(socket, "audio_cn.mp3");

            // Send video file
            // sendFile(socket, "Video_cn.mp4");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendFile(Socket socket, String fileName) throws IOException {
        File file = new File(fileName);
        byte[] buffer = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(file);
        OutputStream outputStream = socket.getOutputStream();

        int bytesRead;
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        System.out.println("File " + fileName + " sent successfully.");
        fileInputStream.close();
    }
}
