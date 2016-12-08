public class DecoradorDeOrdenadorDeNumerosImprimirTiempo extends DecoradorDeOrdenadorDeNumeros {
	
	public DecoradorDeOrdenadorDeNumerosImprimirTiempo(OrdenadorDeNumeros ordenadorDeNumeros) {
		super(ordenadorDeNumeros);
	}
	
	public void ordenar(int[] numeros){
		long inicio=System.currentTimeMillis();
		ordenadorDeNumeros.ordenar(numeros);
		long fin=System.currentTimeMillis();
		System.out.println("ordenado en " + (fin-inicio) + "ms");
	}
}
