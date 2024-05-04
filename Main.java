import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(10, 20);
        System.out.println("Sum of numbers: " + result);
        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("The sum of 10 and 20 is: " + result);
    }
}