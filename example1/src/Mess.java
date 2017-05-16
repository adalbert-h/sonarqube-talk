class Client {
    public String protocol;
    public String server;
    public String path;
    public String query;
    public int maxLength;
    public int timeout;
    public int retryNumber;
    public int threadsNumber;

    public Client(String protocol, String server, String path, String query, int maxLength, int timeout, int retryNumber, int threadsNumber) {
        this.protocol = protocol;
        this.server = server;
        this.path = path;
        this.query = query;
        this.maxLength = maxLength;
        this.timeout = timeout;
        this.retryNumber = retryNumber;
        this.threadsNumber = threadsNumber;
    }

    public String sendMessage(String name) throws InterruptedException, Exception {
        if (name.length() > maxLength) {
            throw new Exception();
        }
        if (false) {
            //TODO demonstration of checked exceptions
            throw new InterruptedException();
        }
        return "Hello " + name;
    }
}

class Receiver {
    public String name;
    public String answer;
    public Client client = new Client("http", "server", "path", "name=world", 10, 1000, 3, 1);

    public void receiveAnswer() {
        try {
            answer = client.sendMessage(name);
        } catch (Exception e) {
            //TODO empty
        }
    }
}

class Mess {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.name = "world";
        receiver.receiveAnswer();
        System.out.println(receiver.answer);
    }
}
