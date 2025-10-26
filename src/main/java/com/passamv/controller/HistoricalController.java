package com.passamv.controller;

import com.passamv.dto.HistoricalDto;
import com.passamv.entity.Historical;
import com.passamv.service.HistoricalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class HistoricalController {

    @Autowired
    private HistoricalService historicalService;

    @PostMapping("/save-historical")
    public Historical save(@RequestBody HistoricalDto historical) {
        return historicalService.save(historical);
    }

}
