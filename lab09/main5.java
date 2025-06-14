package lab09;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WhatsApp whatsapp = new WhatsApp();

        System.out.print("Enter the message you want to send: ");
        String message = scanner.nextLine();

        System.out.print("Enter the recipient's name: ");
        String recipient = scanner.nextLine();

        whatsapp.send(message, recipient);

        System.out.println("\nMessage sent! Let's now receive the message.");
        String receivedMessage = whatsapp.receive();
        System.out.println("Received message: " + receivedMessage);

        scanner.close();
    }
}