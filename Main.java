import company.beans.Person;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("Carla", 30);
            people[1] = new Person("Alice", 25);
            people[2] = new Person("Bob", 35);
            people[3] = new Person("Carol", 40);
            people[4] = new Person("David", 45);

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                person.sendMessage("Wynik dodawania wieku i stałej b dla osoby " + person.getName() + ": " + result);
            }
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}