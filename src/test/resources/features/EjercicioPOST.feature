#language: es

@Ejercicio
Característica: Ejercicio de Automatización metodo POST en APIs
  Como colaborador de Everis
  Quiero redactar y automatizar APIs
  Para recibir respuestas a las solicitudes enviadas

  @MetodoPOST
  Escenario: Metodo POST a la API
    Dado que se configuran los headers
      | cabeceras     | valor        |
      | Authorization | Bearer TOKEN |
    Y configurar el body
      | id   | name   | status    |
      | 123513131 | Prueba | available |
    Cuando se ejecuta el servicio con la configuracion del header
      | servicio | url                                | metodo | formato |
      | pet      | https://petstore.swagger.io/v2/pet | post   | json    |
    Entonces verificar que el codigo de respuesta sea el numero "200"
    Y guardar la respuesta de la ejecucion del servicio