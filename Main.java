import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Hello, this is a test message.");
    }
}