package co.agenciaviajes.negocio;

import java.util.Date;

/**
 * Director Director que controla la creación paso a paso, solo cuando el Builder
 * ha terminado de construir el objeto lo recupera el Director
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class DirectorPlan {

    private PlanBuilder planBuilder;

    // Completar métodos
    public void construirPlan (){
        planBuilder.crearNuevoPlan();
        planBuilder.buildCliente();
        planBuilder.buildTransportes();
        planBuilder.buildAlojamiento();
        planBuilder.buildAlimentacion();
        planBuilder.buildSeguroHotelero();
        planBuilder.buildImpuestoTiquete();
        planBuilder.buildTours();
    }
    public Plan getPlan() {
        return planBuilder.getPlan();
    }

    public void setPlanBuilder(PlanBuilder planBuilder) {
        this.planBuilder = planBuilder;
    }
    
}
