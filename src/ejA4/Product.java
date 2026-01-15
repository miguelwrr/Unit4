package ejA4;

public class Product {
	
	//Attributes
	private String name;
	private double price;
	private int tax = 21;
	private int stockLeft;
	
	//Constructor
	Product(String name, double price, int stockLeft){
		setName(name);
		
		setPrice(price);
		
		setStockLeft(stockLeft);
	}
	
	Product(String name, double price, int tax, int stockLeft){
		this(name, price, stockLeft);
		setTax(tax);
	}
	
	//Setters and getters
	void setName(String name) {
		try {
			checkName(name);
			this.name = name;
		}catch(IllegalArgumentException e){
			System.out.println(e + " Please enter a valid name using setName().");
		}
		
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setPrice(double price) {
		try {
			checkPrice(price);
			this.price = price;
		}catch(ArithmeticException e) {
			System.out.println(e + " Please enter a valid price using setPrice().");
		}
		
	}
	double getPrice() {
		return price;
	}
	
	void setTax(int tax) {
		try {
			checkTax(tax);
			this.tax = tax;
		} catch(IllegalArgumentException e) {
			System.out.println(e + " Please enter a valid tax using setTax().");
		}
	}
	int getTax() {
		return tax;
	}
	void setStockLeft(int stock) {
		try {
			checkStockLeft(stock);
			stockLeft = stock;
		}catch(ArithmeticException e) {
			System.out.println(e + " Please enter a valid stock using setStockLeft().");
		}
		
	}
	int getStockLeft() {
		return stockLeft;
	}
	
	
	//Methods
	double getRetailPrice() {
		return price + price*((double) tax/100);
	}
	
	double getDiscountRetailPrice(int discount) {
		return getRetailPrice() - getRetailPrice()*((double) discount/100);
	}
	
	boolean sell() {
		if(stockLeft>0) 
			return true;
		return false;
		
	}
	void restock(int qty) {
		setStockLeft(getStockLeft() + qty);
	}
	
	public String toString() {
		return String.format("Name: %s | Price: %f | Tax: %d | Stock left: %d.", getName(), getPrice(), getTax(), getStockLeft());
	}
	//Value checkers
	
	static void checkName(String name) {
		if(name.trim().equals("")) {
			throw new IllegalArgumentException("Item must have a name.");
		}
	}
	static void checkPrice(double price) {
		if(price<0.01) {
			throw new ArithmeticException("Article must have some value.");
		}
			
	}
	static void checkStockLeft(int stock) {
		if(stock<0) {
			throw new ArithmeticException("Cannot have negative stock.");
		}
	}
	static void checkTax(int tax) {
		if(tax<0 || tax>100) {
			throw new IllegalArgumentException("Item tax must be in range 0-100");
		}
	}
}
