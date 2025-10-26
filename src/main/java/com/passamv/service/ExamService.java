package com.passamv.service;

import com.passamv.entity.Exam;
import com.passamv.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }

}
