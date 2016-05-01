package model;

public class Faculty extends User {
	
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
	
	

}
