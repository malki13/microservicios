package com.telecom.administracionservice.interventor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administracion")
public class InterventorController {
    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") int id) {
//        Bike bike = bikeService.getBikeById(id);
//        if(bike == null)
//            return ResponseEntity.notFound().build();
        return ResponseEntity.ok("Hola"+String.valueOf(id));
    }
}
