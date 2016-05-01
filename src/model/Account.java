package model;

public class Account {
	
	private String username;
	private String password;
	
	//staffLevel is used to determine, when logging in, if the staff is Faculty or Admin
	private int staffLevel;
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	//constructor of staff account
	public Account(String username, String password, int level){
		this.username = username;
		this.password = password;
		staffLevel = level;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLevel(int i){
		staffLevel = i;
	}
	public int getStaffLevel(){
		return staffLevel;
	}
	
	

}
