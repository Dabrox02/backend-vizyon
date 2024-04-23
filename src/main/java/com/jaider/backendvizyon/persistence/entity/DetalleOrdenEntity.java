package com.jaider.backendvizyon.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrdenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idDetalleOrden;
    private Long prendaId;
    private Integer cantidadProducir;
    private Integer cantidadProducida;

    @ManyToOne()
    @JoinColumn(name = "id_orden_fk", referencedColumnName = "id")
    private OrdenEntity ordenEntity;
    @ManyToOne()
    @JoinColumn(name = "id_prenda_fk", referencedColumnName = "id")
    private PrendaEntity prendaEntity;
    @ManyToOne()
    @JoinColumn(name = "id_color_fk", referencedColumnName = "id")
    private ColorEntity colorEntity;
    @ManyToOne()
    @JoinColumn(name = "id_estado_fk", referencedColumnName = "id")
    private EstadoEntity estadoEntity;

    public Long getPrendaId() {
        return this.prendaId;
    }

    public void setPrendaId(Long prendaId) {
        this.prendaId = prendaId;
    }

    public Long getIdDetalleOrden() {
        return this.idDetalleOrden;
    }

    public void setIdDetalleOrden(Long idDetalleOrden) {
        this.idDetalleOrden = idDetalleOrden;
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

    public OrdenEntity getOrdenEntity() {
        return this.ordenEntity;
    }

    public void setOrdenEntity(OrdenEntity ordenEntity) {
        this.ordenEntity = ordenEntity;
    }

    public PrendaEntity getPrendaEntity() {
        return this.prendaEntity;
    }

    public void setPrendaEntity(PrendaEntity prendaEntity) {
        this.prendaEntity = prendaEntity;
    }

    public ColorEntity getColorEntity() {
        return this.colorEntity;
    }

    public void setColorEntity(ColorEntity colorEntity) {
        this.colorEntity = colorEntity;
    }

    public EstadoEntity getEstadoEntity() {
        return this.estadoEntity;
    }

    public void setEstadoEntity(EstadoEntity estadoEntity) {
        this.estadoEntity = estadoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " prendaId='" + getPrendaId() + "'" +
                ", idDetalleOrden='" + getIdDetalleOrden() + "'" +
                ", cantidadProducir='" + getCantidadProducir() + "'" +
                ", cantidadProducida='" + getCantidadProducida() + "'" +
                ", ordenEntity='" + getOrdenEntity() + "'" +
                ", prendaEntity='" + getPrendaEntity() + "'" +
                ", colorEntity='" + getColorEntity() + "'" +
                ", estadoEntity='" + getEstadoEntity() + "'" +
                "}";
    }

}
