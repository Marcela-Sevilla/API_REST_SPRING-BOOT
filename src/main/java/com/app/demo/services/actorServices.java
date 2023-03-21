package com.app.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.repositories.ActorRepositori;

@Service
public class actorServices {
    @Autowired
    ActorRepositori actorRepositori;
}
