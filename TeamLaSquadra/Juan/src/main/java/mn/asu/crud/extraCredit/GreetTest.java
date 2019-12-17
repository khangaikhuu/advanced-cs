package mn.asu.crud.extraCredit;

import org.testng.annotations.Test;

import java.net.*;
import java.io.*;

public class GreetTest {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        System.out.println(assertEquals("hello client", response));
    }

    private boolean assertEquals(String hello_client, String response) {
        if(hello_client.equals(response))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
