package creador;

import java.util.Random;

import figuras.Figura;

public abstract class FigurasRandomFactory {
	Random r;
	public abstract Figura crearFiguraRandom();
}
