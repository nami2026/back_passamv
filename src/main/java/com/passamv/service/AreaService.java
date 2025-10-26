package com.passamv.service;

import com.passamv.entity.Area;
import com.passamv.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    public List<Area> getAreas() {
        return areaRepository.findAll();
    }

    public Area getById(int id) {
        return areaRepository.findById(id).get();
    }

}
