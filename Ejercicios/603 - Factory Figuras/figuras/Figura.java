package figuras;

public abstract class Figura {
	private String nombre;

	public Figura() {
	}

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getSuperficie();

	public String getNombre() {
		return nombre;
	}

}
