package caballo;

import java.util.Random;

public class Caballo {
	private String nombre;
	private int velocidadMinima;
	private int velocidadMaxima;
	private int posicion;
	
	public Caballo(String nombre, int velocidadMinima, int velocidadMaxima) {
		super();
		this.nombre = nombre;
		this.velocidadMinima = velocidadMinima;
		this.velocidadMaxima = velocidadMaxima;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getVelocidadMinima() {
		return velocidadMinima;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public int getPosicion() {
		return posicion;
	}
	
	public void largar()
	{
		this.posicion=0;
		this.avanzar();
	}
	
	public int avanzar()
	{
		//int metros=this.velocidadMinima;
		Random r=new Random();
		int metros=(r.nextInt((this.velocidadMaxima-this.velocidadMinima)+1))+this.velocidadMinima;
		this.posicion+=metros;
		return metros;
		//return metros;
	}
}
