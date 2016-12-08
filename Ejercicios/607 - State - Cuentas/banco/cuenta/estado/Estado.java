package banco.cuenta.estado;




public abstract class Estado {
	protected double saldo=0; 
	
	public abstract Estado depositar(double monto);
	public abstract Estado extraer(double monto);

	public double obtenerSaldo(){return saldo;}
	public abstract Estado cerrar();

	
}
