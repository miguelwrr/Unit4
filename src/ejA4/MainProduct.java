package ejA4;

public class MainProduct {

	public static void main(String[] args) {
		Product prod = new Product("PC", 400, 4);
		
		printProduct(prod);
		
		prod.setPrice(450);

		printProduct(prod);
	}

	static void printProduct(Product p) {
		System.out.printf("%s - Price: %.2f- TAX:%d%%, MPRT:%.2f\n", p.getName(), p.getPrice(), p.getTax(), p.getRetailPrice());
	}
}
