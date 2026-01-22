package observer.client;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Client c = new Client("localhost", Integer.parseInt(args[0]));

            // Separate thread for reading from the server
            new Thread(() -> {
                try {
                    String message;
                    while ((message = c.getBufferedReader().readLine()) != null) {
                        if (message.equals("kill")) {
                            System.out.println("you have been disconnected.");
                            c.closeSocket();
                            System.exit(0);
                        }
                        System.out.println("message from server: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Server connection closed.");
                    System.exit(0);
                }
            }).start();

            // Main thread handles user input
            Scanner scanner = new Scanner(System.in);
            String message_out;
            while (true) {
                message_out = scanner.nextLine();
                if (message_out.equals("stop")) {
                    c.closeSocket();
                    System.exit(0);
                }
                c.getPrintWriter().println(message_out);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
