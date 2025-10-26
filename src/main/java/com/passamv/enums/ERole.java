package com.passamv.enums;

public enum ERole {

    ADMINISTRADOR("Administrador"),
    USUARIO("Usuario");

    private final String name;

    ERole(String name) {
        this.name = name;
    }
}
