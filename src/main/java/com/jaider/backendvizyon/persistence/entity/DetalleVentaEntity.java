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
@Table(name = "detalle_venta")
public class DetalleVentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idDetalleVenta;
    private Integer cantidad;
    private Double valorUnit;

    @ManyToOne()
    @JoinColumn(name = "id_venta_fk", referencedColumnName = "id")
    private VentaEntity ventaEntity;
    @ManyToOne()
    @JoinColumn(name = "id_producto_fk", referencedColumnName = "id")
    private InventarioEntity inventarioEntity;
    @ManyToOne()
    @JoinColumn(name = "id_talla_fk", referencedColumnName = "id")
    private TallaEntity tallaEntity;

    public Long getIdDetalleVenta() {
        return this.idDetalleVenta;
    }

    public void setIdDetalleVenta(Long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorUnit() {
        return this.valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public VentaEntity getVentaEntity() {
        return this.ventaEntity;
    }

    public void setVentaEntity(VentaEntity ventaEntity) {
        this.ventaEntity = ventaEntity;
    }

    public InventarioEntity getInventarioEntity() {
        return this.inventarioEntity;
    }

    public void setInventarioEntity(InventarioEntity inventarioEntity) {
        this.inventarioEntity = inventarioEntity;
    }

    public TallaEntity getTallaEntity() {
        return this.tallaEntity;
    }

    public void setTallaEntity(TallaEntity tallaEntity) {
        this.tallaEntity = tallaEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idDetalleVenta='" + getIdDetalleVenta() + "'" +
                ", cantidad='" + getCantidad() + "'" +
                ", valorUnit='" + getValorUnit() + "'" +
                ", ventaEntity='" + getVentaEntity() + "'" +
                ", inventarioEntity='" + getInventarioEntity() + "'" +
                ", tallaEntity='" + getTallaEntity() + "'" +
                "}";
    }

}
