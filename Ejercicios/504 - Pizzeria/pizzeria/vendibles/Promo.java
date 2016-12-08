package pizzeria.vendibles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pizzeria.vendibles.productos.Producto;

public class Promo extends Vendible {
	
	private List<Producto> productos ;
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public Promo(String nombre){
		super(nombre);
		this.productos=new ArrayList<Producto>();
	}
	
	public void addProductos(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecio()
	{
		double precio=0;
		for(Producto producto:productos)
		{
			precio+=producto.getPrecio();
		}
		return precio*0.75;
	}
	
	public void productosVendidos(Map<Producto,Integer> productosVendidos)
	{
		for(Producto producto:productos)
		{
			producto.productosVendidos(productosVendidos);
		}
	}

}
