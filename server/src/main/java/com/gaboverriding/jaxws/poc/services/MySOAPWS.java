package com.gaboverriding.jaxws.poc.services;

import javax.xml.ws.Endpoint;

public class MySOAPWS {
    public static void main (String[] args) {
        Endpoint.publish("http://localhost:8080/mysoapws/mensaje",
                new OperacionesServiceImpl());
    }

}
