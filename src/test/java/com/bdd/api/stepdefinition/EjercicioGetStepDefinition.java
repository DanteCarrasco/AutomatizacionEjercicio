package com.bdd.api.stepdefinition;

import com.bdd.api.step.EjercicioGetStep;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class EjercicioGetStepDefinition {

    private Scenario scenario;

    @Before
    public void before(Scenario scenario) { this.scenario = scenario; }

    @Steps
    private EjercicioGetStep ejercicioGetStep;

    @Dado("^que configuramos los headers$")
    public void queConfiguroLosHeaders(DataTable dataTable) {
        ejercicioGetStep.queConfiguroLosHeaders(dataTable);
    }

    @Cuando("^se ejecuta el servicio con la configuracion de los headers$")
    public void seEjecutaElServicioConLaConfiguracionDeLosHeaders(DataTable dataTable){
        ejercicioGetStep.seEjecutaElServicioConLaConfiguracionDeLosHeaders(dataTable);
    }

    @Entonces("^verificamos que el codigo de respuesta sea el numero \"([^\"]*)\"$")
    public void verificamosQueElCodigoDeRespuestaSeaElNumero(int respuestaCode){
        ejercicioGetStep.verificamosQueElCodigoDeRespuestaSeaElNumero(respuestaCode);
    }

    @Y("^se guarda la respuesta de la ejecucion del servicio$")
    public void seGuardaLaRespuestaDeLaEjecucionDelServicio() throws IOException {
        ejercicioGetStep.seGuardaLaRespuestaDeLaEjecucionDelServicio();
    }
}
