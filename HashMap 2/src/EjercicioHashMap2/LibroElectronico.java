package EjercicioHashMap2;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;


public class LibroElectronico extends Libro implements Serializable {
	
	/***********************************************
    ATRIBUTOS
    ************************************************/
	private String formato;
	private int precioAdicional;
	
	/***********************************************
    METODOS
    ************************************************/
	
	public LibroElectronico(String titulo, String autor,String genero,String editorial,String idioma
			 ,int añoPublicacion,int CantidadHojas,String formato, int precioAdicional) {
		super(titulo, autor, genero ,editorial,idioma, añoPublicacion , CantidadHojas);
		this.formato = formato;
		this.precioAdicional = precioAdicional;
	}
	
	@Override
	public JSONObject toJSONObject() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Formato: ", getFormato());
		jsonObject.put("Precio: ", getPrecio());
		
		return jsonObject;
	}
	
	
	@Override
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public double getPrecio() {
		return 150 + precioAdicional;
	}
}
