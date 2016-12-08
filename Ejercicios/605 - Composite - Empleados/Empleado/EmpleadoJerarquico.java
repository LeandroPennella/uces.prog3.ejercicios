package Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico extends Empleado {
	private List<Empleado> empleadosACargo;
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
		empleadosACargo=new ArrayList<Empleado>();
		// TODO Auto-generated constructor stub
	}

	

	public void agregar(Empleado empleado) {
		empleadosACargo.add(empleado);
	}

	public int getNumeroEmpleadosACargo() {
		int i = 0;
		for (Empleado empleado : empleadosACargo) {
			i = i+1+empleado.getNumeroEmpleadosACargo();
		}
		return i;
	}
}
