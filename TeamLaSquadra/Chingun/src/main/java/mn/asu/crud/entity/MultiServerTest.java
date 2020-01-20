package mn.asu.crud.entity;

import org.junit.Test;

import java.io.IOException;

public class MultiServerTest {
    @Test
public void givenClient1_whenServerResponds_thenCorrect() throws IOException {
    mn.asu.crud.websocket.EchoClient client1 = new mn.asu.crud.websocket.EchoClient();
    ((mn.asu.crud.websocket.EchoClient) client1).startConnection("127.0.0.1", 5555);
    String msg1 = client1.sendMessage("hello");
    String msg2 = client1.sendMessage("world");
    String terminate = client1.sendMessage(".");

    assertEquals(msg1, "hello");
    assertEquals(msg2, "world");
    assertEquals(terminate, "bye");
}

    private void assertEquals(String msg1, String hello) {
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() throws IOException {
        mn.asu.crud.websocket.EchoClient client2 = new mn.asu.crud.websocket.EchoClient();
        client2.startConnection("127.0.0.1", 5555);
        String msg1 = client2.sendMessage("hello");
        String msg2 = client2.sendMessage("world");
        String terminate = client2.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }
}
