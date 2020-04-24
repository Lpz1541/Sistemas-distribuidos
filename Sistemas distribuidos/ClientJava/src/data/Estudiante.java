package data;

public class Estudiante extends Persona{
	
	private long codigo;
	private String programa;
	private String fechaIngreso;
	
	public Estudiante() {
		super();
	}

	public Estudiante(int identificacion, String nombre, int edad, String sexo, int codigo, String programa,
			String fechaIngreso) {
		super(identificacion, nombre, edad, sexo);
		this.codigo = codigo;
		this.programa = programa;
		this.fechaIngreso = fechaIngreso;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Persona [identificacion=" + super.getIdentificacion() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", sexo=" + super.getSexo()
				+ ", codigo=" + codigo + ", fecha de ingreso=" + fechaIngreso + ", programa=" + programa +"]";
	}
}
