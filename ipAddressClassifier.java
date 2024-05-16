import java.util.Arrays;
import java.util.Scanner;

public class ipAddressClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String ipAddress = scanner.nextLine();

        // Split the IP address into octets
        String[] octets = ipAddress.split("\\.");

        // Check the class of IP address
        int firstOctet = Integer.parseInt(octets[0]);
        if (firstOctet >= 1 && firstOctet <= 126) {
            System.out.println("Class: A");
            System.out.println("Type: Public");
        } else if (firstOctet >= 128 && firstOctet <= 191) {
            System.out.println("Class: B");
            System.out.println("Type: Public");
        } else if (firstOctet >= 192 && firstOctet <= 223) {
            System.out.println("Class: C");
            System.out.println("Type: Public");
        } else if (firstOctet >= 224 && firstOctet <= 239) {
            System.out.println("Class: D");
            System.out.println("Type: Multicast");
        } else if (firstOctet >= 240 && firstOctet <= 255) {
            System.out.println("Class: E");
            System.out.println("Type: Reserved");
        } else {
            System.out.println("Invalid IP address!");
        }

    }
}
