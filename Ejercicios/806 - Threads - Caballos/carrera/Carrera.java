package carrera;

import java.util.ArrayList;
import java.util.List;


import caballo.Caballo;
import caballo.CaballoRunnable;

public class Carrera {
	List<Thread> threads;
	List<Caballo>caballos;
	List<CaballoRunnable>caballosRunnables;
	private static Carrera instancia;
	
	private Carrera()
	{
		caballos=new ArrayList<Caballo>();
		caballosRunnables=new ArrayList<CaballoRunnable>();
		threads=new ArrayList<Thread>();
		//cargarCaballos();
		for(Caballo caballo:caballos)
		{
			threads.add(new Thread(new CaballoRunnable(caballo)));
		}
	}
	
	public  static Carrera getCarrera()
	{
		if (instancia==null){instancia=new Carrera();}
		return instancia;
	}
	
	public void cargarCaballos(String rutaArchivo)
	{
		
	}
	
	public void largar()
	{
		for(CaballoRunnable caballoRunnable:caballosRunnables)
		{
			caballoRunnable.avanzar();
		}
		
	}
}
