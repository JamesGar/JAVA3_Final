package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class LoginScreen {

	GridPane grid = new GridPane();
	Label title = new Label("Login");
	Button b1 = new Button("Login");
	TextField username = new TextField();
	TextField password = new TextField();
	SideOptions sideOptions = new SideOptions();


	public LoginScreen(){

	}
	
	public GridPane getMyGrid(){
//		
//		b1.setOnAction(e ->{
//			System.out.println("Hey, It worked");
//		});

		
		grid.add(title, 3, 0);
		grid.add(username, 2, 2);
		grid.add(password,4,2);
		grid.add(b1, 3, 5);
		//grid.add(sideOptions.getSidePane(), 10, 0);
		return grid;
	}
	
	public Button getContinueButton(){
		return b1;
	}
	
	public String getUserName(){
		return username.getText();
	}
	public String getPassword(){
		return password.getText();
	}

}
