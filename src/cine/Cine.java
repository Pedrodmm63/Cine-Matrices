package cine;

import cine.Butaca.Ocupamiento;

public class Cine {

	public static void main(String[] args) {

		int filas = 5;
		int columnas = 5;
		int contador1 = 3;
		Butaca[][] cine = new Butaca[filas][columnas];
		
		int contador = 1;
		for(int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				cine[i][j] = new Butaca(Ocupamiento.libre, contador++);
				System.out.print(cine[i][j] + " ");
			}
			System.out.println();
		}
	}

}
