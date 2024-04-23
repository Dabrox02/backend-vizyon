package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class CargoDTO {

    private String descripcion;
    private Double sueldoBase;

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSueldoBase() {
        return this.sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
