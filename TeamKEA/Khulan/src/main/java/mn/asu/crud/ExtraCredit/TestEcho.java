package mn.asu.crud.ExtraCredit;

import org.junit.Test;

public class TestEcho<EchoClient> {
    @Test
    public void givenClient1_whenServerResponds_thenCorrect() {
        var client1 = new EchoClient();
        client1.startconnection("127.0.0.1", 5555);
        String msg1 = client1.sendMessage("hello");
        String msg2 = client1.sendMessage("world");
        String terminate = client1.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }
    private void assertEquals(String msg2, String world) {
    }
}
