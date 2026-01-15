package ejA3;

public class MainRectangle {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(0, 5);
		Rectangle rec2 = new Rectangle(7, 9, 10, 10);
		
		printData(rec1, rec2);
		System.out.println();
		
		rec1.setCoords(9, -2, -1, 10);
		rec2.setCoords(91, 190);
		
		printData(rec1, rec2);
		
		
		

	}
	static void printData(Rectangle rec) {
		int[] data = rec.getCPA();
		System.out.printf("Coordinates: (%d, %d)(%d, %d)\n"
				+ 		  "Perimeter: %d u\n"
				+ 		  "Area: %d u2\n",
				data[0], data[1], data[2], data[3], data[4], data[5]);
	}
	
	static void printData(Rectangle rec1, Rectangle rec2) {
		System.out.println("Rectangle 1:");
		printData(rec1);
		System.out.println("\nRectangle 2:");
		printData(rec2);
	}
	
	

}
