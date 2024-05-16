 import java.util.Scanner;

public class Subnetting {

    public static void subnetMask(int prefixLength) {
        // Initialize subnet mask to all zeros
        long mask = 0;

        // Calculate the subnet mask
        mask = ~((1L << (32 - prefixLength)) - 1);

        // Print the subnet mask in dotted decimal notation
        System.out.printf("Subnet mask: %d.%d.%d.%d%n", (mask >> 24) & 255, (mask >> 16) & 255, (mask >> 8) & 255, mask & 255);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the prefix length (e.g., 24 for /24 subnet): ");
        int prefixLength = scanner.nextInt();

        if (prefixLength < 0 || prefixLength > 32) {
            System.out.println("Invalid prefix length. Prefix length must be between 0 and 32.");
            return;
        }

        subnetMask(prefixLength);

        scanner.close();
    }
}
 
