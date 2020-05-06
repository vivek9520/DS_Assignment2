package com.ds.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin

@RestController
public class SensorController {

    @Autowired
    SensorRepository sensorRepository;

    @GetMapping("rest/api/AllDetails")
    public List getAllDetails(){
        List<SensorModal> s = new ArrayList<>();
        return sensorRepository.findAll();
    }

   
}
