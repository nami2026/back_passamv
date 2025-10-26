package com.passamv.controller;

import com.passamv.entity.ComponentAmv;
import com.passamv.service.ComponentAmvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class ComponentAmvController {

    @Autowired
    private ComponentAmvService componentAmvService;

    @GetMapping("/componentamv")
    public List<ComponentAmv> getComponentsAmv() {
        return componentAmvService.getComponentsAmv();
    }

}
