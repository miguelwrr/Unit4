package ejA1;

public class Punto {
	private int x;
	private int y;
	
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Punto(int coord){
		this(coord, coord);
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	public void setXY(int coords) {
		setXY(coords, coords);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int[] getXY() {
		int[] coords = {x, y};
		return coords;
	}
	
	public void desplaza(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public double distancia(Punto p) {
		int dx = Math.abs(p.getX() - x);
		int dy = Math.abs(p.getY() - y);
		return Math.sqrt((double) dx*dx + (double) dy*dy);
	}
	
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
