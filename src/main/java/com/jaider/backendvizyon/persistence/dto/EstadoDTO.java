package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class EstadoDTO {

    private String descripcion;
    private TipoEstadoDTO tipoEstadoEntity;

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoEstadoDTO getTipoEstadoEntity() {
        return this.tipoEstadoEntity;
    }

    public void setTipoEstadoEntity(TipoEstadoDTO tipoEstadoEntity) {
        this.tipoEstadoEntity = tipoEstadoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " descripcion='" + getDescripcion() + "'" +
                ", tipoEstadoEntity='" + getTipoEstadoEntity() + "'" +
                "}";
    }

}
