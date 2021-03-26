package Ejercicio6;


import java.util.Calendar;

/**
 * Esta clase es para corroborar el estado contable de los socios mes a mes. Y configurar su estado
 * @author Nahuel
 *
 */
public class EstadoContable {
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private final String [] MESES = {"Enero.......","Febrero....","Marzo......","Abril......","Mayo.......","Junio......",
									 "Julio......","Agosto.....","Septiembre.","Octubre....","Noviembre..","Diciembre.."};
	private String [] estadoMeses;
	private String estadoCuotaAnual;
	private final String PAGADO = "Pagado";
	private final String ADEUDA = "Adeuda";
	private final String PROX_A_PAGAR = "Proximo a pagar";

	
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	public EstadoContable() {
		estadoMeses = new String[12];
		estadoCuotaAnual = ADEUDA;
		for(int i = 0; i < 12; i++) {
			estadoMeses[i] = PROX_A_PAGAR;
		}
	}
	
	/*---------------------------------------------
	 METODOS PARA IMPRIMIR TODO EL ESTADO CONTABLE
	 ---------------------------------------------*/
	public String imprimirEstadoContable() {
		StringBuilder builder = new StringBuilder();
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		builder.append("Año: "+year+"\n");
		builder.append("Cuota anual: "+estadoCuotaAnual+"\n\n");
		for(int i = 0; i < 12; i++) {
			builder.append(MESES[i]+" : "+estadoMeses[i]+"\n");
		}
		return builder.toString();
	}
	
	/*---------------------------------------------
	 METODOS CONFIGURAR ESTADOS CONTABLES DE UN MES DETERMINADO
	 ---------------------------------------------*/
	public void pagar(int numMes) {
		estadoMeses[numMes - 1] = PAGADO;
	}
	
	
	public void adeudar(int numMes) {
		estadoMeses[numMes - 1] = ADEUDA;
	}

	public void proxAPagar(int numMes) {
		estadoMeses[numMes - 1] = PROX_A_PAGAR;
	}

	public void pagarCuotaAnual() {
		estadoCuotaAnual = PAGADO;
	}

	
}
