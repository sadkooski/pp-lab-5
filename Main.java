public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 30);
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
    }
}