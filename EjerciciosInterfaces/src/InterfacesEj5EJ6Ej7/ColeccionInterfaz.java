package InterfacesEj5EJ6Ej7;

public interface ColeccionInterfaz {

	boolean	estaVacia(); //devuelve true si la colección está vacía y false en caso contrario.
	Object	extraer(); //devuelve y elimina el primer elemento de la colección.
	Object	primero(); //devuelve el primer elemento de la colección.
	boolean	añadir(Object obj); //añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.

}
