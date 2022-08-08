package com.example.pilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Home {

    @GetMapping("")
    public Map<String, String> getStatus(){
        Map map = new HashMap<String, String>();
        map.put("appVersion", "1.0.0");
        return map;
    }
}
