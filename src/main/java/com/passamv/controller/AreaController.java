package com.passamv.controller;

import com.passamv.entity.Area;
import com.passamv.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/areas")
    public List<Area> getAreas() {
        return areaService.getAreas();
    }

    @GetMapping("/area/{id}")
    public Area getAreaById(@PathVariable("id") int id) {
        return areaService.getById(id);
    }

}
