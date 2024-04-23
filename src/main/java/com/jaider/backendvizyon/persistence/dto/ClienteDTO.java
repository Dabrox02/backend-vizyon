package com.jaider.backendvizyon.persistence.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ClienteDTO {
    private String nombre;
    private String idCliente;
    private LocalDate fechaRegistro;
    private TipoPersonaDTO tipoPersonaEntity;
    private MunicipioDTO municipioEntity;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public TipoPersonaDTO getTipoPersonaEntity() {
        return this.tipoPersonaEntity;
    }

    public void setTipoPersonaEntity(TipoPersonaDTO tipoPersonaEntity) {
        this.tipoPersonaEntity = tipoPersonaEntity;
    }

    public MunicipioDTO getMunicipioEntity() {
        return this.municipioEntity;
    }

    public void setMunicipioEntity(MunicipioDTO municipioEntity) {
        this.municipioEntity = municipioEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", idCliente='" + getIdCliente() + "'" +
                ", fechaRegistro='" + getFechaRegistro() + "'" +
                ", tipoPersonaEntity='" + getTipoPersonaEntity() + "'" +
                ", municipioEntity='" + getMunicipioEntity() + "'" +
                "}";
    }

}
