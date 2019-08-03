package com.globomatics.passion.controller;

import com.globomatics.passion.model.register;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/api/v1/register")
public class registerController {
    public List<register> list(){
        List<register> register = new ArrayList<>();
        return register;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody register register){

    }
    @GetMapping("/{id}")
    public register get(@PathVariable("id") long id){
        return new register();
    }

}
