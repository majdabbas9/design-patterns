package observer.server;

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        try {
            Server server = new Server(port);
            System.out.println("Server started on port " + port);

            // 👇 Server runs forever
            while (true) {
                Socket clientSocket = server.getSocket().accept(); // blocking
                System.out.println("New client connected");

                // Handle each client in a new thread
                new Thread(new ClientHandler(clientSocket, server)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
