package model;

import java.util.ArrayList;

public class CoursesTakenBag implements Bag {
	
	
	ArrayList<Course> takenBag;
	
	
	public CoursesTakenBag(){
		
		takenBag = new ArrayList<Course>();
		
	}

	@Override
	public void add(Object obj) {
		takenBag.add((Course)obj);
	}

	@Override
	public void remove(int i) {
		takenBag.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public Course getCourse(int i){
		return takenBag.get(i);
	}
	public int getSize(){
		return takenBag.size();
	}

}
