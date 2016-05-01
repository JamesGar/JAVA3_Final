package model;

public class User {
	
	String firstName;
	String lastName;
	Address address;
	String email;
	int id;
	Account account;
	
	public User(String firstName, String lastName, Address address,
			String email, int id, Account account) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.id = id;
		this.account = account;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	

}
