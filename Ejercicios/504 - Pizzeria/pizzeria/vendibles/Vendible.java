package pizzeria.vendibles;

import java.util.Map;

import pizzeria.vendibles.productos.Producto;

public abstract class Vendible {
	protected String nombre;
	public Vendible(String nombre)
	{
		this.nombre=nombre;
	}
	public abstract double getPrecio();
	
	public abstract void productosVendidos(Map<Producto,Integer> productosVendidos);
}
