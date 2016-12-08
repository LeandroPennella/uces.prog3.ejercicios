package banco.cuenta.estado.opciones;

import banco.cuenta.estado.Estado;


public class Rojo extends Estado{
	
	public Rojo(double saldo){this.saldo=saldo;}
	
	public Estado depositar(double monto){
		this.saldo+=monto;
		return actualizarEstado();
		}
	public Estado extraer(double monto){return this;}

	public Estado actualizarEstado()
	{
		if (saldo>=0) {return new Normal(saldo);}
		else
		{return this;}
	}
	
	public Estado cerrar()
	{return this;}
}
