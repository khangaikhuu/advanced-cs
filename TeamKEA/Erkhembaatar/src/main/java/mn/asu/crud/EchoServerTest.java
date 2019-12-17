package mn.asu.crud;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class EchoServerTest {
    EchoClient client;
    @Before

    public void setup() throws IOException {
        client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
    }
    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");
        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
        }

        @After
        public void tearDown() throws IOException {
            client.stopConnection();
        }


    @Test
    public void givenClient1_whenServerResponds_thenCorrect() throws IOException {
        EchoClient client1 = new EchoClient();
        client1.startConnection("127.0.0.1", 5555);
        String msg1 = client1.sendMessage("hello");
        String msg2 = client1.sendMessage("world");
        String terminate = client1.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() throws IOException {
        EchoClient client2 = new EchoClient();
        client2.startConnection("127.0.0.1", 5555);
        String msg1 = client2.sendMessage("hello");
        String msg2 = client2.sendMessage("world");
        String terminate = client2.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }
    }

