package ejA1;

public class Punto {
	int x;
	int y;
	
	
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
}
