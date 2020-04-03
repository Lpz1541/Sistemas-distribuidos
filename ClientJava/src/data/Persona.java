package data;

public class Persona {
	
	private int identificacion;
	private String nombre;
	private int edad;
	private String sexo;
	
	public Persona() {
		
	}
	
	public Persona(int identificacion, String nombre, int edad, String sexo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ "]";
	}

}
