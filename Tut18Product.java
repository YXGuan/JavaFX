package JavaFX;
/*important
 * javaFX follows conventional getter and setter use intellij they pop up automatically
 */
	public class Tut18Product {

	    private String name;
	    private double price;
	    private int quantity;

	    public Tut18Product(){
	        this.name = "";
	        this.price = 0;
	        this.quantity = 0;
	    }

	    public Tut18Product(String name, double price, int quantity){
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	}