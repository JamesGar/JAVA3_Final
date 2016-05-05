package model;

import java.util.ArrayList;

public class CoursesNeededBag implements Bag{
	
	ArrayList<Course> neededBag;
	
	public CoursesNeededBag(){
		neededBag = new ArrayList<Course>();
	}

	@Override
	public void add(Object obj) {
		neededBag.add((Course)obj);
	}

	@Override
	public void remove(int i) {
		neededBag.remove(i);
	}
	public void removeAll(){
		for(int i = 0; i < neededBag.size();i++)
			neededBag.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Course getCourse(int i){
		return neededBag.get(i);
	}
	public int getSize(){
		return neededBag.size();
	}

}
