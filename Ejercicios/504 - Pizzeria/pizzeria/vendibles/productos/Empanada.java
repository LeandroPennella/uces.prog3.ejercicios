package pizzeria.vendibles.productos;

import java.util.Map;

public class Empanada extends Producto{
	

	public Empanada(String nombre, double precio){
		super(nombre,precio);
		}
	//public double getPrecio(){return this.precio;}
	public void productosVendidos(Map<Producto,Integer> productosVendidos)
	{
		int cantidadAnterior=productosVendidos.get(this);
		productosVendidos.put(this, cantidadAnterior+1);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empanada other = (Empanada) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precio) != Double
				.doubleToLongBits(other.precio))
			return false;
		return true;
	}
	
}