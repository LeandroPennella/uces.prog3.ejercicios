package pizzeria.vendibles.productos;

import java.util.Map;

import pizzeria.vendibles.Vendible;

public abstract class Producto extends Vendible {

	double precio;

	public Producto(String nombre, double precio) {
		super(nombre);
		this.precio = precio;
	}

	public abstract void productosVendidos(
			Map<Producto, Integer> productosVendidos);

	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return this.nombre;
	}
}
