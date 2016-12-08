package banco;

import java.util.ArrayList;
import java.util.List;

import banco.cuenta.Cuenta;

public class Cliente {
	private String nombre;
	private double dni;
	private List<Cuenta> cuentas=new ArrayList<Cuenta>();
	
	
	public Cliente(String nombre, double dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDni() {
		return dni;
	}
	public void setDni(double dni) {
		this.dni = dni;
	}
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	public void agregarCuenta(Cuenta cuenta)
	{
		this.cuentas.add(cuenta);
	}
}
