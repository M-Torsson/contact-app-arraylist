package Lexcon;
import java.util.ArrayList;

public class ContactDAO {
    ArrayList<String> contacts = new ArrayList<>();
    public void addContact(String name, String mobile) {
        String contact = name + "|" + mobile;
        contacts.add(contact);
        System.out.println("Contact added.");
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts yet.");
            return;
        }
        for (String c : contacts) {
            String[] parts = c.split("\\|");
            System.out.println(parts[0] + " - " + parts[1]);
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (String c : contacts) {
            String[] parts = c.split("\\|");
            if (parts[0].equalsIgnoreCase(name)) {
                System.out.println("Found: " + parts[0] + " - " + parts[1]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}
