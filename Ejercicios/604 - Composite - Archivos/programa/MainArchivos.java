package programa;

import java.io.File;

import modelo.Archivo;
import modelo.Contenedor;
import modelo.Elemento;

public class MainArchivos {

	private static Elemento elementoRaiz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "C:/Intel/Logs/IntelAMT.log";
		elementoRaiz=crearElemento(ruta);
		relevar(elementoRaiz);
		System.out.println("tamaño de "+ruta+": "+elementoRaiz.getSize());
	}

	public static void relevar(Elemento elemento)
	{
		if (elemento.getFile().isDirectory())
		{
			Contenedor contenedor=(Contenedor)elemento;
			for(File fileContenida:elemento.getFile().listFiles())
			{
				Elemento elementoRelevado=crearElemento(fileContenida.getPath());
				contenedor.agregarElemento(elementoRelevado);
				relevar(elementoRelevado);
			}
		}	
	}

	public static Elemento crearElemento(String ruta) {
		File file = new File(ruta);
		Elemento elemento=null;
		if (!file.exists()) {
			System.out.println("no existe");
		} else if (file.isDirectory()) {
			elemento = new Contenedor(file);
		} else {
			elemento = new Archivo(file);
		}
		return elemento;
	}
}
