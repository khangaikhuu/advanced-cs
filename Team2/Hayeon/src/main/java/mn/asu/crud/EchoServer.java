package mn.asu.crud;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class EchoServer {
    public void start(int port) throws IOException {
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
    @Before
    public void setup(){
        client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }
    @After
    public void tearDown() {
        client.stopconnection();
    }
}
