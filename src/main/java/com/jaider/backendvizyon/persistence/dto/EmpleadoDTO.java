package com.jaider.backendvizyon.persistence.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class EmpleadoDTO {

    private String nombre;
    private LocalDate fechaIngreso;
    private MunicipioDTO municipio;
    private CargoDTO cargo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public MunicipioDTO getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public CargoDTO getCargo() {
        return this.cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", fechaIngreso='" + getFechaIngreso() + "'" +
                ", municipio='" + getMunicipio() + "'" +
                ", cargo='" + getCargo() + "'" +
                "}";
    }

}
