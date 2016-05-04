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
	
	Button addDisplayButton = new Button("Add Course page");
	Button removeDisplayButton = new Button("Remove Course Page");
	
	//add courses page
	ObservableList<String> courseOptions = FXCollections.observableArrayList();
	ComboBox<String> allCourseOptions;
	Label addTitle = new Label("Add new course");
	Button addCourseButton = new Button("Add Course");
	Button backToSain = new Button("Return to SAIN");
	TextField startingGrade = new TextField();
	Label startingGradeLB = new Label("Starting grade in this course:");
	RadioButton currentlyTaking = new RadioButton("Yes");
	RadioButton notCurrentlyTaking = new RadioButton("No");
	Label currentlyTakingLB = new Label("Currently Taking This Course?");
	ToggleGroup group = new ToggleGroup();
	
	//remove courses page
	ObservableList<String> currentSainCourses = FXCollections.observableArrayList();
	ComboBox<String> removeCourseOptions;
	Label removeTitle = new Label("Remove Current Course");
	Button removeButton = new Button("Remove this course");
	
	
	public GridPane getMyGrid(Student thisStudent){
		currentlyTaking.setToggleGroup(group);
		grid.setVgap(10);
		grid.setConstraints(addDisplayButton, 0, 0, 500, 5);
		addDisplayButton.setPrefSize(500, 5);
		
		grid.add(addDisplayButton, 0, 0);
		//grid.add(removeDisplayButton, 1, 1);
		grid.add(addTitle, 2, 2);
		
		return grid;
		
	}
	
	public void addView(Student thisStudent,CourseBag courseBag){
		
		for(int i = 0; i< courseBag.getSize(); i ++){
			courseOptions.add(courseBag.getCourse(i).getTitle() + " " +courseBag.getCourse(i).getCourseNum());
		}
		allCourseOptions = new ComboBox<String>(courseOptions);
	}
	public void hideGradeOption(){
		startingGrade.setVisible(false);
		startingGradeLB.setVisible(false);
	}
	public void showGradeOption(){
		startingGrade.setVisible(true);
		startingGradeLB.setVisible(true);
	}
	
	public void show(){
		grid.add(addTitle, 2, 2);
		grid.add(allCourseOptions, 2, 4);
		grid.add(addCourseButton, 3, 6);
		grid.add(startingGrade, 5, 3);
		grid.add(startingGradeLB, 4, 3);
		grid.add(currentlyTaking, 5, 5);
		grid.add(notCurrentlyTaking, 6, 5);
		grid.add(backToSain, 3, 8);
		currentlyTaking.setToggleGroup(group);
		notCurrentlyTaking.setToggleGroup(group);
		grid.add(currentlyTakingLB,4, 5);
	}
	public void hide(){
		
		grid.getChildren().remove(addTitle);
		grid.getChildren().remove(allCourseOptions);
		grid.getChildren().remove(addCourseButton);
		grid.getChildren().remove(startingGrade);
		grid.getChildren().remove(startingGradeLB);
		grid.getChildren().remove(currentlyTaking);
		grid.getChildren().remove(currentlyTakingLB);
		grid.getChildren().remove(notCurrentlyTaking);
		grid.getChildren().remove(backToSain);
	}
	
	public void showRemovePage(){
		
	}
	public void hideRemovePage(){
		
	}
	
	public String getSelectedCourse(){
		return allCourseOptions.getValue();
	}
	public boolean isCurrentCourseSelected(){
	
		return currentlyTaking.isSelected();
	}
	public String getGrade(){
		return startingGrade.getText();
	}

}
