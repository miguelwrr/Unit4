package ejA2;

class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
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
	public static String eliminarEspacios(String cadena) {
		String res = "";
		for(int i = 0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' ') {
				res+=cadena.charAt(i);
			}
		}
		return res;
	}
	String getDni() {
		return this.dni;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	String getNombre() {
		return this.nombre;
	}
	
	void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	String getApellidos() {
		return this.apellidos;
	}
	
	void setEdad(int edad) {
		if(edad<0 || edad>150) {
			throw new IndexOutOfBoundsException();
		}else {this.edad = edad;}
	}
	int getEdad() {
		return this.edad;
	}
}
