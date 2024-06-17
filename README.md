# **Índice**
### Tarea 1
1. [Nivel 1 - Tarea 1](#nivel-1---tarea-1)
2. [Nivel 2 - Tarea 1](#nivel-2---tarea-1)
3. [Nivel 3 - Tarea 1](#nivel-3---tarea-1)

### Tarea 2
1. [Nivel 1, 2 y 3 - Tarea 2](#nivel-1-2-y-3---tarea-2)

---

# Nivel 1 - Tarea 1

## Ejercicio Spring y Maven (Tarea 1 - Maven)

En el archivo ***application.properties***, configura la variable ***server.port*** con el valor ***9000***.

Convertiremos esta aplicación en una **API REST**:
Dependiendo del package principal, crea otro subpackage llamado ***Controllers***, y en su interior, añade la clase ***HelloWorldController***.

Tendrá que tener dos métodos:
+ `String greats`
+ `String greats2`

Estos dos métodos recibirán un parámetro String llamado ***name***, y devolverán la frase:

`"Hola, " + name + ". Estás ejecutando un proyecto Maven"`

El primer método responderá a una petición **GET**, y deberá ser configurado para recibir el parámetro como un ***RequestParam***. El parámetro ***name*** tendrá el valor predeterminado ***UNKNOWN***.

Deberá responder a:

[http://localhost:9000/HelloWorld](http://localhost:9000/HelloWorld)

[http://localhost:9000/HelloWorld?name=minombre](http://localhost:9000/HelloWorld?name=minombre)

El segundo método responderá a una petición **GET**, y deberá ser configurado para recibir el parámetro como una ***PathVariable***. El parámetro ***name*** será opcional.

Deberá responder a:

[http://localhost:9000/HelloWorld2](http://localhost:9000/HelloWorld2)

[http://localhost:9000/HelloWorld2/minombre](http://localhost:9000/HelloWorld2/minombre)

***

## *Recursos*

+ [Diferencia entre RequestParam y PathVariable](https://www.baeldung.com/spring-requestparam-vs-pathvariable)
+ [RequestParam](https://www.baeldung.com/spring-request-param)
+ [PathVariable](https://www.baeldung.com/spring-optional-path-variables)
+ 
+ [Repositorio a ejercicio Maven](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%201/Maven)

### [Volver al Índice](#índice)

---

# Nivel 2 - Tarea 1

## Ejercicio Spring y Gradle (Tarea 1 - Gradle)

En el archivo ***application.properties***, configura la variable ***server.port*** con el valor ***9001***.

Convertiremos esta aplicación en una **API REST**:
Dependiendo del package principal, crea otro subpackage llamado ***Controllers***, y en su interior, añade la clase ***HelloWorldController***.

Tendrá que tener dos métodos:
+ `String greats`
+ `String greats2`

Estos dos métodos recibirán un parámetro String llamado ***name***, y devolverán la frase:

`"Hola, " + name + ". Estás ejecutando un proyecto Gradle"`

El primer método responderá a una petición **GET**, y deberá ser configurado para recibir el parámetro como un ***RequestParam***. El parámetro ***name*** tendrá el valor predeterminado ***UNKNOWN***.

Deberá responder a:

[http://localhost:9001/HelloWorld](http://localhost:9001/HelloWorld)

[http://localhost:9001/HelloWorld?name=minombre](http://localhost:9001/HelloWorld?name=minombre)

El segundo método responderá a una petición **GET**, y deberá ser configurado para recibir el parámetro como una ***PathVariable***. El parámetro ***name*** será opcional.

Deberá responder a:

[http://localhost:9001/HelloWorld2](http://localhost:9001/HelloWorld2)

[http://localhost:9001/HelloWorld2/minombre](http://localhost:9001/HelloWorld2/minombre)

***

## *Recursos*

+ [Diferencia entre RequestParam y PathVariable](https://www.baeldung.com/spring-requestparam-vs-pathvariable)
+ [RequestParam](https://www.baeldung.com/spring-request-param)
+ [PathVariable](https://www.baeldung.com/spring-optional-path-variables)

+ [Repositorio a ejercicio Gradle](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%201/Gradle)

### [Volver al Índice](#índice)

---

# Nivel 3 - Tarea 1

## Ejercicio Postman (Tarea 1 - Postman)

Se trata de probar los anteriores proyectos desde Postman.

Crea dos entornos:
+ Proyecto Maven
+ Proyecto Gradle

Ambos entornos tendrán dos variables:
+ `Servidor`, que en ambos casos tendrá el valor `http://localhost`
+ `Port`, que en el caso del proyecto Maven tendrá el valor `9000`, y en el caso del proyecto Gradle, `9001`.

¿Qué debes entregar? (4 archivos):
+ Los dos entornos exportados.
+ Una captura de pantalla por cada entorno, donde se vea la ejecución desde Postman usando el entorno y las variables definidas en ellos.
+ Puedes probar la URL: `http://localhost:xxxx/HelloWorld/minombre`, o cualquier otra de las que admiten los dos proyectos. (Recuerda que para que la ejecución funcione correctamente, deberás tener en ejecución ambos proyectos en Eclipse).

Ejecuta desde Eclipse los proyectos creados en los dos niveles anteriores, y muestra el retorno obtenido en cada proyecto, cuando llamas a algunas de las peticiones disponibles, utilizando los entornos creados y sus variables.

Tendrás que entregar dos capturas de pantalla, una por la ejecución de cada entorno, y dos archivos con formato JSON, con los entornos exportados.

+ [Repositorio a ejercicio Postman](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%201/Postman)

### [Volver al Índice](#índice)

---

# Nivel 1, 2 y 3 - Tarea 2

## Ejercicio Base de Datos H2

Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:
+ `int` (String para MongoDB) id
+ `String` name
+ `int` quantityKilo

Aprovechando la especificación JPA, deberás persistir esta entidad en una base de datos H2, MySQL y MongoDB, siguiendo el patrón MVC. Para ello, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

+ controllers
+ model.domain
+ model.services
+ model.repository

La clase ubicada en el paquete controllers (FruitaController, por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:

[http://localhost:8080/fruta/add](http://localhost:8080/fruta/add)

[http://localhost:8080/fruta/update](http://localhost:8080/fruta/update)

[http://localhost:8080/fruta/delete/{id}](http://localhost:8080/fruta/delete/{id})

[http://localhost:8080/fruta/getOne/{id}](http://localhost:8080/fruta/getOne/{id})

[http://localhost:8080/fruta/getAll](http://localhost:8080/fruta/getAll)

+ [Repositorio a ejercicio con H2](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%202/N1_Ejercicio_CRUD_H2)
+ [Repositorio a ejercicio con MySQL](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%202/N1_Ejercicio_CRUD_MySQL)
+ [Repositorio a ejercicio con MongoDB](https://github.com/leandropereyradev/spring_4/tree/main/Tarea%202/N1_Ejercicio_CRUD_MongoDB)

### [Volver al Índice](#índice)
