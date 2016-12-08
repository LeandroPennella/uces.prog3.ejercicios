package banco.cuenta.estado.opciones;

import banco.cuenta.estado.Estado;

public class Cerrada extends Estado {
	public Estado depositar(double monto) {
		return this;
	}

	public Cerrada(double saldo){this.saldo=saldo;}
	
	public Estado extraer(double monto) {
		if (this.saldo > monto) {
			this.saldo -= monto;
		}
		return this;
	}
	
	public Estado cerrar()
	{return this;}
}
