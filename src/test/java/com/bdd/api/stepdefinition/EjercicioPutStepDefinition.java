package com.bdd.api.stepdefinition;

import com.bdd.api.step.EjercicioPostStep;
import com.bdd.api.step.EjercicioPutStep;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import javax.xml.crypto.Data;
import java.io.IOException;

public class EjercicioPutStepDefinition {

    private Scenario scenario;

    @Before
    public void before(Scenario scenario) { this.scenario = scenario;}

    @Steps
    private EjercicioPutStep ejercicioPutStep;

    @Dado("^que vamos a configurar los headers$")
    public void queVamosAConfigurarLosHeaders(DataTable dataTable) {
        ejercicioPutStep.queVamosAConfigurarLosHeaders(dataTable);
    }

    @Y("^configuramos el body$")
    public void configuramosElBody(DataTable dataTable) {
        ejercicioPutStep.configuramosElBody(dataTable);
    }

    @Cuando("^se ejecuta el servicio con configuracion de los headers$")
    public void seEjecutaElServicioConConfiguracionDeLosHeaders(DataTable dataTable) {
        ejercicioPutStep.seEjecutaElServicioConConfiguracionDeLosHeaders(dataTable);
    }

    @Entonces("^verificamos que el codigo de respuesta muestre el numero \"([^\"]*)\"$")
    public void verificamosQueElCodigoDeRespuestaMuestreElNumero(int respuestaCode) {
        ejercicioPutStep.verificamosQueElCodigoDeRespuestaMuestreElNumero(respuestaCode);
    }

    @Y("^guardamos la respuesta de la ejecucion del servicio$")
    public void guardamosLaRespuestaDeLaEjecucionDelServicio() throws IOException {
        ejercicioPutStep.guardamosLaRespuestaDeLaEjecucionDelServicio();
    }
}
