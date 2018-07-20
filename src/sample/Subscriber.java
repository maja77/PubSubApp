package sample;

import java.util.*;

public class Subscriber {

    public Subscriber() {

    }

    public String[] topics = new String [2];

    public Queue<Message> messages = new ArrayDeque<Message>();

    public void listen(String newTopic, int index) {
        topics[index] = newTopic;
    }

    public void print() {
        for (String topic : topics) {
            while (messages.size() != 0) {
                Message newMessage = messages.poll();
                System.out.println("Topics: " + newMessage.msgTopic + "\n" + newMessage.msgText);
            }
        }
    }
}
