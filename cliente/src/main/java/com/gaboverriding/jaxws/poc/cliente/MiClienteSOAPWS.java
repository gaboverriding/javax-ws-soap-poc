package com.gaboverriding.jaxws.poc.cliente;

import com.gaboverriding.jaxws.poc.services.Operaciones;
import com.gaboverriding.jaxws.poc.services.OperacionesServiceImpl;
import com.gaboverriding.jaxws.poc.services.OperacionesServiceImplService;

public class MiClienteSOAPWS {

    public static void main (String[] args) {
        OperacionesServiceImpl soapWS = new OperacionesServiceImplService().getOperacionesServiceImplPort();
        Operaciones respuestaWS = soapWS.getMensaje();
        System.out.println(respuestaWS.getSCadena());
    }
}
