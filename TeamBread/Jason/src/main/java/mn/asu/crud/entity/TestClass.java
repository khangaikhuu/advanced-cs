package mn.asu.crud.entity;
import org.junit.Test;

import java.io.IOException;

public class TestClass {

    public void setup() {
        EchoClient client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }

    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
    public void tearDown() throws IOException {
        GreetClient client = null;
        client.stopConnection();
    }

    private void assertEquals(String hello_client, String response) {
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        GreetClient client = null;
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }
}