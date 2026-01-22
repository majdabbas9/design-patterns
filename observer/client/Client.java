package observer.client;

import java.net.*;
import java.io.*;

public class Client {
    private final Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public Client(String url, int port) throws IOException {
        this.socket = new Socket(url, port);
        in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        out = new PrintWriter(this.socket.getOutputStream(), true);
    }

    public void closeSocket() throws IOException {
        this.socket.close();
    }

    public Socket getSocket() {
        return this.socket;
    }

    public BufferedReader getBufferedReader() {
        return this.in;
    }

    public PrintWriter getPrintWriter() {
        return this.out;
    }
}
