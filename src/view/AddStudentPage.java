package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AddStudentPage {
	Label title = new Label("Add a New Student:");
	GridPane grid = new GridPane();
	Button add = new Button("Add This Student");
	TextField firstName = new TextField("FirstName");
	TextField lastName = new TextField("Lastname");
	TextField street = new TextField("Street");
	TextField zip = new TextField("Zip Code");
	TextField email = new TextField("Email");
	TextField id = new TextField("id");
	TextField degreeType = new TextField("Degree Type");
	TextField major = new TextField("Major ID");
	TextField campus = new TextField("Campus");
	TextField gpa = new TextField("Overall GPA");//make sure not above 4
	TextField currentTerm = new TextField("Spring 2016");
	TextField startingTerm = new TextField("Starting Term");
	TextField userName = new TextField("User Name");
	TextField passWord = new TextField("Password");
	
	
	
	public GridPane getMyGrid(){
		grid.add(title, 13, 1);
		grid.add(firstName, 3, 4);
		grid.add(lastName, 3, 7);
		grid.add(street, 3, 10);
		grid.add(zip, 3, 13);
		grid.add(email, 3, 16);
//		grid.add(id, 3, 19);
		grid.add(degreeType, 3, 22);
		grid.add(major, 23, 4);
		grid.add(campus, 23, 7);
		grid.add(gpa, 23, 10);
		grid.add(currentTerm, 23, 13);
		grid.add(startingTerm, 23, 16);
		grid.add(userName, 23, 19);
		grid.add(passWord, 23, 22);
		grid.add(add, 13, 30);
	
		return grid;
	}
	
	public String getFirstName() {
		return firstName.getText();
	}
	public void setFirstName(TextField firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName.getText();
	}
	public void setLastName(TextField lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street.getText();
	}
	public void setStreet(TextField street) {
		this.street = street;
	}
	public String getPassword(){
		return passWord.getText();
	}
	public String getUserName(){
		return userName.getText();
	}
	public String getZip() {
		return zip.getText();
	}
	public void setZip(TextField zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email.getText();
	}
	public void setEmail(TextField email) {
		this.email = email;
	}
	public int getId() {
		return Integer.parseInt(id.getText());
	}
	public void setId(TextField id) {
		this.id = id;
	}
	public String getDegreeType() {
		return degreeType.getText();
	}
	public void setDegreeType(TextField degreeType) {
		this.degreeType = degreeType;
	}
	public String getMajor() {
		return major.getText();
	}
	public void setMajor(TextField major) {
		this.major = major;
	}
	public String getCampus() {
		return campus.getText();
	}
	public void setCampus(TextField campus) {
		this.campus = campus;
	}
	public double getGpa() {
		return Double.parseDouble(gpa.getText());
	}
	public void setGpa(TextField gpa) {
		this.gpa = gpa;
	}
	public String getCurrentTerm() {
		return currentTerm.getText();
	}
	public void setCurrentTerm(TextField currentTerm) {
		this.currentTerm = currentTerm;
	}
	public String getStartingTerm() {
		return startingTerm.getText();
	}
	public void setStartingTerm(TextField startingTerm) {
		this.startingTerm = startingTerm;
	}
	
	public void hide(){
//		title.setVisible(false);
//		add.setVisible(false);
//		gpa.setVisible(false);
//		currentTerm.setVisible(false);
//		startingTerm.setVisible(false);
//		campus.setVisible(false);
//		major.setVisible(false);
//		degreeType.setVisible(false);
//		id.setVisible(false);
//		userName.setVisible(false);
//		passWord.setVisible(false);
//		email.setVisible(false);
//		street.setVisible(false);
//		firstName.setVisible(false);
//		lastName.setVisible(false);
//		zip.setVisible(false);
//		
//		add.setDisable(true);
//		firstName.setDisable(true);
//		lastName.setDisable(true);
//		street.setDisable(true);
//		zip.setDisable(true);
		grid.getChildren().remove(major);
		grid.getChildren().remove(add);
		grid.getChildren().remove(gpa);
		grid.getChildren().remove(currentTerm);
		grid.getChildren().remove(startingTerm);
		grid.getChildren().remove(title);
		grid.getChildren().remove(campus);
		grid.getChildren().remove(major);
	//	grid.getChildren().remove(id);
		grid.getChildren().remove(firstName);
		grid.getChildren().remove(lastName);
		grid.getChildren().remove(street);
		grid.getChildren().remove(zip);
		grid.getChildren().remove(email);
		grid.getChildren().remove(userName);
		grid.getChildren().remove(passWord);
		grid.getChildren().remove(degreeType);
		
	}
	public void show(){
		grid.add(title, 13, 1);
//		grid.add(id, 3, 19);
		grid.add(major, 23, 4);
		grid.add(campus, 23, 7);
		grid.add(gpa, 23, 10);
		grid.add(currentTerm, 23, 13);
		grid.add(startingTerm, 23, 16);
		grid.add(add, 13, 30);
		grid.add(firstName, 3, 4);
		grid.add(lastName, 3, 7);
		grid.add(street, 3, 10);
		grid.add(zip, 3, 13);
		grid.add(email, 3, 16);
		grid.add(userName, 23, 19);
		grid.add(passWord, 23, 22);
		grid.add(degreeType, 3, 22);
//		add.setDisable(false);
//		title.setVisible(true);
//		add.setVisible(true);
//		gpa.setVisible(true);
//		currentTerm.setVisible(true);
//		startingTerm.setVisible(true);
//		campus.setVisible(true);
//		major.setVisible(true);
//		degreeType.setVisible(true);
//		id.setVisible(true);
//		userName.setVisible(true);
//		passWord.setVisible(true);
//		email.setVisible(true);
//		street.setVisible(true);
//		firstName.setVisible(true);
//		lastName.setVisible(true);
//		zip.setVisible(true);
	}
	











}
