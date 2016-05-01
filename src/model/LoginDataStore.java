package model;

import java.util.ArrayList;

// Login store for STUDENTS ONLY.

public class LoginDataStore implements Bag{


	
	ArrayList<Account> accountList;
	
	public LoginDataStore(){
		accountList = new ArrayList<Account>();
	}
	
	@Override
	public void add(Object obj) {
		accountList.add((Account)obj);
		
	}

	@Override
	public void remove(int i) {
		accountList.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean verify(Account account){
		Boolean doesExist = false;
		for(int i = 0; i < accountList.size(); i ++){
			if (accountList.get(i) == account)
				doesExist = true;
		}
		return doesExist;
	}

}
