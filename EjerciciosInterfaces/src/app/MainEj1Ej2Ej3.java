package app;
 
import java.util.ArrayList;

import InterfacesEj1Ej2Ej3.Estadisticas;
import InterfacesEj1Ej2Ej3.InterfaceEdificio;
import InterfacesEj1Ej2Ej3.InterfaceInstalacionDeportiva;
import clasesEj1Ej2Ej3.ArrayReales;
import clasesEj1Ej2Ej3.EstadioBasquet;
import clasesEj1Ej2Ej3.EstadioFutbol;
import clasesEj1Ej2Ej3.Matematicas;
import clasesEj1Ej2Ej3.Numero;
import clasesEj1Ej2Ej3.Pentagono;
 
public class MainEj1Ej2Ej3 {
 
    public static void main(String[] args)
    {
    
    
    	/*
         * main, crear un ArrayList que contenga tres polideportivos y dos edificios de oficinas,
         * recorrer la colección y mostrar los atributos de cada elemento.

         */
   
    /*ArrayList<InterfaceInstalacionDeportiva>arrayList=new ArrayList<InterfaceInstalacionDeportiva>();
    ArrayList<InterfaceEdificio>edificios=new ArrayList<InterfaceEdificio>();
   
    EstadioFutbol estadioFutbolAmalfitani = new EstadioFutbol();
    EstadioBasquet estadioBasquetBombonerita = new EstadioBasquet();
    EstadioFutbol estadioFutbolCilindroAvellaneda = new EstadioFutbol();
    Pentagono cia = new Pentagono();
   
    arrayList.add(estadioFutbolCilindroAvellaneda);
    arrayList.add(estadioBasquetBombonerita);
    arrayList.add(estadioFutbolAmalfitani);
   
    edificios.add(estadioFutbolCilindroAvellaneda);
    edificios.add(estadioBasquetBombonerita);
    edificios.add(estadioFutbolAmalfitani);
    edificios.add(cia);
   
    for (InterfaceInstalacionDeportiva instalacionDeportiva : arrayList)
    {
        System.out.println(instalacionDeportiva.getTipoDeInstalacion());
    }

    for (InterfaceEdificio temp : edificios)
    {
        System.out.println(temp.getSuperficieEdificio());
    }*/
   
    	//EJERCICIO 1:
    	System.out.println("EJERCICIO 1");
    	ArrayReales reales = new ArrayReales();
    	reales.addNumeros(2.5,3.5, -8, 4.66, 256.2);
    	
    	System.out.println("Maximo....: "+reales.maximo());
    	System.out.println("Minimo....: "+reales.minimo());
    	System.out.println("Sumatoria.: "+reales.sumatorio());
    	
    	
    //EJERCICIO 2:
    	System.out.println("\n\n\nEJERCICIO 2");
    	Matematicas mate = new Matematicas();
    	
    	mate.agregarCantidadDeNumeros(10, 1000);
    	mate.mostrarNumeros();
    	System.out.println("\nEl inicio es: "+mate.inicio());
    	System.out.println("El fin es: "+mate.fin());
    
    
    //EJERCICIO 3
    	System.out.println("\n\n\nEJERCICIO 3");
    	Numero num1 = new Numero(88);
    	Numero num2 = new Numero(55);
    	
    	System.out.println("num1: "+num1.devolverNumero());
    	System.out.println("num2: "+num2.devolverNumero());
    	
    	boolean esMenor = num1.esMenor(num2);
    	boolean esMayor = num1.esMayor(num2);
    	boolean esIgual = num1.esIgual(num2);
    	
    	System.out.println(	num1.devolverNumero()+" es menor que "+num2.devolverNumero()+" : "+esMenor+"\n"+
    						num1.devolverNumero()+" es mayor que "+num2.devolverNumero()+" : "+esMayor+"\n"+
    						num1.devolverNumero()+" es igual que "+num2.devolverNumero()+" : "+esIgual );  
    	
    }


}
 

