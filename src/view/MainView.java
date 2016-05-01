package view;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView{

	Pane pane = new Pane();
	int staffValue;



	
	public MainView(Stage primaryStage) {
		
//		
//		facade.setLoginView();
//
//		pane = facade.getPane();
//		facade.setSainView();
//		facade.getContinueButton().setOnAction(e ->{
//			facade.setSelectView();
//			
//			pane = facade.getPane();
//		});
		
		
		Scene s = new Scene(pane, 740,640);
		
		
		
		primaryStage.setScene(s);
		primaryStage.show();
	}
	
	
	public void makeDoesNotExistWindow(Stage popUpStage, Scene popUp){
		popUpStage.setScene(popUp);
		popUpStage.show();
		
	}
//	public void setSearchView(){
//		//facade.setSearchView();
//		
//	}
	public void setStaffValue(int i){
		staffValue = i;
	}
	public int getStaffValue(){
		return staffValue;
	}
	//One method for all different views?
	public void setNewView(Pane facadePane){
		
		pane.getChildren().clear();
		pane.getChildren().add(facadePane);
	}



}
