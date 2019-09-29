  package JavaFX;

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.TreeItem;
	import javafx.scene.control.TreeView;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;

	public class Tut16TreeViews extends Application {

	    Stage window;
	    TreeView<String> tree;

	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        window = primaryStage;
	        window.setTitle("JavaFX - thenewboston");

	        TreeItem<String> root, bucky, megan;
	        /*every tree has a root e.g. src --> 
	         * branch -->  
	         * leaf(an item without any children)
	         * all of them are called treeitem
	         */
	        //Root
	        root = new TreeItem<>();
	        root.setExpanded(true);

	        //Bucky branch
	        bucky = makeBranch("Bucky", root);//name of the listed item, name of its parent
	        makeBranch("thenewboston", bucky);
	        makeBranch("YouTube", bucky);
	        makeBranch("Chicken", bucky);
	        /* parent
	         * siblings 
	         * child
	         * 关系 
	         */

	        //Megan branch
	        megan = makeBranch("Megan", root);
	        makeBranch("Glitter", megan);
	        makeBranch("Makeup", megan);

	        //Create the tree and hide the main Root
	        tree = new TreeView<>(root);
	        tree.setShowRoot(true);//you can show or not
	        tree.getSelectionModel().selectedItemProperty()
	                .addListener((v, oldValue, newValue) -> {//this means many lines of code
	                    if (newValue != null)
	                        System.out.println(newValue.getValue());
	                });

	        //Layout
	        StackPane layout = new StackPane();
	        layout.getChildren().add(tree);
	        Scene scene = new Scene(layout, 300, 250);
	        window.setScene(scene);
	        window.show();
	    }

	    //Create branches
	    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
	        TreeItem<String> item = new TreeItem<>(title);
	        item.setExpanded(false);
	        parent.getChildren().add(item);
	        return item; //还是不理解return？？
	        //item's type is treeItem
	    }


	}