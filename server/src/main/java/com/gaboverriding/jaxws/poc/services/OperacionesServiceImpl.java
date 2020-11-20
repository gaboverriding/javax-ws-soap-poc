package com.gaboverriding.jaxws.poc.services;

import com.gaboverriding.jaxws.poc.domain.Operaciones;

import javax.jws.WebService;

@WebService
public class OperacionesServiceImpl implements OperacionesService {

    public Operaciones getMensaje() {
        return new Operaciones("probando WebService SOAP");
    }
}
