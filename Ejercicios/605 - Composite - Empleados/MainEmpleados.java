import java.util.ArrayList;
import java.util.List;

import Empleado.Empleado;
import Empleado.EmpleadoJerarquico;
import Empleado.EmpleadoRaso;



public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado>empleados=new ArrayList<Empleado>();
		EmpleadoJerarquico gerenteGeneral=new EmpleadoJerarquico("pepe");
		EmpleadoJerarquico gerenteArea=new EmpleadoJerarquico("pepe");
		EmpleadoJerarquico jefeSeccion=new EmpleadoJerarquico("pepe");
		EmpleadoJerarquico supervisor=new EmpleadoJerarquico("pepe");
		supervisor.agregar(new EmpleadoRaso("pepe1"));
		supervisor.agregar(new EmpleadoRaso("pepe2"));
		supervisor.agregar(new EmpleadoRaso("pepe3"));
		jefeSeccion.agregar(supervisor);
		gerenteArea.agregar(jefeSeccion);
		gerenteGeneral.agregar(gerenteArea);
		
		System.out.println(jefeSeccion.getNumeroEmpleadosACargo());

		//empleados.add(new)
	}

}
