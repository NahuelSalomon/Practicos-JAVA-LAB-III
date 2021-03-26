package dome;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Clase Main. Hay un swicht, con opcion de entrar al formato DVD o al CD.
 * Se inicializa la biblioca con los constructores llenos para no llenar datos.
 * NOTA: La busqueda por genero y por titulo permite visualizar los elementos en papelera tambien
 * @author Nahuel
 *
 */
public class Main {
 
    public static void main(String[] args)
    {
        /**
         * Se declara los ArrayList y se le agregan cds y dvds.
         */
    	ArrayList <CD> cds = new ArrayList<CD>();
        ArrayList <DVD> dvds = new ArrayList<DVD>();
        
        CD auxCd = new CD("Oktubre",41,true,"Lo mejor del rock nacional",
        				   "Rock",1986,"Los Redondos",9);
        
        CD auxCd2 = new CD("8 mile",85,true,"Rap en ingles","Rap",2005,
				           "Eminem ",16);
        
        DVD auxDvd = new DVD("Guason",158,true,"Atrapante","Policial,Drama",2019,"Todd Phillips",
        		   "Payaso fracasa como comediante y toma represarias","Joaquin Poenix, Robert De Niro");
        
        DVD auxDvd2 = new DVD("Cars 3",109,true,"Copa piston","Animacion",2017,"Brian Free",
     		   "Rayo McQueen se pone viejo y quiere revancha","Rayo McQueen y sus amigos, Robert De Niro");
        
        cds.add(auxCd);
        cds.add(auxCd2);
        dvds.add(auxDvd);
        dvds.add(auxDvd2);
        
    	Biblioteca biblio = new Biblioteca(cds,dvds); 
        
    	boolean mander = true;
        int op;
        
        /**
         * Se realiza un swiech para acceder a alguno de los dos fomatos.
         */
        while(mander) {
        	op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su biblioteca"
        			+"\n1. Acceder al formato CD\n2. Acceder al formato DVD\n3. Salir"));
        
        	switch(op) {
        	case 1:
        		switchCD(biblio);
        		break;
        		
        	case 2:
        		switchDVD(biblio);
        		break;
        	
        	case 3:
        		mander = false;
        		break;
        	default:
        		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        		break;
        	}
        }
    }

	
    /** 
     * switch para cd. Para acceder a las distintas funcionalidades de CD.
     * @see case 2,5,6. Se hace una pequeña logica para comprobar existencia de informacion.
     * @param biblio es la biblioteca en la cual se va a operar con el cd.
     */
    public static void switchCD(Biblioteca biblio) {
		
		 
		boolean mander = true;
		int op;
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a CD'S"
		 		 +"\n1. Agregar un nuevo Cd\n2. Eliminar un cd\n3. Imprimir listado de cds"
		 		 +"\n4. Papelera"+"\n5. Buscar por titulo\n6. Buscar por genero\n7. Volver atras"));
			
			switch(op) {
			case 1: CD unCd = new CD();
					
					String titulo = JOptionPane.showInputDialog("Ingrese el titulo");
					unCd.setTitulo(titulo);
					
					int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio de lanzamiento"));
					unCd.setAño(año);
					
					String genero = JOptionPane.showInputDialog("Ingrese el genero");
					unCd.setGenero(genero);
					
					int cantidadDeTemas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de temas"));
					unCd.setCantidadDeTemas(cantidadDeTemas);
					
					int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion"));
					unCd.setDuracion(duracion);
					
					String integrantes = JOptionPane.showInputDialog("Ingrese los integrantes de la banda");
					unCd.setIntegrantes(integrantes);
					
					String comentario = JOptionPane.showInputDialog("Puede dejar un comentario");
					unCd.setComentario(comentario);
					
					unCd.setLoTengo(true);
					
					biblio.agregarCD(unCd);
					break;
			
			case 2: String tituloAEliminar = JOptionPane.showInputDialog("Ingrese el titulo del CD que desea eliminar: ");
					if(biblio.existeCDPorTitulo(tituloAEliminar) != -1) biblio.eliminarCD(tituloAEliminar);
					else JOptionPane.showMessageDialog(null, "El cd que desea eliminar no existe");
					break;
			
			case 3: JOptionPane.showMessageDialog(null,biblio.listarCD(true));
					break;
				
			case 4: swichtPapeleraCD(biblio);
					break;
			
			case 5: String tituloABuscar = JOptionPane.showInputDialog("Ingrese el titulo para buscar el CD: ");
					int pos = biblio.existeCDPorTitulo(tituloABuscar);
					if(pos != -1) JOptionPane.showMessageDialog(null, biblio.buscarCDPorTitulo(tituloABuscar).imprimir());
					else JOptionPane.showMessageDialog(null,"El cd "+tituloABuscar+ " no existe");
					break;
					
			case 6: String genero2 = JOptionPane.showInputDialog("Ingrese el genero para buscar el CD: ");
					if(biblio.existeCDPorGenero(genero2)) JOptionPane.showMessageDialog(null, biblio.buscarCDPorGenero(genero2));
					else JOptionPane.showMessageDialog(null,"No hay ningun cd del genero "+genero2);
					break;
					
			case 7: mander = false;
					break;
			
			default:
        		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        		break;
			}
		}
	}

	
    /** 
     * switch para dvd. Para acceder a las distintas funcionalidades de dvd.
     * @see case 2,5,7 se hace una pequeña logica para comprobar existencia de informacion.
     * @param biblio es la biblioteca en la cual se va a operar con el cd.
     */
	public static void switchDVD(Biblioteca biblio) {
		boolean mander = true;
		int op;
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a DVD'S"
		 		 +"\n1. Agregar un nuevo dvd\n2. Eliminar un dvd\n3. Imprimir listado de dvd's"
		 		 +"\n4. Papelera"+"\n5. Buscar por titulo\n6. Buscar por genero\n7. Volver atras"));
			
			switch(op) {
			case 1: DVD unDvd = new DVD();
					
					String titulo = JOptionPane.showInputDialog("Ingrese el titulo: ");
					unDvd.setTitulo(titulo);
					
					String director = JOptionPane.showInputDialog("Ingrese el director: ");
					unDvd.setDirector(director);
					
					int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio de lanzamiento: "));
					unDvd.setAño(año);
					
					String sinopsis = JOptionPane.showInputDialog("Ingrese la sinopsis: ");
					unDvd.setSinopsis(sinopsis);
					
					int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion: "));
					unDvd.setDuracion(duracion);
					
					String reparto = JOptionPane.showInputDialog("Ingrese los actores de la pelicula: ");
					unDvd.setReparto(reparto);
					
					String genero = JOptionPane.showInputDialog("Ingrese el genero de la pelicula: ");
					unDvd.setGenero(genero);
					
					String comentario = JOptionPane.showInputDialog("Puede dejar un comentario: ");
					unDvd.setComentario(comentario);
					
					unDvd.setLoTengo(true);
				
					biblio.agregarDVD(unDvd);
					break;
			
			case 2: String tituloAEliminar = JOptionPane.showInputDialog("Ingrese el titulo del CD que desea eliminar: ");
					if(biblio.existeDVDPorTitulo(tituloAEliminar) != -1)biblio.eliminarDVD(tituloAEliminar);
					else JOptionPane.showMessageDialog(null, "El dvd que desea eliminar no existe");
					break;
			
			case 3: JOptionPane.showMessageDialog(null,biblio.listarDVD(true));
					break;
			
			case 4: swichtPapeleraDVD(biblio);
					break;
					
			case 5: String tituloABuscar = JOptionPane.showInputDialog("Ingrese el titulo para buscar el DVD: ");
					int pos = biblio.existeDVDPorTitulo(tituloABuscar);
					if(pos != -1)JOptionPane.showMessageDialog(null, biblio.buscarDVDPorTitulo(tituloABuscar).imprimir());
					else JOptionPane.showMessageDialog(null, "El cd "+tituloABuscar+"no existe");
					break;
					
			case 6: String genero2 = JOptionPane.showInputDialog("Ingrese el genero para buscar el DVD: ");
					if(biblio.existeDVDPorGenero(genero2)) JOptionPane.showMessageDialog(null, biblio.buscarDVDPorGenero(genero2));
					else JOptionPane.showMessageDialog(null,"No hay ningun dvd del genero "+genero2);
					break;
					
			case 7: mander = false;
					break;
			
			default:
        		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        		break;
			}	
		}
	}
	
	
	/**
	 * switchPapeleraCD se utiliza para acceder a un submenu en el cual
	   se puede trabajar y manipular informacion que el usuario haya desidido eliminar.
	 * @see case 2,3 se hace una pequeña logica para comprobar existencia de informacion.  
	 * @param biblio es en la biblioteca en la que se trabaja
	 */
	public static void swichtPapeleraCD(Biblioteca biblio) {
		boolean mander = true;
        int op;
        
        while(mander) {
        	op = Integer.parseInt(JOptionPane.showInputDialog("Papelera CD"
        			+"\n1. Ver listado de papelera\n2. Eleminar un CD definitivamente"
        			+ "\n3. Recuperar un CD\n4. Volver atras"));
        	String titulo;
        	switch(op) {
        	case 1:
        		JOptionPane.showMessageDialog(null, biblio.listarCD(false));
        		break;
        	case 2:
        		titulo = JOptionPane.showInputDialog("Ingrese el titulo del cd que desea eliminar definitivamente: ");
        		if(biblio.existeCDPorTitulo(titulo) != -1)biblio.eliminarCDdefinitivo(titulo);
        		else JOptionPane.showMessageDialog(null,"El cd que desea eliminar no se encuentra en su papelera");
        		break;
        		
        	case 3:
        		titulo = JOptionPane.showInputDialog("Ingrese el titulo del cd que desea recuperar: ");
        		if(biblio.existeCDPorTitulo(titulo) != -1)biblio.buscarCDPorTitulo(titulo).cambiarEstado(false);
        		else JOptionPane.showMessageDialog(null, "El cd que desea recuperar no se encuentra en su papelera");
        		break;     	
        	case 4:
        		mander = false;
        		break;
        	default:
        		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        		break;
        	}
        }
	}
	
	/**
	 * switchPapeleraDVD se utiliza para acceder a un submenu en el cual
	   se puede trabajar y manipular informacion que el usuario haya desidido eliminar.
	 * @see case 2,3 se hace una pequeña logica para comprobar existecia de informacion.  
	 * @param biblio es en la biblioteca en la que se trabaja
	 */
	public static void swichtPapeleraDVD(Biblioteca biblio) {
		boolean mander = true;
        int op;
        
        while(mander) {
        	op = Integer.parseInt(JOptionPane.showInputDialog("Papelera DVD"
        			+"\n1. Ver listado de papelera\n2. Eleminar un DVD definitivamente"
        			+ "\n3. Recuperar un DVD\n4. Volver atras"));
        	String titulo;
        	switch(op) {
        	case 1:
        		JOptionPane.showMessageDialog(null, biblio.listarDVD(false));
        		break;
        	case 2:
        		titulo = JOptionPane.showInputDialog("Ingrese el titulo del dvd que desea eliminar definitivamente: ");
        		if(biblio.existeDVDPorTitulo(titulo) != -1)biblio.eliminarDVDdefinitivo(titulo);
        		else JOptionPane.showMessageDialog(null, "El dvd que desea eliminar no se encuentra en su papelera");
        		break;
        		
        	case 3:
        		titulo = JOptionPane.showInputDialog("Ingrese el titulo del dvd que desea recuperar: ");
        		if(biblio.existeDVDPorTitulo(titulo) != -1)biblio.buscarDVDPorTitulo(titulo).cambiarEstado(false);
        		else JOptionPane.showMessageDialog(null, "El dvd que desea recuperar no se encuentra en su papelera");
        		break;     	
        	
        	case 4:
        		mander = false;
        		break;
        	default:
        		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        		break;
        	}
        }
	}
}