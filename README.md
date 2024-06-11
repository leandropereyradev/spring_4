# **Índice**   
1. [Nivel 1 - Tarea 1](#nivel-1)
2. [Nivel 2 - Tarea 1](#nivel-2)
3. [Nivel 3 - Tarea 1](#nivel-3)

---
---

# Nivel 1

## Ejercicio Spring y Maven (Tarea 1 - Maven)

En el archivo  ***application.properties***, configura la variable ***server.port*** con el valor  ***9000*** .

Convertiremos esta aplicación en una **API REST**:
Dependiendo del package principal, crea otro subpackage llamado ***Controllers***, y en su interior, añade la clase  ***HelloWorldController***.


Tendrá que tener dos métodos:
+ String greats
+ String greats2

Estos dos métodos recibirán un parámetro String llamado ***name***, y devolverán la frase:

`"Hola, " + name + ". Estás ejecutando un proyecto Maven"`

El primer método responderá a una petición  **GET** , y deberá ser configurado para recibir el parámetro como un  ***RequestParam***. El parámetro ***name*** tendrá el valor predeterminado ***UNKNOWN***.

Deberá responder a:

<a href="http://localhost:9000/HelloWorld" target="_blank">http://localhost:9000/HelloWorld</a>

<a href="http://localhost:9000/HelloWorld?name=minombre" target="_blank">http://localhost:9000/HelloWorld?name=minombre</a>


El segundo método responderá a una petición  **GET** , y deberá ser configurado para recibir el parámetro como una ***PathVariable***. El parámetro ***name*** será opcional.

Deberá responder a:

<a href="http://localhost:9000/HelloWorld2" target="_blank">http://localhost:9000/HelloWorld2</a>

<a href="http://localhost:9000/HelloWorld2/minombre" target="_blank">http://localhost:9000/HelloWorld2/minombre</a>

***
***

>## *Recursos*
> 
>+ <a href="https://www.baeldung.com/spring-requestparam-vs-pathvariable" target="_blank">*Diferencia entre RequestParam y PathVariable*</a>
>
>+ <a href="https://www.baeldung.com/spring-request-param" target="_blank">*RequestParam*</a>
>
>+ <a href="https://www.baeldung.com/spring-optional-path-variables" target="_blank">*PathVariable*</a>

## [Volver al Índice](#índice)
---

# Nivel 2

## Ejercicio Spring y Gradle (Tarea 1 - Gradle)

En el archivo  ***application.properties***, configura la variable ***server.port*** con el valor  ***9001*** .

Convertiremos esta aplicación en una **API REST**:
Dependiendo del package principal, crea otro subpackage llamado ***Controllers***, y en su interior, añade la clase  ***HelloWorldController***.


Tendrá que tener dos métodos:
+ String greats
+ String greats2

Estos dos métodos recibirán un parámetro String llamado ***name***, y devolverán la frase:

`"Hola, " + name + ". Estás ejecutando un proyecto Gradle"`

El primer método responderá a una petición  **GET** , y deberá ser configurado para recibir el parámetro como un  ***RequestParam***. El parámetro ***name*** tendrá el valor predeterminado ***UNKNOWN***.

Deberá responder a:

<a href="http://localhost:9001/HelloWorld" target="_blank">http://localhost:9001/HelloWorld</a>

<a href="http://localhost:9001/HelloWorld?name=minombre" target="_blank">http://localhost:9001/HelloWorld?name=minombre</a>


El segundo método responderá a una petición  **GET** , y deberá ser configurado para recibir el parámetro como una ***PathVariable***. El parámetro ***name*** será opcional.

Deberá responder a:

<a href="http://localhost:9001/HelloWorld2" target="_blank">http://localhost:9001/HelloWorld2</a>

<a href="http://localhost:9001/HelloWorld2/minombre" target="_blank">http://localhost:9001/HelloWorld2/minombre</a>

***
***

>## *Recursos*
> 
>+ <a href="https://www.baeldung.com/spring-requestparam-vs-pathvariable" target="_blank">*Diferencia entre RequestParam y PathVariable*</a>
>
>+ <a href="https://www.baeldung.com/spring-request-param" target="_blank">*RequestParam*</a>
>
>+ <a href="https://www.baeldung.com/spring-optional-path-variables" target="_blank">*PathVariable*</a>

## [Volver al Índice](#índice)
---

# Nivel 3

## Ejercicio Postman (Tarea 1 - Postman)

Se trata de probar los anteriores proyectos desde Postman.

Crea dos entornos:
+ Proyecto Maven
+ Proyecto Gradle

Ambos entornos tendrán dos variables:

+ Servidor, que en ambos casos tendrá el valor  http://localhost


+ Port, que en el caso del proyecto Maven tendrá el valor 9000, y en el caso del proyecto Gradle, 9001.

¿Qué debes entregar? (4 archivos):

+ Los dos entornos exportados.


+ Una captura de pantalla por cada entorno, donde se vea la ejecución desde Postman usando el entorno y las variables definidas en ellos.


+ Puedes probar la URL:  http://localhost:xxxx/HelloWorld/minombre , o cualquier otra de las que admiten los dos proyectos. (recuerda que para que la ejecución funcione correctamente, deberás tener en ejecución ambos proyectos en Eclipse).

Ejecuta desde Eclipse los proyectos creados en los dos niveles anteriores, y muestra el retorno obtenido en cada proyecto, cuando llamas a algunas de las peticiones disponibles, utilizando los entornos creados y sus variables.

Tendrás que entregar dos capturas de pantalla, una por la ejecución de cada entorno, y dos archivos con formato JSON, con los entornos exportados.

## [Volver al Índice](#índice)
---