package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Elemento {
	private List<Elemento> elementosContenidos = new ArrayList<Elemento>();

	public Contenedor(File file) {
		super(file);
	}

	public void agregarElemento(Elemento elemento){this.elementosContenidos.add(elemento);}
	
	public long getSize(){
		long size=0;
		for(Elemento elementoContenido:elementosContenidos)
			{size+=elementoContenido.getSize();
			}
		return size;
		}
}
