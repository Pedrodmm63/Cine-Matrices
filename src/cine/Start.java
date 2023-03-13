package cine;

public class Start {

	public static void main(String[] args) {

		int numero_filas = 5;
		int numero_columnas = 5;
		boolean modo_covid = true;
		int numero_separacion = 3;
		
		Sala sala_cine = new Sala(numero_filas, numero_columnas);
		sala_cine.InicializarSala(modo_covid, numero_separacion);
		System.out.println(sala_cine.toString());
		sala_cine.OcuparAsiento(2,3);
		sala_cine.OcuparAsientos(3);
		System.out.println(sala_cine.toString());

	}

}
