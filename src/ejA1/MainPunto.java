package ejA1;

public class MainPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10,10);
		Punto p3 = new Punto(-3, 7);
		
		Punto[] puntos = {p1, p2, p3};
		mostrarCoords(puntos);
		p1.setX(4);
		p3.setCoords(21);
		mostrarCoords(puntos);
		p2.setCoords(3, -9);
		mostrarCoords(puntos);
		
		

	}

	static void mostrarCoords(Punto[] puntos) {
		int i = 1;
		for (Punto punto: puntos) {
			int[] coords = punto.getCoords();
			System.out.println("Punto " + i + ": X = " + coords[0] + ", Y = " + coords[1] + ".");
			i++;
		}
		System.out.println();
	}
}
