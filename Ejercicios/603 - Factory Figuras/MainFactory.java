import java.util.ArrayList;
import java.util.List;

import creador.FigurasRandomFactory;
import creador.FigurasRandomFactoryCirculo;
import creador.FigurasRandomFactoryRectangulo;
import figuras.Figura;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		FigurasRandomFactory creadorCirculo = new FigurasRandomFactoryCirculo();
		FigurasRandomFactory creadorRectangulo= new FigurasRandomFactoryRectangulo();
		List<Figura>figuras=new ArrayList<Figura>();
		
		figuras.add(creadorCirculo.crearFiguraRandom());
		figuras.add(creadorCirculo.crearFiguraRandom());
		figuras.add(creadorRectangulo.crearFiguraRandom());
		
		for(Figura figura:figuras)
		{
			System.out.println(figura.getNombre()+" - "+ figura.getSuperficie());
		}
		//System.out.println("superficie circulo :" + circulo.getSuperficie());
	}

}
