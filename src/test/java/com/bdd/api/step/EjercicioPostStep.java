package com.bdd.api.step;

import com.bdd.generic.ServiceDOM;
import cucumber.api.DataTable;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EjercicioPostStep extends ServiceDOM {

    private Headers cabecera;
    private JSONObject body;
    private String servicio;
    private String formato;
    private Response response;

    @Step("Configurando los headers del servicio...")
    public void queSeConfiguranLosHeaders(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        cabecera = configurarCabeceras(list);
    }

    @Step("Configurando el body...")
    public void configurarElBody(DataTable dataTable) {
        body = configuracionDelBody(dataTable);
        System.out.println(body);
    }

    @Step("Ejecutando el servicio con la configuración de los headers...")
    public void seEjecutaElServicioConLaConfiguracionDelHeader(DataTable dataTable) {
        SerenityRest.useRelaxedHTTPSValidation();
        servicio = getValueFromDataTable(dataTable, "servicio");
        String url = getValueFromDataTable(dataTable, "url");
        String metodo = getValueFromDataTable(dataTable, "metodo");
        formato = getValueFromDataTable(dataTable, "formato");

        response = ejecutarServicioConfigurandoCabeceraConBody(url, metodo, cabecera, body);
        System.out.println(response.prettyPrint());
    }

    @Step("Verificando que el código de respuesta sea 200...")
    public boolean verificarQueElCodigoDeRespuestaSeaElNumero(int respuestaCode) {
        System.out.println(response.getStatusCode());
        return response.getStatusCode() == respuestaCode;
    }

    @Step("Guardando la respuesta de la ejecución del servicio...")
    public void guardarLaRespuestaDeLaEjecucionDelServicio() throws IOException {
        System.out.println("response:" + response.getBody().asString());
        createResponseFileByFormat(servicio, formato, response.getBody().prettyPrint());
    }
}
