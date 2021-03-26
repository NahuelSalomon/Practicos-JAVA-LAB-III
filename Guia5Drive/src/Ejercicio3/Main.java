package Ejercicio3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	
	
	public static void main(String[] args) {
		/**********************************
		  HECHO CON ARREGLOS
		 **********************************/
		
		System.out.println("-------------ARREGLOS-------------");
		Electrodomestico [] electrodomesticos = new Electrodomestico [10];
		double precioFinal = 0;
		double precio;
			
		electrodomesticos[0] = new Television(500,"Negro",'B',50,28,true);
		electrodomesticos[1] = new Lavadora(650, "Rojo", 'D', 80, 35);
		electrodomesticos[2] = new Television(300,"Negro",'B',60,48,false);
		electrodomesticos[3] = new Television(500,"Blanco",'B',50,30,true);
		electrodomesticos[4] = new Lavadora(650, "Blanco", 'D', 80, 35);
		electrodomesticos[5] = new Television(500,"Rojo",'B',50,20,false);
		electrodomesticos[6] = new Lavadora(650, "Azul", 'D', 80, 35);
		electrodomesticos[7] = new Television(500,"Gris",'B',50,50,true);
		electrodomesticos[8] = new Lavadora(650, "Gris", 'D', 80, 35);
		electrodomesticos[9] = new Television(500,"Nose",'B',50,60,false);
	
		for(int i = 0; i < electrodomesticos.length; i++) {
			
			if(electrodomesticos[i] instanceof Television) {
				Television tele = (Television) electrodomesticos[i];
				precio = tele.precioFinal();
				System.out.println("Television.."+(i + 1)+" : "+precio);
				precioFinal += precio;
			}
			
			if(electrodomesticos[i] instanceof Lavadora) {
				Lavadora lava = (Lavadora) electrodomesticos[i];
				precio = lava.precioFinal();
				System.out.println("Lavadora...."+(i + 1)+" : "+precio);
				precioFinal += precio; 
			}
		}
			
		System.out.println("\nPrecio total: "+precioFinal);	
	
		/**********************************
		  HECHO CON HASHMAP
		 **********************************/
		
		System.out.println("\n\n-------------MAPAS-------------");
		HashMap<Integer, Electrodomestico> electrodomesticos1 = new HashMap<Integer, Electrodomestico>();
		int clave = 0;
		double precioTotalMapas = 0;
		double precioUnidad;
		
		for(Electrodomestico electro : electrodomesticos) {
			electrodomesticos1.put(clave, electro);
			clave++;
		}
		
		for(Entry<Integer, Electrodomestico> entry : electrodomesticos1.entrySet()) {
			if(entry.getValue() instanceof Television) {
				precioUnidad = entry.getValue().precioFinal();
				System.out.println("Television..: "+precioUnidad);
				precioTotalMapas += precioUnidad;
			}
			if(entry.getValue() instanceof Lavadora) {
				precioUnidad = entry.getValue().precioFinal();
				System.out.println("Lavadora....: "+precioUnidad);
				precioTotalMapas += precioUnidad;
			}
		}
	
		System.out.println("\nPrecio total: "+precioTotalMapas);
	
	}

}
