package JavaFX;
	//one of the problem is next Time i need to make a table I need to go back here and check all the words
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

	public class Tut18TableView extends Application {

	    Stage window;
	    TableView<Tut18Product> table;  //this is your entire table <type of data>

	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        window = primaryStage;
	        window.setTitle("thenewboston - JavaFX");

	        //Name column
	        //what is a <>????
	        TableColumn<Tut18Product, String> nameColumn = new TableColumn<>("Name");//"name is the header"
	        nameColumn.setMinWidth(200);
	        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

	        //Price column
	        TableColumn<Tut18Product, Double> priceColumn = new TableColumn<>("Price");
	        priceColumn.setMinWidth(100);
	        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

	        //Quantity column
	        TableColumn<Tut18Product, String> quantityColumn = new TableColumn<>("Quantity");
	        quantityColumn.setMinWidth(100);
	        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

	        table = new TableView<>();
	        table.setItems(getTut18Product());
	        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

	        VBox vBox = new VBox();
	        vBox.getChildren().addAll(table);

	        Scene scene = new Scene(vBox);
	        window.setScene(scene);
	        window.show();
	    }

	    //Get all of the Tut18Products
	    //curly bracket
	    public ObservableList<Tut18Product> getTut18Product(){//<what type of data in your list(name of your list)>
	        ObservableList<Tut18Product> Tut18Products = FXCollections.observableArrayList();//this is the type of observable list you can put java objects inside
	        Tut18Products.add(new Tut18Product("Laptop", 859.00, 20));
	        Tut18Products.add(new Tut18Product("Bouncy Ball", 2.49, 198));
	        Tut18Products.add(new Tut18Product("Toilet", 99.00, 74));
	        Tut18Products.add(new Tut18Product("The Notebook DVD", 19.99, 12));
	        Tut18Products.add(new Tut18Product("Corn", 1.49, 856));
	        return Tut18Products;
	    }


	}
