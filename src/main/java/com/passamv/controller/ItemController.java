package com.passamv.controller;

import com.passamv.entity.Item;
import com.passamv.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> save() {
        return itemService.findAll();
    }

}
