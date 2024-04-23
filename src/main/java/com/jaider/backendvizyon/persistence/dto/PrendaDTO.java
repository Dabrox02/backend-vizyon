package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class PrendaDTO {
    private String nombre;
    private Double valorUnitCop;
    private Double valorUnitUsd;
    private String codigo;

    private EstadoDTO estado;
    private TipoEstadoDTO tipoEstado;
    private GeneroDTO genero;
    private TipoProteccionDTO tipoProteccion;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorUnitCop() {
        return this.valorUnitCop;
    }

    public void setValorUnitCop(Double valorUnitCop) {
        this.valorUnitCop = valorUnitCop;
    }

    public Double getValorUnitUsd() {
        return this.valorUnitUsd;
    }

    public void setValorUnitUsd(Double valorUnitUsd) {
        this.valorUnitUsd = valorUnitUsd;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoDTO getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public TipoEstadoDTO getTipoEstado() {
        return this.tipoEstado;
    }

    public void setTipoEstado(TipoEstadoDTO tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public GeneroDTO getGenero() {
        return this.genero;
    }

    public void setGenero(GeneroDTO genero) {
        this.genero = genero;
    }

    public TipoProteccionDTO getTipoProteccion() {
        return this.tipoProteccion;
    }

    public void setTipoProteccion(TipoProteccionDTO tipoProteccion) {
        this.tipoProteccion = tipoProteccion;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", valorUnitCop='" + getValorUnitCop() + "'" +
                ", valorUnitUsd='" + getValorUnitUsd() + "'" +
                ", codigo='" + getCodigo() + "'" +
                ", estado='" + getEstado() + "'" +
                ", tipoEstado='" + getTipoEstado() + "'" +
                ", genero='" + getGenero() + "'" +
                ", tipoProteccion='" + getTipoProteccion() + "'" +
                "}";
    }

}
