package view;

import model.Student;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import controller.MainController;

public class FacadeGUI {
	
	private LoginScreen loginScreen = new LoginScreen();
	private SelectTermScreen selectScreen = new SelectTermScreen();
	private SearchStudentScreen searchScreen = new SearchStudentScreen();
	private SainDisplayScreen sainScreen = new SainDisplayScreen();
	private SideOptions sideOptions = new SideOptions();
	private SainEditPage sainEditScreen = new SainEditPage();
	private AddStudentPage addStudentScreen = new AddStudentPage();
	private WhatIfScreen whatIfScreen = new WhatIfScreen();
	private Label popUpLabel = new Label();
	Pane pane = new Pane();
	Button continueButton;
	MainView view;
	MainController controller;
	Student myStudent;
	Scene popUp1 = new Scene(popUpLabel,250,200);
	
	public FacadeGUI(MainView view, MainController controller){
		this.view = view;
		this.controller = controller;
	}

	public void setLoginView(){
		//loginScreen.getMyGrid().add(sideOptions.getSidePane(), 11, 0);
		pane.getChildren().add(loginScreen.getMyGrid());
		//pane.getChildren().add(sideOptions.getSidePane());
		continueButton = loginScreen.getContinueButton();
		
		loginScreen.b1.setOnAction(e ->{
			controller.loginClicked(loginScreen.getUserName(), loginScreen.getPassword());
		});
		
		view.setNewView(pane);
	}
	
	public void setSelectView(){
		pane.getChildren().clear();
		pane.getChildren().add(selectScreen.getMyGrid());
	
	}
	public void setSearchView(){
		pane.getChildren().clear();
		
		pane.getChildren().add(searchScreen.getMyGrid());
		pane.getChildren().add(addStudentScreen.getMyGrid());
		
		// the search and add student screens are on the same pane, their visibilities are just swapped
		addStudentScreen.hide();
			
		
		searchScreen.viewSain.setOnAction(e->{
			
			controller.viewSearchedSain();
		});
		
		searchScreen.b1.setOnAction(e ->{
			searchScreen.hideViewSain();
			
		try{
			controller.searchClicked(Integer.parseInt((searchScreen.search.getText())));
		}catch(NumberFormatException e1){
			makeDoesNotExistWindow();
		}
		
		
		});
		searchScreen.addStudent.setOnAction(e2 ->{
			controller.addStudentViewClicked();
		});
	
		
		
		view.setNewView(pane);
		//if account value == 2
		//show extra buttons
	}
	public void setEditSainView(Student thisStudent){
		sainScreen.hide();
		sainEditScreen.show();
		
		sainEditScreen.addCourseButton.setOnAction(e->{
			controller.addCourseClicked(thisStudent);
		});
	}
	public void setSearchResults(String s){
		searchScreen.results.setText(s);
		searchScreen.showViewSain();
	}
	public void setSainView(Student forThisStudent){
		
		sainScreen.setInfo(forThisStudent);
		pane.getChildren().clear();
		pane.getChildren().add(sainScreen.getMyGrid());
		pane.getChildren().add(whatIfScreen.getMyGrid());
		pane.getChildren().add(sainEditScreen.getMyGrid(forThisStudent));
		
		sainEditScreen.hide();
		whatIfScreen.hide();

			
		//"Update" button visible if user is admin:
		if(view.getStaffValue() == 2)
			sainScreen.update.setVisible(true);
		
		sainScreen.update.setOnAction(e ->{
			controller.updateSainClicked();
		});
		
		sainScreen.b1.setOnAction(e ->{
			controller.whatIfClicked();
		});
		view.setNewView(pane);
	}
	public void setWhatIfView(){
		//pane.getChildren().clear();
		sainScreen.hide();
		whatIfScreen.show();
		
		whatIfScreen.newSainButton.setOnAction(e ->{
			controller.newSainButtonClicked();
		});
	}
	public void setAddStudentView(){
		searchScreen.hide();
		addStudentScreen.show();
		addStudentScreen.add.setOnAction(e ->{
		Boolean canContinue = true;
			try{
				Double.parseDouble(addStudentScreen.gpa.getText().trim());
			}catch(NumberFormatException e1){
				System.out.println(addStudentScreen.gpa.getText().trim() + "issue");
				makeWrongGpaInputWindow();
				canContinue = false;
			}
			if(canContinue){
				if(Double.parseDouble(addStudentScreen.gpa.getText()) <= 4 && Double.parseDouble(addStudentScreen.gpa.getText()) > 0) {
					controller.addStudentClicked();
				}
				else
					makeWrongGpaInputWindow();
			}
				
			
		});
		
	}
	public AddStudentPage getAddStudentPage(){
		return addStudentScreen;
	}
	public SearchStudentScreen getSearchScreen(){
		return searchScreen;
	}
	public WhatIfScreen getWhatIfScreen(){
		return whatIfScreen;
	}
	public SainDisplayScreen getSainScreen(){
		return sainScreen;
	}
	public SainEditPage getEditSainScreen(){
		return sainEditScreen;
	}
	
	public Pane getPane(){
		return pane;
	}
	
	public Button getContinueButton(){
		return continueButton;
	}

	public void makeDoesNotExistWindow(){
		if(popUp1.getRoot().equals("Could not find account") == false){
			popUpLabel.setText("Could not find account");
			popUp1.setRoot(popUpLabel);
		}
		Stage popUpStage = new Stage();
		view.makeDoesNotExistWindow(popUpStage,popUp1);
	}
	public void makeWrongMajorInputWindow(){
		if(popUp1.getRoot().equals("Not a valid input for Major ID") == false){
			popUpLabel.setText("Not a valid input for Major ID");
			popUp1.setRoot(popUpLabel);
		}
		System.out.println("For maj: " + popUp1.getRoot().equals("Please enter a number between \n 0.0 and 4.0 for GPA"));
		//popUpLabel.setText("Not a valid input for Major ID");
		//Scene popUp = new Scene(popUpLabel,200,200);
		Stage popUpStage = new Stage();
		view.makeDoesNotExistWindow(popUpStage,popUp1);
	}
	public void makeWrongGpaInputWindow(){
		if(popUp1.getRoot().equals("Please enter a number between \n 0.0 and 4.0 for GPA") == false){
			popUpLabel.setText("Please enter a number between \n 0.0 and 4.0 for GPA");
			popUp1.setRoot(popUpLabel);
		}
		System.out.println(popUp1.getRoot().equals("Please enter a number between \n 0.0 and 4.0 for GPA"));
		//Scene popUp = new Scene(popUpLabel,200,200);
		Stage popUpStage = new Stage();
		view.makeDoesNotExistWindow(popUpStage,popUp1);
	}
	public void createdNewStudentWindow(int studentId){
		if(popUpLabel.getText().equals("Student has been created with an id number of: " + studentId) == false){
			popUpLabel.setText("Student has been created with an id number of: " + studentId);
			popUp1.setRoot(popUpLabel);
		}
		

		Stage popUpStage = new Stage();
		view.makeDoesNotExistWindow(popUpStage,popUp1);
	}
	
	// MainController sets student once SAIN report is clicked.
	public void setStudent(Student s){
		myStudent = s;
	}

	public void setStaffValue(int i){
		view.setStaffValue(i);
		//add button only appears if admin...
		if(i == 2)
			searchScreen.addStudent.setVisible(true);
		
	}
	
	

}
