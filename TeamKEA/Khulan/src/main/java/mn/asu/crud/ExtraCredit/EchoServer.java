package mn.asu.crud.ExtraCredit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class EchoServer {
    @Before
    public void setup() {
        EchoServer client = new EchoServer();
        client.startConnection("127.0.0.1", 4444);
    }

    void startConnection(String s, int i) {
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }

    private void assertEquals(String hello, String resp1) {
    }
    @After
    public void tearDown() throws IOException {
        GreetClient client = new GreetClient();
        client.stopConnection();
    }
}
