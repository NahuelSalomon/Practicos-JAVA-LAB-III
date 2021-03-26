package Ejercicio3TestFlujo;

public class Main {

	public static void main(String[] args) {
		
		/*******************************
		 * PRIMERO
		 *******************************/
		
		/*
		 * abstract class Flujo {

    	   abstract public void escribe(char c);

		    public void escribe(String s) {
		        for (int i = 0; i < s.length(); i++) {
		            System.out.println("Escribe de Flujo ....");
		            escribe(s.charAt(i));
		        }
		    }

		    public void escribe(int i) {
		        escribe("" + i);
		    }
		}

		class Disco extends Flujo {
		
		    public void escribe(char c) {
		        System.out.println("Escribe de disco " + c); 
		    }
		}

		class DiscoFlexible extends Disco {
		
		    public void escribe(String s) {
		        System.out.println("Escribe de Disco Flexible...");
		        super.escribe(s);
		    }
		}

		public class TestFlujo {
		
		    public static void main(String a[]) {
		        DiscoFlexible dc = new DiscoFlexible();
		        Flujo f = dc;
		        f.escribe("ab");
		    }
		}
		 */
		/**
		 * /**
		   Lo que mostraria por patalla seria 
		   Escribe de Disco Flexible
		   Escribe de Flujo
		   a
		   Escribe de Flujo
		   b
		 */
		 
		
		
		/*******************************
		 * SEGUNDO
		 *******************************/
	     /*abstract class A {

	    	    int i;

	    	    A(int i) {
	    	        this.i = i;
	    	    }
	    	}

	    	class B extends A {

	    	    void metodo() {
	    	        System.out.println(i);
	    	    }
	    	}

	    	class Cuestion {

	    	    public static void main(String[] args) {
	    	        A[] v = new A[10];
	    	        for (int i = 0; i < 10; i++) {
	    	            v[i] = new B();
	    	            v[i].metodo();
	    	        }

	 */
	/**
	 * El primer error es el de "A[] v = new A[10]" ya que esta instanciando la clase 'A'
	   y esto no se puede hacer ya que es abstracta.
	 * El segundo error es el de " v[i].metodo()" ya que quiere imprimir el atributo 'i' de
	   la clase 'A' sin asignarle un valor. Considerando que el atributo 'i' seria publico por default.
	    
	 */
	
	}

}
