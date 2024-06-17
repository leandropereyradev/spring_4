package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t01.n02.S04T01N02PereyraGastonLeandro.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greets(@RequestParam(defaultValue = "UNKNOWN")  String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greets2(@PathVariable(required = false) String name){
        if (name == null) name = "UNKNOWN";

        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }
}
