package cine;

import java.util.Arrays;

public class Sala {

	private Butaca2 asientos[][];
	private boolean modo_covid;
	private int numero_filas;
	private int numero_columnas;

	public Sala(int filas, int columnas) {
		numero_filas = filas;
		numero_columnas = columnas;
	}

	public void InicializarSala(Boolean esCovid, int numero_separacion) {

		modo_covid = esCovid;
		asientos = new Butaca2[numero_filas][numero_columnas];
		int contador = 0;

		// modo_normal
		for (int i = 0; i < numero_filas; i++) {
			for (int j = 0; j < numero_columnas; j++) {
				Butaca2 butaca = new Butaca2();
				asientos[i][j] = butaca;

				if (modo_covid) {
					if (contador < numero_separacion)
						contador++;
					else {
						butaca.setButacaBloqueada(true);
						contador = 0;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		String devolver = "";
		Butaca2 butaca = new Butaca2();

		for (int i = 0; i < numero_filas; i++) {
			for (int j = 0; j < numero_columnas; j++) {
				butaca = asientos[i][j];
				devolver += butaca.toString() + " ";
			}
			devolver += "\n";
		}
		return devolver;
	}

	public boolean OcuparAsiento(int fila, int columna) {

		Butaca2 butaca;
		butaca = asientos[fila][columna];
		if (butaca.getButacaLibre() && !butaca.getButacaBloqueada()) {
			butaca.setButacaBloqueada(true);
			return true;
		} else
			return false;
	}

	public void LiberarEspacio(int fila, int columna) {

		Butaca2 butaca;
		butaca = asientos[fila][columna];
		if (butaca.getButacaLibre() && butaca.getButacaBloqueada()) {
			butaca.setButacaBloqueada(false);
		}
	}

	public void OcuparAsientos(int numero) {
		Butaca2 butaca;
		int inicio = 0;
		int inicio2 = 0;
		int contador = 0;
		int ultima_fila_ocupada = 0;
		int ultima_columna_ocupada = 0;

//		for (int i = 0; i < numero_filas; i++) {
//			for (int j = 0; j < numero_columnas; j++) {
//				if (contador < numero) {
//					if (OcuparAsiento(i, j)) {
//						ultima_fila_ocupada = i;
//						ultima_columna_ocupada = j;
//						contador++;
//					}
//				}
//				ultima_columna_ocupada++;
//				if(modo_covid && ultima_columna_ocupada < numero_columnas) {
//					
//					if(asientos[ultima_fila_ocupada][ultima_columna_ocupada].getButacaLibre()) {
//						asientos[ultima_fila_ocupada][ultima_columna_ocupada].setButacaBloqueada(true);
//					}
//				}
//			}
//		}
		while(inicio < numero_filas && contador < numero) {
			while(inicio2 < numero_columnas && contador < numero) {
				
				if (contador < numero) {
					if (OcuparAsiento(inicio, inicio2)) {
						ultima_fila_ocupada = inicio;
						ultima_columna_ocupada = inicio2;
						contador++;
					}
				}
				ultima_columna_ocupada++;
				if(modo_covid && ultima_columna_ocupada < numero_columnas) {
					
					if(asientos[ultima_fila_ocupada][ultima_columna_ocupada].getButacaLibre()) {
						asientos[ultima_fila_ocupada][ultima_columna_ocupada].setButacaBloqueada(true);
					}
				}
				}
			inicio2++;
				}
			inicio++;
	}
}
	

