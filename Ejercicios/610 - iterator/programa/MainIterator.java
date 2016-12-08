package programa;

import modelo.Coleccion;
import modelo.Iterador;

public class MainIterator {
	public static void main(String[] args) {

		Coleccion coleccion=new Coleccion();
		coleccion.addNombre("pepe");
		coleccion.addNombre("juan");
		coleccion.addNombre("jose");
		
		Iterador iterador=coleccion.getIterador();
		while(iterador.hasNext())
		{
			System.out.println("nombre :"+iterador.next()+"/n");
		}
		
	}
}
