package clasesEj1Ej2Ej3;

import InterfacesEj1Ej2Ej3.Relaciones;

public class Numero implements Relaciones{

	private int a;
	
	public Numero(int numero) {
		a = numero;
	}
	
	public int devolverNumero() {
		return a;
	}
	
	@Override
	public boolean esMayor(Object b) {
		boolean res = false;
		if(b instanceof Numero) {
			Numero aux = (Numero) b;
			if(a > aux.devolverNumero()) res = true;
			else res = false;
		}
		return res;
	}

	@Override
	public boolean esMenor(Object b) {
		boolean res = false;
		if(b instanceof Numero) {
			Numero aux = (Numero) b;
			if(a < aux.devolverNumero()) res = true;	
		}
		return res;
	}

	@Override
	public boolean esIgual(Object b) {
		boolean res = false;
		if(b instanceof Numero) {
			Numero aux = (Numero) b;
			if(a == aux.devolverNumero()) res = true;
			else res = false;
		}
		return res;
	}

}
