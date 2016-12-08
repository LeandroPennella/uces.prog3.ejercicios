package creador;

import figuras.Circulo;
import figuras.Figura;
import java.util.Random;

public class FigurasRandomFactoryCirculo extends FigurasRandomFactory {
	public Figura crearFiguraRandom() {
		r=new Random();
		return new Circulo("Circulo",r.nextDouble());
	};
}
