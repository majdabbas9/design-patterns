package observer.server;

import java.net.*;
import java.util.ArrayList;
import java.util.List;

import observer.client.Client;

import java.io.*;

public class Server {
    private final int port;
    ArrayList<ClientHandler> clients = new ArrayList<>();
    private final ServerSocket serverSocket;

    public Server(int port) throws IOException {
        this.port = port;
        this.serverSocket = new ServerSocket(port);
    }

    public void addClient(ClientHandler client) {
        clients.add(client);
    }

    public void removeClient(ClientHandler client) throws IOException {
        clients.remove(client);
    }

    public void notifyAll(String msg) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                client.messageFromServerToSendToClient(msg);
            }
            if (msg.equals("kill all")) {
                this.clients.clear();
            }
        }
    }

    public ServerSocket getSocket() {
        return this.serverSocket;
    }
}
