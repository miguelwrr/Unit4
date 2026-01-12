package ejA3;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	Rectangle(int coord1, int coord2){
		this(coord1, coord1, coord2, coord2);
	}
	
	void setX1(int x) {
		x1 = x;
	}
	int getX1() {
		return x1;
	}
	
	void setY1(int y) {
		y1 = y;
	}
	int getY1() {
		return y1;
	}
	
	void setX2(int x) {
		x2 = x;
	}
	int getX2() {
		return x2;
	}
	
	void setY2(int y) {
		y2 = y;
	}
	int getY2() {
		return y2;
	}
	
	void setCoords(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}
	void setCoords(int coord1, int coord2) {
		setX1(coord1);
		setY1(coord1);
		setX2(coord2);
		setY2(coord2);
	}
	int[] getCoords() {
		int[] res = {x1, y1, x2, y2};
		return res;
	}
	
	int getPerimeter() {
		return Math.abs(x2-x1)*2 + Math.abs(y2-y1)*2;
	}
	
	int getArea() {
		return Math.abs(x2-x1) * Math.abs(y2-y1);
	}
	
	int[] getCPA() {
		int[] res = new int[6];
		
		int[] coords = getCoords();
		
		for(int i = 0; i<4; i++) 
			res[i] = coords[i];
		res[4] = getPerimeter();
		res[5] = getArea();
		
		return res;
	}
}
