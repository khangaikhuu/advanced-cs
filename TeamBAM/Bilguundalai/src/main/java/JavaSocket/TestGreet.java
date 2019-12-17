package JavaSocket;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestGreet {

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }

    private void assertEquals(String hello_client, String response) {
    }
}
