package mn.asu.crud.websocket;


import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;


import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestClientServer {

    private EchoClient client;

    @Before
    public void setup() throws IOException {
        client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }

    @After
    public void tearDown() throws IOException {
        client.stopConnection();
    }
}
