package com.app.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.models.actorModel;
import com.app.demo.repositories.ActorRepositori;

@Service
public class actorServices {
    @Autowired
    ActorRepositori actorRepositori;

    public ArrayList<actorModel> obtenerActores(){
        return (ArrayList<actorModel>) actorRepositori.findAll();
    }

    public actorModel guardarActor(actorModel actor){
        return actorRepositori.save(actor);
    }

    public Optional<actorModel> findById(Long id) {
        return null;
    }

    public Optional<actorModel> obtenerPorId(Long id){
        return actorRepositori.findById(id);
    }

    public ArrayList<actorModel> obtenerPorPrioridad(Integer prioridad){
        return actorRepositori.findByPrioridad(prioridad);
    }

    public Boolean eliminarActor(Long id){
        try {
            actorRepositori.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
