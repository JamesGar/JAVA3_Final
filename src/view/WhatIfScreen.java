package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class WhatIfScreen {
	
	private Label title = new Label("What-If?");
	private GridPane grid = new GridPane();
	ObservableList<String> options = FXCollections.observableArrayList();
	private ComboBox<String> comboBox;
	Button newSainButton = new Button("View New Sain");
	
	public GridPane getMyGrid(){
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(title, 2, 1);
		//grid.add(comboBox, 4, 4);
		grid.add(newSainButton, 5, 4);
	
		return grid;
	}
	
	public void addOptions(String a, String b, String c, String d, String e){
		//only happens when nothing has been added to 'options' yet, ie only one time 'what-if?'button is pressed.
		if(options.size() == 0){
			options.add(a);
			options.add(b);
			options.add(c);
			options.add(d);
			options.add(e);
		}
		comboBox = new ComboBox<String>(options);
	}
	
	public String getBoxInfo(){
		return comboBox.getValue();
	}
	
	public void hide(){
		grid.getChildren().remove(title);
		grid.getChildren().remove(comboBox);
		grid.getChildren().remove(newSainButton);
		
	}
	public void show(){
		grid.add(title, 2, 1);
		grid.add(comboBox, 4, 4);
		grid.add(newSainButton, 5, 4);
	}

}
