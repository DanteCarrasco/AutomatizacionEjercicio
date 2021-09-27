package com.bdd.generic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.*;
import cucumber.api.DataTable;
import gherkin.deps.com.google.gson.JsonParser;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import jdk.nashorn.internal.parser.JSONParser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;
//import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;
import org.openqa.selenium.json.Json;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ServiceDOM extends ScenarioSteps {

    public ServiceDOM() {}

    protected Headers configurarCabeceras(List<Map<String, String>> list) {
        List<Header> headerList = new LinkedList<>();
        Iterator var3 = list.iterator();
        while (var3.hasNext()) {
            Map<String, String> stringStringMap = (Map)var3.next();
            System.out.println(stringStringMap);
            Header header = new Header((String)stringStringMap.get("cabeceras"), (String) stringStringMap.get("valor"));
            System.out.println("Header: " + header);
            headerList.add(header);
        }
        return new Headers(headerList);
    }

    protected JSONObject configuracionDelBody(DataTable dataTable) throws JsonSyntaxException {
        String body = "{\n" +
                "    \"id\": " + getValueFromDataTable(dataTable, "id") + ",\n" +
                "    \"name\": " + getValueFromDataTable(dataTable, "name") + ",\n" +
                "    \"status\": " + getValueFromDataTable(dataTable, "status") + "\n" +
                "  }";
        JSONObject jsonObject = new JSONObject(body);
    return jsonObject;
    }

    protected Response ejecutarServicioConfigurandoCabeceraConBody(String url, String metodo, Headers cabecera, JSONObject body) {
        Response response;
        if (metodo.toUpperCase().hashCode()==70454){
            response = (Response) SerenityRest.given().headers(cabecera).when().get(url, new Object[0]);
        } else {
            if (metodo.toUpperCase().hashCode()==2461856){
                response = (Response) SerenityRest.given().headers(cabecera).contentType(ContentType.JSON).body(body).when().post(url, new Object[0]);
            } else {
                response = (Response) SerenityRest.given().headers(cabecera).contentType(ContentType.JSON).body(body).when().put(url, new Object[0]);
            }
        }
        return response;
    }

    public static void createResponseFileByFormat(String serviceName, String formatFile, String response) throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS");
        LocalDateTime now = LocalDateTime.now();
        File filePath = new File("response/api/" + serviceName + "/"+ formatFile);
        filePath.mkdirs();
        String finalFileName = serviceName + "_" + dateTimeFormatter.format(now) + "." + formatFile;
        File file = new File(filePath + "/" + finalFileName);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(response);
        fileWriter.close();
    }

    public static String getValueFromDataTable(DataTable dataTable, String title) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        return (String) ((Map)list.get(0)).get(title);
    }
}
