package data;

public class Empleado extends Persona {
	
	private String cargo;
	private String fechaIngreso;
	private double salario;
	
	public Empleado() {
		super();
	}

	public Empleado(int identificacion, String nombre, int edad, String sexo, String cargo, String fechaIngreso,
			double salario) {
		super(identificacion, nombre, edad, sexo);
		this.cargo = cargo;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Persona [identificacion=" + super.getIdentificacion() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", sexo=" + super.getSexo()
				+ ", cargo=" + cargo + ", fecha de ingreso=" + fechaIngreso + ", salario=" + salario +"]";
	}
}
