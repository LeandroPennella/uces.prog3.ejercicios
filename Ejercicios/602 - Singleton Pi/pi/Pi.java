package pi;

public class Pi {

	private static Pi INSTANCE = null;
	private final double valor = 3.1459;

	// Private constructor suppresses
	private Pi() {
		System.out.println("creando");
	}

	// creador sincronizado para protegerse de posibles problemas multi-hilo
	// otra prueba para evitar instanciación múltiple
	private synchronized static void createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Pi();
		}
	}

	public static Pi getInstance() {
		if (INSTANCE == null)
			createInstance();
		return INSTANCE;
	}

	public double getValor() {
		return this.valor;
	}
}
