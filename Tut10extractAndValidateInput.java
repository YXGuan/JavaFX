package JavaFX;

//8年的时间从开始到赚钱？？
//english dominate the world
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tut10extractAndValidateInput extends Application{
	
	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{//what is throw exception and try and catch
		window = primaryStage;
		window.setTitle("this is the tit");
		
		//form
		TextField ageInput = new TextField();
		
		button = new Button("click me");
		button.setOnAction(e -> isInt (ageInput));
		
		//layout
		VBox  layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(ageInput, button);
		
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	
	}
	
	//validate age
	private boolean isInt(TextField input) {
		try{
			int age = Integer.parseInt(input.getText()); //get what ever you typed in and try to convert them into integer
			
			// actually you can do this:  int age = Integer.parseInt(message);
			System.out.println("user is :" + age);
			return true;//why do we need to return??? 
			}
		catch(NumberFormatException e){
			System.out.println("Error:    " + input.getText() + " is not a n int");
			return false;
		}
	}
	
	
}
