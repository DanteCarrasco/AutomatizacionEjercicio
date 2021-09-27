$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/EjercicioGET.feature");
formatter.feature({
  "name": "Ejercicio de Automatización metodo GET en APIs",
  "description": "  Como colaborador de Everis\n  Quiero redactar y automatizar APIs\n  Para recibir respuestas a las solicitudes enviadas",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@Ejercicio"
    }
  ]
});
formatter.scenario({
  "name": "Metodo GET a la API",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@Ejercicio"
    },
    {
      "name": "@MetodoGET"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que configuramos los headers",
  "rows": [
    {
      "cells": [
        "cabeceras",
        "valor"
      ]
    },
    {
      "cells": [
        "Authorization",
        "Bearer TOKEN"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "EjercicioGetStepDefinition.queConfiguroLosHeaders(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ejecuta el servicio con la configuracion de los headers",
  "rows": [
    {
      "cells": [
        "servicio",
        "url",
        "metodo",
        "formato"
      ]
    },
    {
      "cells": [
        "pet",
        "https://petstore.swagger.io/v2/pet/10",
        "get",
        "json"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "EjercicioGetStepDefinition.seEjecutaElServicioConLaConfiguracionDeLosHeaders(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verificamos que el codigo de respuesta sea el numero \"200\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "EjercicioGetStepDefinition.verificamosQueElCodigoDeRespuestaSeaElNumero(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se guarda la respuesta de la ejecucion del servicio",
  "keyword": "Y "
});
formatter.match({
  "location": "EjercicioGetStepDefinition.seGuardaLaRespuestaDeLaEjecucionDelServicio()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/EjercicioPOST.feature");
formatter.feature({
  "name": "Ejercicio de Automatización metodo POST en APIs",
  "description": "  Como colaborador de Everis\n  Quiero redactar y automatizar APIs\n  Para recibir respuestas a las solicitudes enviadas",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@Ejercicio"
    }
  ]
});
formatter.scenario({
  "name": "Metodo POST a la API",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@Ejercicio"
    },
    {
      "name": "@MetodoPOST"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que se configuran los headers",
  "rows": [
    {
      "cells": [
        "cabeceras",
        "valor"
      ]
    },
    {
      "cells": [
        "Authorization",
        "Bearer TOKEN"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "EjercicioPostStepDefinition.queSeConfiguranLosHeaders(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "configurar el body",
  "rows": [
    {
      "cells": [
        "id",
        "name",
        "status"
      ]
    },
    {
      "cells": [
        "123513131",
        "Prueba",
        "available"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "EjercicioPostStepDefinition.configurarElBody(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ejecuta el servicio con la configuracion del header",
  "rows": [
    {
      "cells": [
        "servicio",
        "url",
        "metodo",
        "formato"
      ]
    },
    {
      "cells": [
        "pet",
        "https://petstore.swagger.io/v2/pet",
        "post",
        "json"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "EjercicioPostStepDefinition.seEjecutaElServicioConLaConfiguracionDelHeader(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verificar que el codigo de respuesta sea el numero \"200\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "EjercicioPostStepDefinition.verificarQueElCodigoDeRespuestaSeaElNumero(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "guardar la respuesta de la ejecucion del servicio",
  "keyword": "Y "
});
formatter.match({
  "location": "EjercicioPostStepDefinition.guardarLaRespuestaDeLaEjecucionDelServicio()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/EjercicioPUT.feature");
formatter.feature({
  "name": "Ejercicio de Automatización metodo PUT en APIs",
  "description": "  Como colaborador de Everis\n  Quiero redactar y automatizar APIs\n  Para recibir respuestas a las solicitudes enviadas",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@Ejercicio"
    }
  ]
});
formatter.scenario({
  "name": "Metodo PUT a la API",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@Ejercicio"
    },
    {
      "name": "@MetodoPUT"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que vamos a configurar los headers",
  "rows": [
    {
      "cells": [
        "cabeceras",
        "valor"
      ]
    },
    {
      "cells": [
        "Authorization",
        "Bearer TOKEN"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "EjercicioPutStepDefinition.queVamosAConfigurarLosHeaders(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "configuramos el body",
  "rows": [
    {
      "cells": [
        "id",
        "name",
        "status"
      ]
    },
    {
      "cells": [
        "10",
        "perro",
        "pending"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "EjercicioPutStepDefinition.configuramosElBody(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ejecuta el servicio con configuracion de los headers",
  "rows": [
    {
      "cells": [
        "servicio",
        "url",
        "metodo",
        "formato"
      ]
    },
    {
      "cells": [
        "Publicaciones",
        "https://petstore.swagger.io/v2/pet",
        "put",
        "json"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "EjercicioPutStepDefinition.seEjecutaElServicioConConfiguracionDeLosHeaders(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verificamos que el codigo de respuesta muestre el numero \"200\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "EjercicioPutStepDefinition.verificamosQueElCodigoDeRespuestaMuestreElNumero(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "guardamos la respuesta de la ejecucion del servicio",
  "keyword": "Y "
});
formatter.match({
  "location": "EjercicioPutStepDefinition.guardamosLaRespuestaDeLaEjecucionDelServicio()"
});
formatter.result({
  "status": "passed"
});
});