package mn.asu.crud.ExtraCredit;

import java.io.IOException;

public class TestEchoServer {
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

    private void assertEquals(String hello, String resp1) {
    }
}
