package figuras;

public class Circulo extends Figura{
	private double radio=10;
	public Circulo(){}
public Circulo(String nombre, double radio){
	super(nombre);
	this.radio=radio;
	
}
	public double getSuperficie(){return radio*radio*3.1459;}
}
