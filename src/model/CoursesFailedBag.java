package model;

import java.util.ArrayList;

public class CoursesFailedBag implements Bag {
	
	ArrayList<Course> failedBag;
	
	public CoursesFailedBag(){
		
		failedBag = new ArrayList<Course>();
	}

	@Override
	public void add(Object obj) {
		failedBag.add((Course) obj);
		
	}

	@Override
	public void remove(int i) {
		failedBag.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public Course getCourse(int i){
		return failedBag.get(i);
	}
	public int getSize(){
		return failedBag.size();
	}

}
