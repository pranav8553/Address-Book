import java.util.Scanner;

class Details {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNo;

	public Details() {
	}

	public Details(String firstName, String lastName, String address,
			String city, String state, int zip, long phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String toString() {
		return firstName + "\t\t" + lastName + "\t\t" + address + "\t\t" + city
				+ "\t\t" + state + "\t\t" + zip + "\t\t" + phoneNo;
	}
}

public class AddressBook {

	public static void main(String[] args) {
		Details person = new Details();
		Details details[] = new Details[100];

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Welcome to the Address Book Management System");
		while (true) {
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Update");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("*****ADD RECORDS*****");
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
				details[count++] = new Details(firstName, lastName, address,
						city, state, zipcode, phone);
				System.out.println("Your records are successfully added\n");
				break;
				
			case 2:
				System.out.println("****Display Records****");
				System.out.print("Firstname \tLastname \tAddress \t\tCity \t\tState \t\t\tZIP \t\tPhone \n");
				for (int i = 0; i < count; i++) {
					System.out.println(details[i]);
				}
				System.out.println();
				break;
			case 3: 
				System.out.println("****Update Record****");
				System.out.println("Enter contact no.");
				long contactSearch = sc.nextLong();
				for (int i=0; i<details.length; i++){
					if (details[i] != null && details[i].getPhoneNo()==contactSearch){
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
				break;
			default:
				System.out.println("Invalid choive! Enter again..\n");
				break;
			}
		}
	}
}
