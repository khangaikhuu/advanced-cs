package mn.asu.crud;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.Test;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestServer {
    @Before
    public void setup(EchoClient client) {
        client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }
    @After
    public void tearDown(GreetClient client) throws IOException {
        client.stopConnection();
    }

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect(GreetClient client) throws IOException {
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }

    private class EchoClient {
        public void startConnection(String s, int i) {
        }
    }
}
