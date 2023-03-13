package cine;

public class Butaca2 {

	private boolean butaca_libre;
	private boolean butaca_bloqueada;

	public Butaca2() {
		butaca_libre = true;
		butaca_bloqueada = false;
	}

	@Override
	public String toString() {
	if(butaca_bloqueada) return "x";
	else 
		if(butaca_libre) return "-";
		else return "a";
	}
	
	public void setButacaBloqueada(boolean si) {
		butaca_bloqueada = si;
	}
	public void setButacaOcupada() {
		butaca_libre = false;
	}
	public boolean getButacaLibre() {
		return butaca_libre;
	}
	public boolean getButacaBloqueada() {
		return butaca_bloqueada;
	}
}
