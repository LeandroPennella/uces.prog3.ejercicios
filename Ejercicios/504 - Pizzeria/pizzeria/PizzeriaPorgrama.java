package pizzeria;

import pizzeria.pedidos.ItemPedido;
import pizzeria.pedidos.Pedido;
import pizzeria.vendibles.Promo;
import pizzeria.vendibles.productos.Empanada;
import pizzeria.vendibles.productos.Pizza;

public class PizzeriaPorgrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizzeria pizzeria = new Pizzeria("Ugi");
		
		Empanada empanadaCarne=new Empanada("carne",5);
		Pizza pizzaMuzza=new Pizza("muzza",7);
		
		Promo promo1=new Promo("promo1");
		promo1.addProductos(empanadaCarne);
		promo1.addProductos(empanadaCarne);//10*.75=7.5

		pizzeria.addProductos(empanadaCarne);
		pizzeria.addProductos(pizzaMuzza);
		pizzeria.addPromos(promo1);

		//Pedido1
		pizzeria.addPedidos(new Pedido("soler",new ItemPedido(empanadaCarne,3)));	//15

		//Pedido2
		Pedido pedido1=new Pedido("soler",new ItemPedido(pizzaMuzza,24));			//15+28=43
		pizzeria.addPedidos(pedido1);
		
		//Pedido3		
		//pizzeria.addPedidos(new Pedido("soler",new ItemPedido(promo1,2)));			//43+15
	
		//Pedido4
		/*
		Pedido pedido4=new Pedido("sarasa", new ItemPedido(promo1,2));				//58+15=73
		pedido4.addItem(new ItemPedido(empanadaCarne, 1));							//73+5=67
		pizzeria.addPedidos(pedido4);
		*/
		System.out.println(pizzeria.recaudacionTotal());
		System.out.println(pizzeria.getMasVendido());
//		System.out.println("fin");
	}

}
