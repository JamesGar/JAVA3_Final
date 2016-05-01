package view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SideOptions {
	
	Pane options = new Pane();
	VBox optionPane = new VBox(20);
	Button adminAddRemove = new Button("Add/Remove Course");
	Button adminChange = new Button("Change Course Info");
	Button whatIf = new Button("What-If?");
	Button saveAndExit = new Button("Save Data and Quit");
	Rectangle r1 = new Rectangle();
	
	public GridPane getSidePane(){
		
		GridPane grid = new GridPane();
		r1.setFill(Color.CORNFLOWERBLUE);
		r1.setHeight(500);
		r1.setWidth(100);
		optionPane.getChildren().add(r1);
		//optionPane.getChildren().add(adminAddRemove);
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.setConstraints(optionPane, 40, 0, 10, 5);
		grid.add(optionPane, 40, 0);
		grid.add(adminAddRemove, 40, 2);
		
		return grid;
	}

}
