package mn.asu.crud.entity;


import mn.asu.crud.entity.GreetClient;


import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;


import java.io.IOException;

import static org.testng.Assert.assertEquals;

class TestClientServer {

    private mn.asu.crud.websocket.EchoClient client;

    @Before
    public void setup() throws IOException {
        client = new mn.asu.crud.websocket.EchoClient();
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
