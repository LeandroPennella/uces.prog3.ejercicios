public class OrdenadorDeNumerosAscendente extends OrdenadorDeNumeros{

	public void ordenar(int[] nummeros) {

		for (int i = 0; i < (nummeros.length - 1); i++) {
			for (int j = i + 1; j < nummeros.length; j++) {
				if (nummeros[i] > nummeros[j]) {

					int variableauxiliar = nummeros[i];
					nummeros[i] = nummeros[j];
					nummeros[j] = variableauxiliar;

				}
			}
		}

	}
}
