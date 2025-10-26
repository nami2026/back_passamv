package com.passamv.controller;

import com.passamv.dto.ContentDto;
import com.passamv.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/contents")
    public List<ContentDto> getContents() {
        return contentService.getContents();
    }

}
