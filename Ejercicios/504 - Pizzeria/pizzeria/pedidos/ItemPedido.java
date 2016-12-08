package pizzeria.pedidos;

import java.util.Map;

import pizzeria.vendibles.Vendible;
import pizzeria.vendibles.productos.Producto;

public class ItemPedido {
private Vendible vendible;
private int cantidad;
public ItemPedido(Vendible vendible, int cantidad) {
	super();
	this.vendible = vendible;
	this.cantidad = cantidad;
}
public Vendible getElemento(){return this.vendible;}
//public int getCantidad(){return this.cantidad}

public double getPrecio()
{
	return vendible.getPrecio()*cantidad;
}

public void productosVendidos(Map<Producto,Integer> productosVendidos)
{
	for(int i=1;i<this.cantidad;i++)
	{
		vendible.productosVendidos(productosVendidos);
	}
	//item.productosVendido(productosVendido);

}
}
