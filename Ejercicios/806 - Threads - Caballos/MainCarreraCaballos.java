import carrera.Carrera;


public class MainCarreraCaballos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaArchivo="caballos.dat";
		Carrera carrera=Carrera.getCarrera();
		carrera.cargarCaballos(rutaArchivo);
		
	}

}
