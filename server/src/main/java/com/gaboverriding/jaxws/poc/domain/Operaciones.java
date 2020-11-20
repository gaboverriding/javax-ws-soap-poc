package com.gaboverriding.jaxws.poc.domain;

public class Operaciones {

    private String sCadena;

    public Operaciones(String sCadena) {
        this.sCadena = sCadena;
    }

    public String getsCadena() {
        return sCadena;
    }

    public void setsCadena(String sCadena) {
        this.sCadena = sCadena;
    }

    @Override
    public String toString() {
        return "Operaciones{" +
                "sCadena='" + sCadena + '\'' +
                '}';
    }
}
