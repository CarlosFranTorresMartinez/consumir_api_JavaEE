package model;

import java.io.Serializable;

public class Persona implements Serializable {

    private String NOMBRE;
    private String APELLIDOP;
    private String APELLIDOM;
    private int DNI;

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOP() {
        return APELLIDOP;
    }

    public void setAPELLIDOP(String APELLIDOP) {
        this.APELLIDOP = APELLIDOP;
    }

    public String getAPELLIDOM() {
        return APELLIDOM;
    }

    public void setAPELLIDOM(String APELLIDOM) {
        this.APELLIDOM = APELLIDOM;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
