package com.gaboverriding.jaxws.poc.services;

import com.gaboverriding.jaxws.poc.domain.Operaciones;

import javax.jws.WebService;

@WebService
public class OperacionesServiceImpl implements OperacionesService {

    public Operaciones getMensaje() {
        System.out.println("Se ha invocado el metodo getMensaje del SOAP WebService");
        return new Operaciones("probando WebService SOAP");
    }
}
