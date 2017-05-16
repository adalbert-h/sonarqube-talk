package example.receiver;

import example.client.Client;

public class Receiver {
    private Client client;

    public Receiver(Client client) {
        this.client = client;
    }

    public String receiveGreeting(String name) {
        return client.sendMessage(name);
    }
}
