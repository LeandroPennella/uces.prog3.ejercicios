package modelo;

public class Iterador {
	private Coleccion coleccion;
	private int posicion;

	public Iterador(Coleccion coleccion) {
		this.coleccion = coleccion;
		posicion=0;
	}

	public boolean hasNext() {
		return (posicion<coleccion.getlargo())?true:false;
	}

	public String next() {
		return coleccion.getNombre(posicion++);
	}
}
