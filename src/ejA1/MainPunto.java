package ejA1;

public class MainPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10);
		Punto p3 = new Punto(-3, 7);
		
		System.out.println(p1.distancia(p2));
		Punto[] puntos = {p1, p2, p3};
		mostrarCoords(puntos);
		p1.setX(4);
		p3.setXY(21);
		mostrarCoords(puntos);
		p2.setXY(3, -9);
		p1.desplaza(1, 3);
		mostrarCoords(puntos);
		System.out.println(p1.toString());
		
		
		

	}

	static void mostrarCoords(Punto[] puntos) {
		int i = 1;
		for (Punto punto: puntos) {
			int[] coords = punto.getXY();
			System.out.println("Punto " + i + ": X = " + coords[0] + ", Y = " + coords[1] + ".");
			i++;
		}
		System.out.println();
	}
}
