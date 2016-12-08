package pizzeria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pizzeria.pedidos.Pedido;
import pizzeria.vendibles.Promo;
import pizzeria.vendibles.productos.Producto;

public class Pizzeria {
	private List<Pedido> pedidos;
	private List<Producto> productos;
	private List<Promo> promos;
	private Map<Producto,Integer> productosVendidos;
	//private String nombre;

	// private Map<Producto,int> historial;

	public Pizzeria(String nombre) {
		super();
		//this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
		this.promos = new ArrayList<Promo>();
		this.pedidos= new ArrayList<Pedido>();
		this.productosVendidos=new HashMap<Producto, Integer>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedidos(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void addProductos(Producto producto) {
		this.productos.add(producto);
	}

	public List<Promo> getPromos() {
		return promos;
	}

	public void addPromos(Promo promo) {
		this.promos.add(promo);
	}

	public double recaudacionTotal() {
		double recaudacion=0;
		for(Pedido pedido:pedidos)
		{
			recaudacion+=pedido.getPrecio();
		}
		return recaudacion;
		
	};
	
	public String getMasVendido()
	{
		//creo el mapa de productos vendidos
		for(Producto producto:productos)
		{
			this.productosVendidos.put(producto, 0);
		}
		
		//recorro los pedidos preguntando cuantos productos sw vendio
		for(Pedido pedido:pedidos)
		{
			pedido.productosVendidos(productosVendidos);
		}
		
		//busco la mayor cantidad
        Integer cantidadMayor=0;
        Producto masVendido=null;
        for(Producto producto: productosVendidos.keySet()) {
            if(productosVendidos.get(producto)>cantidadMayor)
            {
            	masVendido=producto;
            	cantidadMayor=productosVendidos.get(producto);
            }
        }

		return (masVendido==null)?"no hay producto mas vendido":masVendido.getNombre();
	}

}
