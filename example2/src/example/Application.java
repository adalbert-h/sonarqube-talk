package example;

import example.client.Client;
import example.client.HttpClient;
import example.receiver.Receiver;

public class Application {
    public static void main(String[] args) {
        Client client = new HttpClient("server", "path");
        Receiver receiver = new Receiver(client);
        String greeting = receiver.receiveGreeting("world");
        System.out.println(greeting);
    }
}
