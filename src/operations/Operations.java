package operations;

import java.util.Scanner;

import model.Person;

public class Operations {
	Scanner sc = new Scanner(System.in);
	Person person = new Person();
	Person details[] = new Person[100];
	int count;

	// To add a person's details
	public void addPerson() {
		System.out.println("*****ADD RECORDS*****");
		System.out.println("How many records you want to add?");
		int numOfRecods = sc.nextInt();
		count = 0;
		for (int i = 1; i <= numOfRecods; i++) {
			System.out.println("Enter the First name");
			String firstName = sc.next();
			person.setFirstName(firstName);

			System.out.println("Enter the Last name");
			String lastName = sc.next();
			person.setLastName(lastName);

			System.out.println("Enter your Address");
			String address = sc.next();
			person.setAddress(address);

			System.out.println("Enter your City");
			String city = sc.next();
			person.setCity(city);

			System.out.println("Enter your State");
			String state = sc.next();
			person.setState(state);

			System.out.println("Enter your Zip Code");
			int zipcode = sc.nextInt();
			person.setZip(zipcode);

			System.out.println("Enter your Phone Number");
			long phone = sc.nextLong();
			person.setPhoneNo(phone);

			details[count++] = new Person(firstName, lastName, address, city, state, zipcode, phone);
			System.out.println(i + " records added successfully");
		}
		System.out.println("All records are added successfully\n");
	}

	// To update a person's details
	public void updatePerson() {
		System.out.println("****Update Record****");
		System.out.println("Enter contact no.");
		long contactSearch = sc.nextLong();
		for (int i = 0; i < details.length; i++) {
			if (details[i] != null && details[i].getPhoneNo() == contactSearch) {
				System.out.println(details[i].getFirstName());
				System.out.println("Please select field you need to edit");
				System.out.println("1. Address");
				System.out.println("2. City");
				System.out.println("3. State");
				System.out.println("4. Zipcode");
				System.out.println("5. Phone Number");
				int choiceUpdate = sc.nextInt();
				switch (choiceUpdate) {
				case 1:
					System.out.println("Enter your Address");
					String addressUpdate = sc.next();
					details[i].setAddress(addressUpdate);
					System.out.println("Address Updated");
					break;
				case 2:
					System.out.println("Enter your City ");
					String cityUpdate = sc.next();
					details[i].setCity(cityUpdate);
					System.out.println("City Updated");
					break;
				case 3:
					System.out.println("Enter your State");
					String stateUpdate = sc.next();
					details[i].setState(stateUpdate);
					System.out.println("State Updated");
					break;
				case 4:
					System.out.println("Enter Your Zipcode");
					int zipcodeUpdate = sc.nextInt();
					details[i].setZip(zipcodeUpdate);
					System.out.println("Zipcode Updated");
					break;
				case 5:
					System.out.println("Enter Phone Number");
					long phoneUpdate = sc.nextLong();
					details[i].setPhoneNo(phoneUpdate);
					System.out.println("Phone Number Updated");
					break;
				default:
					System.out.println("Update Invalid choive! Enter again..\n");
					break;
				}
			}
		}
	}

	// To delete a person's details
	public void deletePerson() {
		System.out.println("*****Delete the record*****");
		System.out.println(" ");
		System.out.println("Enter phone number for deletion : ");
		long PhoneDelete = sc.nextLong();
		for (int i = 0; i < details.length; i++) {
			if (details[i] != null && details[i].getPhoneNo() == PhoneDelete) {
				details[i] = null;
				System.out.println("Record deleted successfully");
				break;
			}
		}
	}

	// To search a person's details
	public void searchPerson() {
		System.out.println("*****Search a person*****");
		System.out.println("Enter Phone Number to search: ");
		long PhoneSearch = sc.nextLong();
		for (int i = 0; i < details.length; i++) {
			if (details[i] != null && details[i].getPhoneNo() == PhoneSearch) {
				System.out.print("Firstname \tLastname \tAddress \t\tCity \t\tState \t\t\tZIP \t\tPhone \n");
				System.out.println(details[i]);
			}
		}
	}

	// To display all the records
	public void displayRecords() {
		System.out.println("****Display Records****");
		System.out.print("Firstname \tLastname \tAddress \t\tCity \t\tState \t\t\tZIP \t\tPhone \n");
		for (int i = 0; i < count; i++) {
			if (details[i] == null) {
				continue;
			}
			System.out.println(details[i]);
		}
		System.out.println();
	}

	// To exit from an address book
	public void exitAddressBook() {
		System.out.println("Exited from the Address book.");
		System.exit(0);

	}
}
