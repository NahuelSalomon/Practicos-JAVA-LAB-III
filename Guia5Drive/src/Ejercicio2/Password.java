package Ejercicio2;

import java.util.Random;

public class Password {
	int longitud;
	String contraseña;
	
	public Password() {
		this.longitud = 0;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}

	public String generarContraseña(int j) {
		char contra [] = new char[j];
		String pass = new String();
		char [] elementos = {'A','B','C','D','E','F','G','F','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9' 
				,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9'}; 
		for(int i = 0; i < contra.length; i++) {
			Random ra = new Random();	
			Integer pos = ra.nextInt(77);
			contra[i] = (char) elementos[pos]; 
		}
		pass = new String(contra);
		return pass;
	}
	
	
	/**
	 * esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2 mayúsculas, 
	 * más de 1 minúscula y más de 5 números.
	 * @return
	 */
	public boolean esFuerte() {
		boolean esFuerte = false;
		int cantidadMayus = cantidadMayus();
		int cantidadMinus = cantidadMinus();
		int cantidadNum = cantidadNum();
		
		if((cantidadMayus > 2) && (cantidadMinus > 1) && (cantidadNum > 5)) {
			esFuerte = true;
		}
		
		return esFuerte;
	}
	
	public int cantidadMayus() {
		int cantidad = 0;
		for(int i = 0; i < contraseña.length() ; i++) {
			Character e = contraseña.charAt(i);
			if (Character.isUpperCase(e)) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public int cantidadMinus() {
		int cantidad = 0;
		for(int i = 0; i < contraseña.length() ; i++) {
			Character e = contraseña.charAt(i);
			if (Character.isLowerCase(e)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int cantidadNum() {
		int cantidad = 0;
		for(int i = 0; i < contraseña.length() ; i++) {
			Character e = contraseña.charAt(i);
			if (Character.isDigit(e)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public String getContrasenia() {
		return contraseña;
	}

	public int gerLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
