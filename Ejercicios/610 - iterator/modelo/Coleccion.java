package modelo;

public class Coleccion {
	private String[] nombres = new String[0];

	public String getNombre(int posicion) {
		return nombres[posicion];
	}

	public void addNombre(String nombre) {

		int largo = nombres.length;
		String[] buffer = new String[largo + 1];
		if (largo == 0) {
			buffer[0] = nombre;
		} else {

			int i;
			for (i = 0; i < largo; i++) {
				buffer[i] = nombres[i];
			}

			buffer[i] = nombre;
		}
		nombres = buffer;
	}

	public Iterador getIterador() {
		return new Iterador(this);
	}

	public int getlargo() {
		return nombres.length;
	}
}
