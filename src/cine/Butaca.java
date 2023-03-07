package cine;

public class Butaca {

	public int numero;
	enum Ocupamiento {
		libre, ocupado, bloqueado
	}
	public Ocupamiento estado;
	Ocupamiento normal = Ocupamiento.libre;
	
	public Butaca(Ocupamiento estado, int numero) {
		this.estado = estado;
		this.numero = numero;
	}
	
	

	@Override
	public String toString() {
		String devolver = " ";
		if(estado == Ocupamiento.libre) {
			
			devolver = "libre";
		}
		if (estado == Ocupamiento.ocupado) {
			
			devolver = "Ocupado";
		}
		if(estado == Ocupamiento.bloqueado) {
			
			devolver = "bloqueado";
		}
		return "Butaca " + numero + "[estado=" + devolver + "]";
	}
	
	
}
