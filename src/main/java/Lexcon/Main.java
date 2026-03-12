package Lexcon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactDAO dao = new ContactDAO();
        int choice = -1;
        while (choice != 0) {

            System.out.println("\nContact App");
            System.out.println("1 Add Contact");
            System.out.println("2 Search Contact");
            System.out.println("3 Show All");
            System.out.println("0 Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Mobile: ");
                String mobile = sc.nextLine();
                dao.addContact(name, mobile);
            }
            else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                dao.searchByName(name);
            }
            else if (choice == 3) {
                dao.showAllContacts();
            }
            else if (choice == 0) {
                System.out.println("Bye");
            }
            else {
                System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}
