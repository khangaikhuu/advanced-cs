package mn.asu.crud.websocket;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestClientServer {

    @Before
    public void setup() {
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
    public void tearDown() {
        client.stopConnection();
    }
}
