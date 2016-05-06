package model;

import java.io.Serializable;

public class Admin extends User implements Serializable{

	public Admin(String firstName, String lastName, Address address,
			String email, int id, Account account) {
		super(firstName, lastName, address, email, id, account);
		// TODO Auto-generated constructor stub
	}
	
	public void changeUserName(String s){
		getAccount().setUsername(s);;
	}
	
	public void changePassword(String s){
		getAccount().setPassword(s);;
	}

	@Override
	public String toString() {
		return "Admin [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", email=" + email + ", id=" + id
				+ ", account=" + account + "]"+ "Username:" + account.getUsername() +
				"password: " + account.getPassword();
	}
	

}
