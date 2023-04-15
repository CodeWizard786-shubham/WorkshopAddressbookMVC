
public class AddressBookService {
    AddressBookRepository repository = new AddressBookRepository();

    public void addPerson(Person person) {
        repository.addPerson(person);

    }

    public void updatePerson(String firstNameForUpdate) {
        boolean personFound = false;
        for (Person person : repository.personList) {
            if (firstNameForUpdate.equals(person.getFirstName())) {
                repository.updatePerson(person);
                personFound = true;
            }
        }
        if (!personFound) {
            System.out.println("Person not found");
        }
    }

    public void deletePerson(String firstNameForDelete) {
        boolean personFound = false;
        for (int i = 0; i < repository.personList.size(); i++) {
            if (firstNameForDelete.equals(repository.personList.get(i).getFirstName())) {
                repository.deletePerson(repository.personList.get(i));
                personFound = true;
                break;
            }
        }
        if (!personFound) {
            System.out.println("Person not found");
        }
    }

    public void display() {
        if (!repository.personList.isEmpty()) {
            repository.displayPersonList();
        }else{
                System.out.println("Empty Address Book");
            }
        }

    }