package com.globomatics.passion.controller;


import com.globomatics.passion.model.event;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class eventController {

    @RequestMapping(value = "/api/v1/event",
            produces = "application/json",
            method=RequestMethod.GET)
    public List<event> list(){
        List<event> events = new ArrayList<>();
        return events;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody event evenrts){

    }
    @GetMapping("/{id}")
    public event get(@PathVariable("id") long id){
        return new event();
    }


}
