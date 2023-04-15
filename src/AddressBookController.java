import java.util.Scanner;

public class AddressBookController {

    public static Person readPersonDetailFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }

    public static String updatePersonDetailFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name for update: ");
        String firstNameForUpdate = sc.next();
        return firstNameForUpdate;
    }
    public static String deletePersonDetailFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name for delete: ");
        String firstNameForDelete = sc.next();
        return firstNameForDelete;
    }
    public static void main(String[] args) {
        AddressBookService service=new AddressBookService();
        boolean b=true;
        while(b){
            Scanner sc=new Scanner(System.in);
            System.out.println("AddressBook \n 1.Add \n 2.Display \n 3.Update \n 4.Delete \n 5.Exit");
            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    service.addPerson(readPersonDetailFromConsole());
                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    service.updatePerson(updatePersonDetailFromConsole());
                    break;
                case 4:
                    service.deletePerson(deletePersonDetailFromConsole());
                    break;
                case 5:
                    b=false;
                    break;
                default:
                    System.out.println("Enter Proper Input");
            }
        }
    }
}
