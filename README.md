# javax-ws-soap-poc
Prueba de Concepto JAX-WS

Servidor básico para WebService SOAP que regresa un mensaje
 
Generación de cliente:
 ``` $ wsimport -keep -verbose -s ./src/main/java -d ./bin/ http://localhost:8080/mysoapws/mensaje?wsdl ```
 
 Nota: el servidor debe estar arriba disponibilizando el WSDL para que se puedan generar los componmentes del cliente
 
 Pre-requisitos: OpenJDK 8
 
 Construcción de imagen: 
 ``` $ docker build -t gaboverriding/soap-webservice:1.5-SNAPSHOT . ```
 
 Ejecución de la imagen:
 ``` docker container run --publish 8080:8080 --name mi-soap-webservice gaboverriding/soap-webservice:1.5-SNAPSHOT```
  
 
 


