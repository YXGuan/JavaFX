package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tut13Listening4SelectionChanges extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");
         
        //listen for the selection change
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue,newValue)-> System.out.println(newValue));
        /*reference to drop down menu--choice box,  
         * the method different type of list has different selection models, 
         * the item user selected, 
         * wait something happen, 
         * whenever the event occurs it will use 3 parameters 
         * left hand side is the parameter, 
         * right hand side is the thing you want to do 
        v observable
        */
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);
       
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }




}

