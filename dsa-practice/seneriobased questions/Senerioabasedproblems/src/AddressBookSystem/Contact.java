package AddressBookSystem;

public class Contact {

	public String firstName;
	public String lastName;
	public Long phoneNumber;
	public String email;
	public String city;
	public String state;
	public int zip;
	
	
	
	Contact (String firstName, String lastName, Long phoneNumber, String email, String city, String state, int zip  ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.state = state;
		this.zip = zip;
	}
	
}
