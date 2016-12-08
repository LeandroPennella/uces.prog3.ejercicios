package banco.cuenta.estado.opciones;

import banco.cuenta.estado.Estado;

public class Normal extends Estado {
	
	public Normal(){}
	public Normal(double saldo){this.saldo=saldo;}
	
	public Estado depositar(double monto) {
		this.saldo += monto;
		return this;
	}

	public Estado extraer(double monto) {
		this.saldo -= monto;
		return actualizarEstado();
	}

	public Estado actualizarEstado()
	{
		if (saldo>=0) {return this;}
		else
		{return new Rojo(saldo);}
	}
	
	public Estado cerrar()
	{return new Cerrada(saldo);}
}
