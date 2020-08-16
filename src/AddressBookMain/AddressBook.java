package AddressBookMain;

import java.util.Scanner;

import operations.Operations;

public class AddressBook {

	public static void main(String[] args) {
		Operations operations = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Address Book Management System");
		while (true) {
			System.out.println("1. Add");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Search");
			System.out.println("5. Display");
			System.out.println("6. Exit");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				operations.addPerson();
				break;
			case 2:
				operations.updatePerson();
				break;
			case 3:
				operations.deletePerson();
				break;
			case 4:
				operations.searchPerson();
				break;
			case 5:
				operations.displayRecords();
				break;
			case 6:
				operations.exitAddressBook();
			default:
				System.out.println("Invalid choive! Enter again..\n");
				break;
			}
		}
	}
}
