package mn.asu.crud;

import java.net.*;
import java.io.*;

public class EchoServer {
    public void start(int port, ServerSocket serverSocket, Socket clientSocket, PrintWriter out, BufferedReader in) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (".".equals(inputLine)) {
                out.println("good bye");
                break;
            }
            out.println(inputLine);
        }
    }
}
