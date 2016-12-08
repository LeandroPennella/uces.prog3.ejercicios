package figuras;

public class Rectangulo extends Figura {
	public double lado1;
	public double lado2;
public Rectangulo(String nombre, double d, double e){
	super(nombre);
	this.lado1=d;
	this.lado2=e;
}
@Override
public double getSuperficie() {
return lado1*lado2;
}
}
