package com.app.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.models.actorModel;

@Repository
public interface ActorRepositori extends CrudRepository<actorModel, Long> {
    public abstract ArrayList<actorModel> findByPrioridad(Integer prioridad);
}
