package principal;

public class registro_usuario {

	private String nombre;
	private int documento;
	private int telefono;
	private char direccion;
	
	
//constructor
	public registro_usuario() {
		nombre ="";
		documento=0;
		telefono=0;
		direccion=' ';
		
	}
	
//sobrecarga de constructor
	/*Evita poner en la clase usuario set y 
	 * get de cada atributo*/
	public registro_usuario(String n, int m,int g, char gg ) {
		nombre = n;
		documento=m;
		telefono=g;
		direccion=gg; 
		
	}
	
//Metodos private


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public char getDireccion() {
		return direccion;
	}


	public void setDireccion(char direccion) {
		this.direccion = direccion;
	}
	
	

}
