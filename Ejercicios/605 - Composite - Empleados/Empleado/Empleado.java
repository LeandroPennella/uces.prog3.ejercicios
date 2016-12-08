package Empleado;

public abstract class Empleado {
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	public abstract int getNumeroEmpleadosACargo();

}
