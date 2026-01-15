package ejA2;

class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	Persona(String dni, String nombre, String apellidos, int edad){
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}
	void setDni(String dni) {
		//dni = eliminarEspacios(dni);
		char[] dniChars = dni.toCharArray();
		if(dni.length()==9 && Character.isLetter(dniChars[8])) {
			for(int i = 0; i<8; i++) {
				if((i==0 && !(Character.isLetterOrDigit(dniChars[0]))) || i>0 && !(Character.isDigit(dniChars[i]))) {
					throw new ArithmeticException("dni no válido");
				}
			}
			this.dni = dni;
		}else {throw new ArithmeticException("dni no válido por letra o longitud");}
	}
	
	String getDni() {
		return dni;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}
	String getNombre() {
		return nombre;
	}
	
	void setApellidos(String apellidos) {
		this.apellidos = apellidos.trim();
	}
	String getApellidos() {
		return apellidos;
	}
	
	void setEdad(int edad) {
		if(edad<0 || edad>150) {
			throw new IndexOutOfBoundsException();
		}else {this.edad = edad;}
	}
	int getEdad() {
		return edad;
	}
	
	public static String eliminarEspacios(String cadena) {
		String res = "";
		for(int i = 0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' ') {
				res+=cadena.charAt(i);
			}
		}
		return res;
	}
	public boolean esMayorEdad() {
		return edad>=18;
	}
	public boolean esJubilado() {
		return edad>=65;
	}
	public int diferenciaEdad(Persona p) {
		return Math.abs(p.getEdad() - edad);
	}
	public String toString() {
		return String.format("DNI: %s Nombre: %s Apellidos: %s Edad: %d", dni, nombre, apellidos, edad);
	}
}
