package model;

import java.util.ArrayList;

public class StaffBag implements Bag{
	//Bag featuring 'User' classes, but only holds members of faculty and administrators.
	
	
	private ArrayList<User> staffList = new ArrayList<User>();
	
	

	@Override
	public void add(Object obj) {
		staffList.add((User)obj);
		
	}

	@Override
	public void remove(int i) {
		staffList.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//returns an 'int' because of different values of faculty and admin. faculty = 1, admin = 2.
	public int verify(String userName, String passWord){
		int accountValue = 0;
		for(int i = 0; i < staffList.size(); i ++){
			if (staffList.get(i).getAccount().getUsername().equals(userName) &&
					staffList.get(i).getAccount().getPassword().equals(passWord))
				accountValue = staffList.get(i).getAccount().getStaffLevel();
		}
		//if return 0, then go to student bag to search for account
		return accountValue;
	}

}
