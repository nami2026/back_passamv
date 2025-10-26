package com.passamv.service;

import com.passamv.entity.Module;
import com.passamv.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getModules() {
        return moduleRepository.findAll();
    }

}
