package clasesEj1Ej2Ej3;

import InterfacesEj1Ej2Ej3.InterfaceEdificio;
import InterfacesEj1Ej2Ej3.InterfaceInstalacionDeportiva;

public class EstadioFutbol implements InterfaceEdificio,InterfaceInstalacionDeportiva{

	@Override
	public int getTipoDeInstalacion() {

		return app.app.FUTBOL;
	}

	@Override
	public double getSuperficieEdificio() {
	
		return 2500;
	}

}
