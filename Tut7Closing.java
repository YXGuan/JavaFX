
package JavaFX;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Tut7Closing extends Application{
	
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)  {//why throws Exception
		window = primaryStage;
		window.setTitle(" this is the title");
		
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		}
		
		);
		//window.setOnCloseRequest(e -> closeProgram());//whenever the user hit the x button this method will be called, however you gonna close it anyway
		
		button = new Button("close this program");
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,200);
		window.setScene(scene);
		window.show();
		
		
		
	}

	private void closeProgram() {
		Boolean check = Tut6ConfirmationBox.display("Title","do you want to exit??");
				if(check) {
					window.close();
				}
		
	}
	
}
