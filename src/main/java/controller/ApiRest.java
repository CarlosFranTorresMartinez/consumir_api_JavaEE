package controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dao.PersonaD;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.Persona;
import services.Services;

/**
 *
 * @author ctmar
 */
@Named(value = "apiRest")
@RequestScoped
public class ApiRest {

    private Persona model = new Persona();
    private final PersonaD dao = new PersonaD();
    private final Services services = new Services();

    /**
     * Creates a new instance of ApiRest
     */
    public ApiRest() {
    }

    public void mostarDatos() throws IOException, InterruptedException {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(model.getDNI()));

        model.setNOMBRE(jsonObject.get("nombres").getAsString());
        model.setAPELLIDOP(jsonObject.get("apellido_paterno").getAsString());
        model.setAPELLIDOM(jsonObject.get("apellido_materno").getAsString());
        model.setDNI(jsonObject.get("dni").getAsInt());
    }

    public void respuesta() throws IOException, InterruptedException {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(model.getDNI()));

        model.setNOMBRE(jsonObject.get("nombres").getAsString());
        model.setAPELLIDOP(jsonObject.get("apellido_paterno").getAsString());
        model.setAPELLIDOM(jsonObject.get("apellido_materno").getAsString());
        model.setDNI(jsonObject.get("dni").getAsInt());

        System.out.println(model.getNOMBRE() + model.getAPELLIDOP() + model.getAPELLIDOM() + model.getDNI());

        dao.add(model);
    }

    public Persona getModel() {
        return model;
    }

    public void setModel(Persona model) {
        this.model = model;
    }

}
