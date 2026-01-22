package observer.server;

import java.net.*;
import java.io.*;

class ClientHandler implements Runnable {
    private final Socket socket;
    private final Server server;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket socket, Server server) throws IOException {
        this.socket = socket;
        this.server = server;
        this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        this.out = new PrintWriter(this.socket.getOutputStream(), true);
    }

    public PrintWriter getPrintWriter() {
        return this.out;
    }

    public void messageFromServerToSendToClient(String msg) {
        if (msg.equals("kill all")) {
            out.println("kill");
            System.out.println("Client disconnected");
        } else {
            out.println(msg);
        }
    }

    @Override
    public void run() {
        try {
            String message;
            this.server.addClient(this);
            // 👇 keep reading from the client
            while ((message = in.readLine()) != null) {
                System.out.println("Client says: " + message);
                if (message.contains("all")) {
                    this.server.notifyAll(message);
                } else {
                    out.println(message);
                }
            }

        } catch (IOException e) {
            System.out.println("Client disconnected");
        } finally {
            try {
                socket.close();
            } catch (IOException ignored) {
            }
        }
    }
}
