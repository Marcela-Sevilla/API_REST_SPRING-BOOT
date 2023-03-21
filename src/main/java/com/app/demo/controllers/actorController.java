package com.app.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.services.actorServices;

@RestController
@RequestMapping("/actor")
public class actorController {
    @Autowired
    actorServices actorServices;
}
