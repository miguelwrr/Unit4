package ejA1;

public class Punto {
	private int x;
	private int y;
	
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	void setCoords(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	void setCoords(int coords) {
		this.setX(coords);
		this.setY(coords);
	}
	int getX() {
		return this.x;
	}
	int getY() {
		return this.y;
	}
	int[] getCoords() {
		int[] coords = {this.x, this.y};
		return coords;
	}
}
