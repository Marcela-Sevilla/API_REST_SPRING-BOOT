package com.app.demo.services;

import java.util.ArrayList;

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

    
}
