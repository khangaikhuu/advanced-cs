package mn.asu.crud.entity;
import org.testng.annotations.Test;

import java.net.*;
import java.io.*;

import static org.testng.Assert.assertEquals;

public class TestClass
{ @Test
public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
    GreetClient client = new GreetClient();
    client.startConnection("127.0.0.1", 6666);
    String response = client.sendMessage("hello server");
    assertEquals("hello client", response);
}
}
