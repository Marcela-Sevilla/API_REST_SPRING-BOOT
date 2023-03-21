package com.app.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping( path = "/{id}")
    public Optional<actorModel> obtenerActorPorId(@PathVariable("id") Long id){
        return this.actorServices.obtenerPorId(id);
    }

    // @GetMapping("/query")
    // public ArrayList<actorModel> obtenerActorPorPrioridad(@RequestParam("first_name") String first_name){
    //     return this.actorServices.obtenerPorPrioridad(first_name);
    // }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable Long id){
        boolean ok = this.actorServices.eliminarActor(id);
        if(ok){
            return "Se elimino el actor con Id: " + id;
        }else{
            return "No se pudo eliminar el actor con Id: " + id;
        }
    }
}
