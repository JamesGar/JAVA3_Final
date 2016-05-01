package model;

public class Admin extends User{

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
	

}
