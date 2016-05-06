package model;

import java.io.Serializable;

public class Faculty extends User implements Serializable {
	
	private double salary;
	

	public Faculty(String firstName, String lastName, Address address,
			String email, int id, Account account) {
		super(firstName, lastName, address, email, id, account);
		// TODO Auto-generated constructor stub
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Faculty [salary=" + salary + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", id=" + id + ", account=" + account
				+ "]" + "Username:" + account.getUsername() + "password: " + account.getPassword();
	}


	
	
	

}
