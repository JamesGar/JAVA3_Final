package view;

import javafx.beans.property.BooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import model.CourseBag;
import model.Student;

public class SainEditPage {
	

	
	GridPane grid = new GridPane();
	ObservableList<String> courseOptions = FXCollections.observableArrayList();
	ComboBox<String> currentCourseOptions;
	Label addTitle = new Label("Add new course");
	Button addCourseButton = new Button("Add Course");
	TextField startingGrade = new TextField();
	Label startingGradeLB = new Label("Starting grade in this course:");
	RadioButton currentlyTaking = new RadioButton("Yes");
	RadioButton notCurrentlyTaking = new RadioButton("No");
	Label currentlyTakingLB = new Label("Currently Taking This Course?");
	ToggleGroup group = new ToggleGroup();
	
	
	public GridPane getMyGrid(Student thisStudent){
		currentlyTaking.setToggleGroup(group);
		grid.setVgap(10);
		grid.add(addTitle, 2, 2);
		
		return grid;
		
	}
	
	public void addView(Student thisStudent,CourseBag courseBag){
		
		for(int i = 0; i< courseBag.getSize(); i ++){
			courseOptions.add(courseBag.getCourse(i).getTitle() + " " +courseBag.getCourse(i).getCourseNum());
		}
		currentCourseOptions = new ComboBox<String>(courseOptions);
	}
	public void show(){
		grid.add(addTitle, 2, 2);
		grid.add(currentCourseOptions, 2, 4);
		grid.add(addCourseButton, 3, 6);
		grid.add(startingGrade, 5, 3);
		grid.add(startingGradeLB, 4, 3);
		grid.add(currentlyTaking, 5, 5);
		grid.add(notCurrentlyTaking, 6, 5);
		currentlyTaking.setToggleGroup(group);
		notCurrentlyTaking.setToggleGroup(group);
		grid.add(currentlyTakingLB,4, 5);
	}
	public void hide(){
		
		grid.getChildren().remove(addTitle);
		grid.getChildren().remove(currentCourseOptions);
		grid.getChildren().remove(addCourseButton);
		grid.getChildren().remove(startingGrade);
		grid.getChildren().remove(startingGradeLB);
		grid.getChildren().remove(currentlyTaking);
		grid.getChildren().remove(currentlyTakingLB);
		grid.getChildren().remove(notCurrentlyTaking);
	}
	public String getSelectedCourse(){
		return currentCourseOptions.getValue();
	}
	public boolean isCurrentCourseSelected(){
	
		return currentlyTaking.isSelected();
	}
	public String getGrade(){
		return startingGrade.getText();
	}

}
