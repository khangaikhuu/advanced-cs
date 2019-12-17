package mn.asu.crud.controller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class EchoTest {
    private EchoClient client;

    @Before
    public void setup() throws IOException {

        client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }

    @After
    public void tearDown() throws IOException {
        client.stopConnection();
    }

}
