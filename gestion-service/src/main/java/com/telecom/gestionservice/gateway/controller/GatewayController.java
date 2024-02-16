package com.telecom.gestionservice.gateway.controller;

import com.telecom.gestionservice.gateway.data.info.GatewayInfo;
import com.telecom.gestionservice.gateway.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gestion")
public class GatewayController {
    @Autowired
    private GatewayService gatewayService;
    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") int id) {
//        Bike bike = bikeService.getBikeById(id);
//        if(bike == null)
//            return ResponseEntity.notFound().build();
        return ResponseEntity.ok("Hola"+String.valueOf(id));
    }
    @GetMapping("/getAll")
    public ResponseEntity<Page<GatewayInfo>> findAll(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        return new ResponseEntity<>(gatewayService.findAll(pageable), HttpStatus.OK);
    }
}
