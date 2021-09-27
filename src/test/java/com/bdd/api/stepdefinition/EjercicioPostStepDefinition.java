package com.bdd.api.stepdefinition;

import com.bdd.api.step.EjercicioGetStep;
import com.bdd.api.step.EjercicioPostStep;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class EjercicioPostStepDefinition {

    private Scenario scenario;

    @Before
    public void before(Scenario scenario) { this.scenario = scenario;}

    @Steps
    private EjercicioPostStep ejercicioPostStep;

    @Dado("^que se configuran los headers$")
    public void queSeConfiguranLosHeaders(DataTable dataTable) {
        ejercicioPostStep.queSeConfiguranLosHeaders(dataTable);
    }

    @Y("^configurar el body$")
    public void configurarElBody(DataTable dataTable) {
        ejercicioPostStep.configurarElBody(dataTable);
    }

    @Cuando("^se ejecuta el servicio con la configuracion del header$")
    public void seEjecutaElServicioConLaConfiguracionDelHeader(DataTable dataTable) {
        ejercicioPostStep.seEjecutaElServicioConLaConfiguracionDelHeader(dataTable);
    }

    @Entonces("^verificar que el codigo de respuesta sea el numero \"([^\"]*)\"$")
    public void verificarQueElCodigoDeRespuestaSeaElNumero(int respuestaCode) {
        ejercicioPostStep.verificarQueElCodigoDeRespuestaSeaElNumero(respuestaCode);
    }

    @Y("^guardar la respuesta de la ejecucion del servicio$")
    public void guardarLaRespuestaDeLaEjecucionDelServicio() throws IOException{
        ejercicioPostStep.guardarLaRespuestaDeLaEjecucionDelServicio();
    }
}
