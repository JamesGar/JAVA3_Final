package model;

import java.util.ArrayList;

public class MajorBag implements Bag{
	
	ArrayList<Major> majorList;
	
	public MajorBag(){
		
		majorList = new ArrayList<Major>();
	}

	@Override
	public void add(Object obj) {
		majorList.add((Major) obj);
	}

	@Override
	public void remove(int i) {
		majorList.remove(i);
		
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public int getSize(){
		return majorList.size();
	}
	
	public Major getMajor(int i){
		return majorList.get(i);
	}

}
