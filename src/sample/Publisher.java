package sample;

import java.util.ArrayDeque;
import java.util.Queue;

public class Publisher {

    public Publisher () {

    }

    public void sendMessage (Message newMessage, Server server) {
        server.buffer.add(newMessage);
    }
}
