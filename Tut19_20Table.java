package JavaFX;

	import javafx.application.Application;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
	import javafx.scene.control.TextField;
	import javafx.scene.control.cell.PropertyValueFactory;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class Tut19_20Table extends Application {

	    Stage window;
	    TableView<Tut19_20Products> table;
	    TextField nameInput, priceInput, quantityInput;

	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        window = primaryStage;
	        window.setTitle("thenewboston - JavaFX");

    //Name column
    TableColumn<Tut19_20Products, String> nameColumn = new TableColumn<>("Name");
    nameColumn.setMinWidth(200);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

    //Price column
    TableColumn<Tut19_20Products, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

    //Quantity column
    TableColumn<Tut19_20Products, String> quantityColumn = new TableColumn<>("Quantity");
    quantityColumn.setMinWidth(100);
    quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

    //Name input
    nameInput = new TextField();
    nameInput.setPromptText("Name");
    nameInput.setMinWidth(100);

    //Price input
    priceInput = new TextField();
    priceInput.setPromptText("Price");

    //Quantity input
    quantityInput = new TextField();
    quantityInput.setPromptText("Quantity");

    //Button
    //this is when you adding functions to the buttons
    Button addButton = new Button("Add");
    addButton.setOnAction(e -> addButtonClicked());
    Button deleteButton = new Button("Delete");
    deleteButton.setOnAction(e -> deleteButtonClicked());

    HBox hBox = new HBox();
    hBox.setPadding(new Insets(10,10,10,10));
    hBox.setSpacing(10);//this makes the spacing between button and input equal to 10
    hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

    table = new TableView<>();
    table.setItems(getTut19_20Products());
    table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

    VBox vBox = new VBox();
    vBox.getChildren().addAll(table, hBox);//add hBox to the vBox layout

    Scene scene = new Scene(vBox);
    window.setScene(scene);
    window.show();
}

//Add button clicked
public void addButtonClicked(){
    Tut19_20Products Tut19_20Products = new Tut19_20Products();
    Tut19_20Products.setName(nameInput.getText());
    Tut19_20Products.setPrice(Double.parseDouble(priceInput.getText()));//priceInput.getText()) returns a String   paraDouble get the double inside a String
    Tut19_20Products.setQuantity(Integer.parseInt(quantityInput.getText()));
    table.getItems().add(Tut19_20Products);//?  get everything()items already on the table and put them onto product
    nameInput.clear();//not really neccesary thou
    priceInput.clear();
    quantityInput.clear();
}

//Delete button clicked
public void deleteButtonClicked(){
    ObservableList<Tut19_20Products> Tut19_20ProductsSelected, allTut19_20Productss;
    allTut19_20Productss = table.getItems();
    Tut19_20ProductsSelected = table.getSelectionModel().getSelectedItems();

    Tut19_20ProductsSelected.forEach(allTut19_20Productss::remove);
}

//Get all of the Tut19_20Productss
public ObservableList<Tut19_20Products> getTut19_20Products(){
    ObservableList<Tut19_20Products> Tut19_20Productss = FXCollections.observableArrayList();
    Tut19_20Productss.add(new Tut19_20Products("Laptop", 859.00, 20));
    Tut19_20Productss.add(new Tut19_20Products("Bouncy Ball", 2.49, 198));
    Tut19_20Productss.add(new Tut19_20Products("Toilet", 99.00, 74));
    Tut19_20Productss.add(new Tut19_20Products("The Notebook DVD", 19.99, 12));
    Tut19_20Productss.add(new Tut19_20Products("Corn", 1.49, 856));
	        return Tut19_20Productss;
	    }


	}

