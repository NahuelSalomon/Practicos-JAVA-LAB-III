package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		/*
		 public abstract class A
		{
		  public abstract void dinamica();
		  public void estatica()
		  {
		    System.out.println( "Método estático de la clase A");
		  }
		}
		
		public class B extends A
		{
		  public void dinamica()
		  {
		    System.out.println( "Método dinámico de clase B");
		  }
		}
		
		public class C extends A
		{
		  public void dinamica()
		  {
		    System.out.println( "Método dinámico de clase C");
		  }
		}
		
		public class Ligadura
		{
		  static public void main(String [] args)
		  {
		    A a;
		    B b = new B();
		    C c = new C();
		    System.out.print( "Métodos llamados con objeto b desde");
		    System.out.println("referencia de la clase A");
		    a = b;
		    a.dinamica();
		    a.estatica();
		    System.out.print( "Métodos llamados con objeto c desde");
		    System.out.println(" referencia de la clase A");
		    a = c;
		    a.dinamica();
		    a.estatica();
		
		¿Cual es la salida por pantalla?*/
		/**
		 * La salida por pantalla seria la siguiente:
		   1)Metodo dinamico de la clase B.
		   2)Metodo estatico de la clase A.
		   
		   3)Metodo dinamico de la clase C.
		   4)Metodo dinamico de la clase A.
		 
		   En las dos primeras lineas 'a' toma la referencia de b y se guarda 'b' en 'a', 
		   entonces los metodos a los que va a acceder la variable 'a' van a ser a los
		   valores de a. En la linea 1) se ejecuta el de tipo dinamico y en la segunda linea
		   tambien se ejecuta del tipo dinamico pero como b no tiene el metodo "estatica" entonces
		   hace el camino de migas y se va al del padre.
		   
		   Ocurre de la misma forma en la tercera y cuarta linea pero esta vez 'a' toma
		   la referencia de 'c'.
		 */
		 
		 
	}

}
