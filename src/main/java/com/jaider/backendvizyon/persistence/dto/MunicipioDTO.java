package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class MunicipioDTO {

    private String nombre;
    private Long idDepartamento;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "{" +
                ", nombre='" + getNombre() + "'" +
                ", idDepartamento='" + getIdDepartamento() + "'" +
                "}";
    }

}
