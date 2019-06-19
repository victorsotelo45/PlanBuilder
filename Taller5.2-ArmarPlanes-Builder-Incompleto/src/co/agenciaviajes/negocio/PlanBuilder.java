package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Abstract Builder
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public abstract class PlanBuilder {

    protected Plan plan;

    public void crearNuevoPlan() {
        plan = new Plan();
    }

    // Completar métodos
    
    public abstract void buildCliente();
    public abstract void buildTransportes();
    public abstract void buildAlojamiento();
    public abstract void buildAlimentacion();
    public abstract void buildSeguroHotelero();
    public abstract void buildImpuestoTiquete();
    public abstract void buildTours();
    
    //getters and getters

    public Plan getPlan() {
        return plan;
    }


}
