package clasesEj1Ej2Ej3;
 
import InterfacesEj1Ej2Ej3.InterfaceEdificio;
import InterfacesEj1Ej2Ej3.InterfaceInstalacionDeportiva;
 
public class EstadioBasquet implements InterfaceInstalacionDeportiva,InterfaceEdificio{
 
    @Override
    public double getSuperficieEdificio() {
        
        return 2500;
    }
 
    @Override
    public int getTipoDeInstalacion()
    {
        return app.app.BASQUET;
    }

}