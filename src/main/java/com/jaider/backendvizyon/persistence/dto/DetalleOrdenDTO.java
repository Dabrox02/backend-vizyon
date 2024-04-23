package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class DetalleOrdenDTO {

    private Long prendaId;
    private Integer cantidadProducir;
    private Integer cantidadProducida;

    private OrdenDTO orden;
    private PrendaDTO prenda;
    private ColorDTO color;
    private EstadoDTO estado;

    public Long getPrendaId() {
        return this.prendaId;
    }

    public void setPrendaId(Long prendaId) {
        this.prendaId = prendaId;
    }

    public Integer getCantidadProducir() {
        return this.cantidadProducir;
    }

    public void setCantidadProducir(Integer cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public Integer getCantidadProducida() {
        return this.cantidadProducida;
    }

    public void setCantidadProducida(Integer cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    public OrdenDTO getOrden() {
        return this.orden;
    }

    public void setOrden(OrdenDTO orden) {
        this.orden = orden;
    }

    public PrendaDTO getPrenda() {
        return this.prenda;
    }

    public void setPrenda(PrendaDTO prenda) {
        this.prenda = prenda;
    }

    public ColorDTO getColor() {
        return this.color;
    }

    public void setColor(ColorDTO color) {
        this.color = color;
    }

    public EstadoDTO getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "{" +
                " prendaId='" + getPrendaId() + "'" +
                ", cantidadProducir='" + getCantidadProducir() + "'" +
                ", cantidadProducida='" + getCantidadProducida() + "'" +
                ", orden='" + getOrden() + "'" +
                ", prenda='" + getPrenda() + "'" +
                ", color='" + getColor() + "'" +
                ", estado='" + getEstado() + "'" +
                "}";
    }

}
