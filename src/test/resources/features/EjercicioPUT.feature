#language: es

@Ejercicio
Característica: Ejercicio de Automatización metodo PUT en APIs
  Como colaborador de Everis
  Quiero redactar y automatizar APIs
  Para recibir respuestas a las solicitudes enviadas

  @MetodoPUT
  Escenario: Metodo PUT a la API
    Dado que vamos a configurar los headers
      | cabeceras     | valor        |
      | Authorization | Bearer TOKEN |
    Y configuramos el body
      | id | name  | status  |
      | 10 | perro | pending |
    Cuando se ejecuta el servicio con configuracion de los headers
      | servicio      | url                                | metodo | formato |
      | Publicaciones | https://petstore.swagger.io/v2/pet | put    | json    |
    Entonces verificamos que el codigo de respuesta muestre el numero "200"
    Y guardamos la respuesta de la ejecucion del servicio