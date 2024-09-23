package com.example.render.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping("/{name}")
    public String name(@PathVariable String name) {
        return "Hola, " + name + " , yo soy Yami.";
    }

}
