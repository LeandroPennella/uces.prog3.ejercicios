
package creador;

import java.util.Random;

import figuras.Figura;
import figuras.Rectangulo;

public class FigurasRandomFactoryRectangulo extends FigurasRandomFactory {
	public Figura crearFiguraRandom() {
		 r=new Random();
		return new Rectangulo("Rectangulo",r.nextDouble(),r.nextDouble());
	};
}
