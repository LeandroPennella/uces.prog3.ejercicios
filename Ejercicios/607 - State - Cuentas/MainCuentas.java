import banco.Cliente;
import banco.cuenta.Cuenta;


public class MainCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente=new Cliente("pepe",1234);
		Cuenta cuenta=new Cuenta();
		cliente.agregarCuenta(cuenta);
		System.out.println("crear cuenta");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.depositar(100);
		System.out.println("depositar 100");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.extraer(100);
		System.out.println("extraer 100");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.extraer(100);
		System.out.println("extraer 100");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.cerrar();
		System.out.println("cerrar");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.depositar(100);		
		System.out.println("depositar 100");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.cerrar();
		System.out.println("cerrar");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.depositar(100);		
		System.out.println("depositar 100");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		cuenta.cerrar();
		System.out.println("cerrar");
		System.out.println("saldo :" +cuenta.obtenerSaldo()+" - "+cuenta.obtenerEstado());
		
	}

}
