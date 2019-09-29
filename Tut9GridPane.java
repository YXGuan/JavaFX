package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

	public class Tut9GridPane extends Application{
		
		Stage window;
		
		public static void main(String []args) {
			launch(args);
		}
		
		@Override
		public void start(Stage primaryStage) throws Exception{
			window= primaryStage;
			window.setTitle("this is the title");
			
		    //GridPane with 10px padding around edge
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(10,10,10,10));
			grid.setVgap(8);
			grid.setHgap(10);
			
			//Name label  constrains use (child, column, row)
			Label nameLabel = new Label("username:");
			GridPane.setConstraints(nameLabel, 0, 0);
			
			//Name input
			TextField nameInput = new TextField("bucky");
			GridPane.setConstraints(nameInput, 1, 0);
			
			//Password Label
			Label passLabel = new Label("PassWord:");
			GridPane.setConstraints(passLabel, 0, 1);
			
			//Password Input
			TextField passInput = new TextField();
			passInput.setPromptText("password");
			GridPane.setConstraints(passInput, 1, 1);
			
			Button logInButton= new Button("log in ");
			GridPane.setConstraints(logInButton,1,2);
			
		    //Add everything to grid
			grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, logInButton);
			
			Scene scene = new Scene(grid,300,300);
			window.setScene(scene);
			window.show();			
		}

	}
