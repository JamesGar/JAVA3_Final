package model;

import java.util.ArrayList;

public class StudentBag implements Bag{
	
	ArrayList<Student> studentList;
	public StudentBag(){
		
		studentList = new ArrayList<Student>();
	}
	

	@Override
	public void add(Object obj) {
		studentList.add((Student) obj);
		
	}

	@Override
	public void remove(int i) {
		studentList.remove(i);
	}
	public Student getStudent(int i){
		return studentList.get(i);
	}

	@Override
	//search for student by last name
	public Object search(int i) {
		
		for(int j = 0; j< studentList.size(); j++){
			if(studentList.get(j).getId() == i){
				System.out.println("Student Found");
				return studentList.get(j);
			}
		}
		
			return null;

	}

	public Student verify(String userName, String passWord){
		for(int i = 0; i < studentList.size(); i ++){
			if (studentList.get(i).getAccount().getUsername().equals(userName) &&
					studentList.get(i).getAccount().getPassword().equals(passWord))
				return studentList.get(i);
		}
		return null;
	}
	//needed for when press 'add student' and check for new id given
	public int getSize(){
		return studentList.size();
	}

}
