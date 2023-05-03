import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookRepository {
    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {

        personList.add(person);
    }

    public void updatePerson(Person person) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new First name: ");
        String firstName = sc.next();
        System.out.println("Enter new Last name: ");
        String lastName = sc.next();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        System.out.println("Person Updated");
    }

    public void deletePerson(Person person) {
        personList.remove(person);
        System.out.println("Person Removed");
    }

    public void displayPersonList() {
        for (Person person : personList) {
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Last Name: " + person.getLastName());

        }
    }
}
