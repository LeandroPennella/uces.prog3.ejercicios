
public class MainDecorador {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		DecoradorDeOrdenadorDeNumeros mostrarTiempoAscedenteOrdenarNumeros=new DecoradorDeOrdenadorDeNumerosImprimirTiempo(new OrdenadorDeNumerosAscendente());
		int[] numeros={4,5,3,2,7,8,1,6,9,13,12313,123321545,4565567,67868,78979,8980,3453,23,17213,14325,5,564,7,5676,8,9798,9,8,5,3,2,7,8,1,6,9,13,12313,123321545,4565567,67868,78979,8980,3453,23,17213,14325,5,564,7,5676,8,9798,9,8,5,3,2,7,8,1,6,9,13,12313,123321545,4565567,67868,78979,8980,3453,23,17213,14325,5,564,7,5676,8,9798,9,8,5,3,2,7,8,1,6,9,13,12313,123321545,4565567,67868,78979,8980,3453,23,17213,14325,5,564,7,5676,8,9798,9,8};
		for(int numero:numeros)
		{System.out.println(numero);}
		mostrarTiempoAscedenteOrdenarNumeros.ordenar(numeros);
		for(int numero:numeros)
		{System.out.println(numero);}
	}

}
