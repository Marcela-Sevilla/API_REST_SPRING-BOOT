package com.app.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.models.actorModel;
import com.app.demo.services.actorServices;

@RestController
@RequestMapping("/actor")
public class actorController {

    @Autowired
    actorServices actorServices;

    @GetMapping()
    public ArrayList<actorModel> obtenerActores(){
        return actorServices.obtenerActores();
    }

    @PostMapping()
    public actorModel guardarActor(@RequestBody actorModel actor){
        return this.actorServices.guardarActor(actor);
    }
}
