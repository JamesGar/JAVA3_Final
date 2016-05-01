package view;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SelectTermScreen {
//	MainView view;
	GridPane grid;
	ComboBox term;
	Label title;
	Button b1;
	//^ make sure you check for if term is selected before button does anything.
	public SelectTermScreen(){
		
	}

	
	public GridPane getMyGrid(){
//		view = new MainView();
		grid = new GridPane();
		 term = new ComboBox();
		title = new Label("Select Term:");
		b1 = new Button("Continue");
		

		grid.add(title, 3, 0);
		grid.add(term, 3, 2);
		grid.add(b1, 2, 3);
		return grid;
	}


}
