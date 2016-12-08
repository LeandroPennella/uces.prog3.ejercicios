package clases;

import java.util.Random;

public class Escritor extends Thread {
	private Recurso recurso;
	private Random random = new Random();
	
	public Escritor(Recurso recurso) {
		this.recurso = recurso;
	}
	
	public void run()
	{
		try{
			synchronized(this){
				recurso.setBuffer("lalala");
			}
		}
		catch (Exception e){
			
		}
	}
	public String producir() {
		
		String posibles = "abcdefhijklmnopqrstuvwxyz";
		String cadena="" + 
				posibles.charAt(random.nextInt(posibles.length()))+
				posibles.charAt(random.nextInt(posibles.length()))+"-"
				;
		System.out.println("produce >" + cadena);
		return cadena;
	}
	
}
