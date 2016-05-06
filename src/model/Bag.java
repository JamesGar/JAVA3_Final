package model;

import java.io.Serializable;

public interface Bag extends Serializable{
	
	public void add(Object obj);
	
	public void remove(int i);
	
	
	// 
	public Object search(int i);
	
	

}
