package com.bdd.api.step;

import com.bdd.generic.ServiceDOM;
import cucumber.api.DataTable;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EjercicioGetStep extends ServiceDOM {

    private Headers cabecera;
    private Response response;
    private String servicio;
    private String formato;

    @Step("Configurando los headers del servicio...")
    public void queConfiguroLosHeaders(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        cabecera = configurarCabeceras(list);
    }

    @Step("Ejecutando el servicio con la configuración de los headers...")
    public void seEjecutaElServicioConLaConfiguracionDeLosHeaders(DataTable dataTable) {
        SerenityRest.useRelaxedHTTPSValidation();
        servicio = getValueFromDataTable(dataTable, "servicio");
        String url = getValueFromDataTable(dataTable, "url");
        String metodo = getValueFromDataTable(dataTable, "metodo");
        formato = getValueFromDataTable(dataTable, "formato");

        response = ejecutarServicioConfigurandoCabeceraConBody (url, metodo, cabecera, null);
        System.out.println(response.prettyPrint());
    }

    @Step("Verificando que el código de respuesta sea 200...")
    public boolean verificamosQueElCodigoDeRespuestaSeaElNumero(int respuestaCode) {
        System.out.println(response.getStatusCode());
        return response.getStatusCode() == respuestaCode;
    }

    @Step("Guardando la respuesta de la ejecución del servicio...")
    public void seGuardaLaRespuestaDeLaEjecucionDelServicio() throws IOException {
        System.out.println("response:" + response.getBody().asString());
        createResponseFileByFormat(servicio, formato, response.getBody().prettyPrint());
    }
}
