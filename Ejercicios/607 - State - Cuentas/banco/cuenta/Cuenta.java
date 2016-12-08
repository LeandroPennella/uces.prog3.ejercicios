package banco.cuenta;

import banco.cuenta.estado.Estado;
import banco.cuenta.estado.opciones.Normal;


public class Cuenta {
	private Estado estado=new Normal();

	public Cuenta() {
		super();
		
	}

	public void depositar(double monto) {
		this.estado=estado.depositar(monto);
		
	}

	public void extraer(double monto) {
		this.estado= estado.extraer(monto);
	}

	public double obtenerSaldo() {
		return estado.obtenerSaldo();
	}
	
	public void cerrar()
	{estado=estado.cerrar();}
	
	public String obtenerEstado(){return this.estado.getClass().toString();}
}
