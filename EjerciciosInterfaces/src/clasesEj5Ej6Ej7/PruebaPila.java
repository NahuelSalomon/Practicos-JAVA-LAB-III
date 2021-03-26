package clasesEj5Ej6Ej7;

import InterfacesEj5EJ6Ej7.ColeccionInterfaz;

public class PruebaPila {
	
    public void rellenar(ColeccionInterfaz obj) {
	obj.añadir(1);
	obj.añadir(2);
	obj.añadir(3);
	obj.añadir(4);
	obj.añadir(5);
	obj.añadir(6);
	obj.añadir(7);
	obj.añadir(8);
	obj.añadir(9);
	obj.añadir(10);
    
    } 
  	   
	public void imprimirYVaciar(ColeccionInterfaz obj) {
		while(!obj.estaVacia()) {
			System.out.print(" | "+obj.extraer());
	}
	} 
}
