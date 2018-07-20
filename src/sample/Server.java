package sample;

import java.util.ArrayDeque;
import java.util.Queue;

public class Server {
    public Server() {

    }

    public Queue<Message> buffer = new ArrayDeque<>();

    public Subscriber[] subscribers = new Subscriber[2];

    public void forward() {
        while (buffer.size() != 0) {
            Message tempMsg = buffer.poll();
            for (int i=0; i < subscribers.length; i++) {
                for (int j=0; j < subscribers[i].topics.length; j++) {
                    if (tempMsg.msgTopic == subscribers[i].topics[j]) {
                        subscribers[i].messages.add(tempMsg);
                    }
                }
            }
        }
    }
}
