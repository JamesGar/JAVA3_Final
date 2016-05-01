package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SearchStudentScreen {
	GridPane grid = new GridPane();
	Button b1 = new Button("Search");
	Button viewSain = new Button("View Sain For This Student");
	TextField search = new TextField();
	Label title = new Label("Search Database for Student:");
	TextArea results = new TextArea();
	Button addStudent = new Button("Add New Student");
	//Button addStudent = new Button("Add Student");
	//Button veiwSain = new Button("View student's SAIN report.");
	
	//add student visibility has be set here, and not under getMyGrid, because otherwise view doesnt have enough time to determine
	//whether or not admin is logged on before it switched to student search screen from login
	public SearchStudentScreen(){
		addStudent.setVisible(false);
	}
	
	public GridPane getMyGrid(){
		
		viewSain.setVisible(false);
		
		results.setEditable(false);
		grid.add(title, 3, 0);
		grid.add(search,1,2);
		grid.add(results, 4, 2);
		grid.add(b1, 2, 2);
		grid.add(viewSain, 2, 4);
		grid.add(addStudent,2,6);
		return grid;
	}
	
	public void showViewSain(){
		viewSain.setVisible(true);
	}
	public void hideViewSain(){
		
		results.clear();
		viewSain.setVisible(false);
	}
	public void hide(){
		title.setVisible(false);
		search.setVisible(false);
		results.setVisible(false);
		b1.setVisible(false);
		addStudent.setVisible(false);
	}
	public void show(){
		title.setVisible(true);
		search.setVisible(true);
		results.setVisible(true);
		b1.setVisible(true);
		addStudent.setVisible(true);
	}


}
