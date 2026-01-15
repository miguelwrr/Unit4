package ejA2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca los datos de la primera persona.");
		Persona p1 = crearPersona(introducirDatos(scanner));
		System.out.println("Introduzca los datos de la segunda persona.");
		Persona p2 = crearPersona(introducirDatos(scanner));
		
		System.out.println(mensaje(p1));
		System.out.println(mensaje(p2));
		
		System.out.printf("La diferencia de edad entre los 2 es de %d año%s.\n", p1.diferenciaEdad(p2), p1.diferenciaEdad(p2)!=1 ? "s" : "");
		System.out.println(String.format("%s ", args));
		
		
		
		scanner.close();
		
	}
	private static String[] introducirDatos(Scanner sc) {
		System.out.print("Introduzca DNI: ");
		String dni = sc.nextLine();
		System.out.print("Introduzca nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("Introduzca edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		return new String[] {dni, nombre, apellidos, Integer.toString(edad)};
		
	}
	private static Persona crearPersona(String[] datos) {
		return new Persona(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
	}
	private static String mensaje(Persona p) {
		String res = p.getNombre();
		res += " " + p.getApellidos();
		res += " con DNI " + p.getDni();
		res += (p.esMayorEdad() ? "" : "no");
		res += " es mayor de edad.";
		return res;
	}
}
