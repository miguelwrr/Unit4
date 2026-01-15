package ejA4;

public class Article {
	
	//Attributes
	private String name;
	private double price;
	final int TAX = 21;
	private int stockLeft;
	
	//Constructor
	Article(String name, double price, int stockLeft){
		checkName(name);
		this.name = name;
		
		checkPrice(price);
		this.price = price;
		
		checkStockLeft(stockLeft);
		this.stockLeft = stockLeft;
	}
	
	//Setters and getters
	void setName(String name) {
		checkName(name);
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setPrice(double price) {
		checkPrice(price);
		this.price = price;
	}
	double getPrice() {
		return price;
	}
	
	void setStockLeft(int stock) {
		checkStockLeft(stock);
		stockLeft = stock;
	}
	int getStockLeft() {
		return stockLeft;
	}
	
	
	//Methods
	double getTaxedPrice() {
		return price + price*(TAX/100);
	}
	
	
	
	
	//Value checkers
	
	static void checkName(String name) {
		if(name == null || name.trim().equals("")) {
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
}
