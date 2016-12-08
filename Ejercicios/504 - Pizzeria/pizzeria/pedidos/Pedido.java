package pizzeria.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pizzeria.vendibles.productos.Producto;

public class Pedido {
	private List<ItemPedido> items;
	private String direccion;

	public Pedido(String direccion, ItemPedido item) {
		this.direccion = direccion;
		items = new ArrayList<ItemPedido>();
		items.add(item);
	}

	public void addItem(ItemPedido item)
	{
		items.add(item);
	}
	
	public String getDireccion(){return this.direccion;}
	
	public double getPrecio()
	{
		double precio=0;
		for(ItemPedido item:items)
		{
			precio+=item.getPrecio();
		}
		return precio;
	}
		
	public void productosVendidos(Map<Producto,Integer> productosVendidos)
	{
		for(ItemPedido item:items)
		{
			item.productosVendidos(productosVendidos);
		}
	}
}
