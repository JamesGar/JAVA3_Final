package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import model.Major;

public class WhatIfScreen {
	
	private Label title = new Label("What-If?");
	private GridPane grid = new GridPane();
	ObservableList<String> options = FXCollections.observableArrayList();
	private ComboBox comboBox;
	
	public GridPane getMyGrid(){
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(comboBox, 4, 4);
		
		return grid;
	}
	
	public void addOptions(String a, String b, String c, String d, String e){
		options.add(a);
		options.add(b);
		options.add(c);
		options.add(d);
		options.add(e);
		comboBox = new ComboBox(options);
		
	}

}
