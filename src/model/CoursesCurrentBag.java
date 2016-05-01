package model;

import java.util.ArrayList;

public class CoursesCurrentBag implements Bag {
	
	ArrayList<Course> currentCourses;
	
	public CoursesCurrentBag(){
		currentCourses = new ArrayList<Course>();
	}

	@Override
	public void add(Object obj) {
		currentCourses.add((Course)obj);
	}

	@Override
	public void remove(int i) {
		currentCourses.remove(i);
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public Course getCourse(int i){
		return currentCourses.get(i);
	}
	public int getSize(){
		return currentCourses.size();
	}

}
