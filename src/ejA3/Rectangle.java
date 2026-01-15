package ejA3;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	Rectangle(int x1, int y1, int x2, int y2){
		setCoords(x1, y1, x2, y2);
		
	}
	
	Rectangle(int coord1, int coord2){
		this(coord1, coord1, coord2, coord2);
	}
	
	void setX1(int x) {
		if(x<x2) {
			x1 = x;
		} else throw new ArithmeticException("X1 must be less than X2.");
	}
	int getX1() {
		return x1;
	}
	
	void setY1(int y) {
		if(y<y2) {
			y1 = y;
		} else throw new ArithmeticException("Y1 must be less than Y2");
		
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
		try {
			setX2(x2);
			setY2(y2);
			setX1(x1);
			setY1(y1);
		}catch (ArithmeticException e) {
			this.x1 = 0;
			this.y1 = 0;
			this.x2 = 0;
			this.y2 = 0;
			System.out.println(e + " All values have been reset to 0.");
			
		}
		
	}
	void setCoords(int coord1, int coord2) {
		setCoords(coord1, coord1, coord2, coord2);
		
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
