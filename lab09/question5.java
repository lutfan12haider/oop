package lab09;

import java.util.Scanner;

interface MessageService {
    void send(String message, String recipient);
    String receive();
}

class WhatsApp implements MessageService {
    private String receivedMessage;

    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending message: '" + message + "' to " + recipient + " via WhatsApp.");
        this.receivedMessage = message;
    }

    @Override
    public String receive() {
        return this.receivedMessage;
    }
}


