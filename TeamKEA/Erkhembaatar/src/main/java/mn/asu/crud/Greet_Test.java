package mn.asu.crud;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Greet_Test {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}
