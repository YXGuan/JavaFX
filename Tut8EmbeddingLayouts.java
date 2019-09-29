package JavaFX;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Tut8EmbeddingLayouts extends Application{
	
	Stage window;
	
	public static void main(String []args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window= primaryStage;
		window.setTitle("this is the title");
		
		//you should never done this 
		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("edit");
		Button buttonC = new Button("File");
		topMenu.getChildren().addAll(buttonA,buttonB,buttonC);
		
		VBox sideMenu = new VBox();
		Button buttonD = new Button("1");
		Button buttonE = new Button("2");
		Button buttonF = new Button("3");
		sideMenu.getChildren().addAll(buttonD,buttonE,buttonF);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(sideMenu);
		
		
		
		
		Scene scene = new Scene(borderPane, 300, 200);
		window.setScene(scene);
		window.show();
		
		
	}

}
