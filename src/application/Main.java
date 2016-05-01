package application;
	
import model.Account;
import model.Address;
import model.Enrollment;
import model.Major;
import model.MajorBag;
import model.Student;
import model.StudentBag;
import javafx.application.Application;
import javafx.stage.Stage;
import view.FacadeGUI;
import view.MainView;
import controller.MainController;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		MainView view = new MainView(primaryStage);
		//main controller constructor may also need arguments for all the different bags it checks
		MainController controller = new MainController(view);
		//** Eventually probably going to have to switch around contr. and facade so that controller knows about beginning facade.
		//**^ after I find a way to make facade not need to know controller.
		FacadeGUI facade = new FacadeGUI(view,controller);
		facade.setLoginView();
		
		//** but until then just have this method:
		controller.setFacade(facade);
		

	
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
