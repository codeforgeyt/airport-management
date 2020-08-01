package com.codeforgeyt.airportapi.controller;

import com.codeforgeyt.airportapi.service.PlaneService;
import com.codeforgeyt.airportcore.model.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping(value = "/planes")
    public ResponseEntity<PlaneDto> getPlane(){
        PlaneDto planeDto = planeService.getPlane();
        return new ResponseEntity<>(planeDto, HttpStatus.OK);
    }
}
