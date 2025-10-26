package com.passamv.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "COMPONENTAMV")
@Data
public class ComponentAmv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "componentamv_id")
    private int id;

    private String type;

    @OneToMany(mappedBy = "componentAmv",
            cascade = CascadeType.ALL)
    private List<Module> modules;

}
