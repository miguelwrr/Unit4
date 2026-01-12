package ejA2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca los datos de la primera persona.");
		introducirDatos(p1, scanner);
		System.out.println("Introduzca los datos de la segunda persona.");
		introducirDatos(p2, scanner);
		
		System.out.println(mensaje(p1));
		System.out.println(mensaje(p2));
		
		
		
		
		
		scanner.close();
		
	}
	private static void introducirDatos(Persona p, Scanner sc) {
		System.out.print("Introduzca DNI: ");
		p.setDni(sc.nextLine());
		System.out.print("Introduzca nombre: ");
		p.setNombre(sc.nextLine());
		System.out.print("Introduzca apellidos: ");
		p.setApellidos(sc.nextLine());
		System.out.print("Introduzca edad: ");
		p.setEdad(sc.nextInt());
		sc.nextLine();
		
	}
	private static String mensaje(Persona p) {
		String res = p.getNombre();
		res += " " + p.getApellidos();
		res += " con DNI " + p.getDni();
		res += (p.getEdad()<18 ? "no" : "");
		res += " es mayor de edad.";
		return res;
	}
}
