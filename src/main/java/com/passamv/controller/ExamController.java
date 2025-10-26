package com.passamv.controller;

import com.passamv.entity.Exam;
import com.passamv.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class ExamController {

    @Autowired
    private ExamService examService;

    @PostMapping("/save-exam")
    public Exam save(@RequestBody Exam exam) {
        return examService.save(exam);
    }


}
