#language: es

@Ejercicio
Característica: Ejercicio de Automatización metodo GET en APIs
  Como colaborador de Everis
  Quiero redactar y automatizar APIs
  Para recibir respuestas a las solicitudes enviadas

  @MetodoGET
  Escenario: Metodo GET a la API
    Dado que configuramos los headers
      | cabeceras     | valor        |
      | Authorization | Bearer TOKEN |
    Cuando se ejecuta el servicio con la configuracion de los headers
      | servicio | url                                   | metodo | formato |
      | pet      | https://petstore.swagger.io/v2/pet/10 | get    | json    |
    Entonces verificamos que el codigo de respuesta sea el numero "200"
    Y se guarda la respuesta de la ejecucion del servicio