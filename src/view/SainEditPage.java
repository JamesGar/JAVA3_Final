package view;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import model.Course;
import model.Student;

public class SainEditPage {
	

	ComboBox<Course> currentCourses = new ComboBox<Course>();
	GridPane grid = new GridPane();
	
	
	public GridPane getMyGrid(Student thisStudent){
		ArrayList<Course> currentCoursesList = new ArrayList<Course>();
		for(int i = 0;i< thisStudent.getEnrollmentInfo().getCurrentBag().getSize();i++){
			currentCoursesList.add(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(i));
			}
		currentCourses.setItems((ObservableList<Course>) currentCoursesList);
		grid.add(currentCourses, 5, 5);
		return grid;
		
	}
	
	public void addView(Student thisStudent){
//		currentCourses.setItems(value);
		for(int i = 0;i< thisStudent.getEnrollmentInfo().getCurrentBag().getSize();i++){
		currentCourses.setValue(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(i));
		}
	}

}
