package com.jaider.backendvizyon.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insumo")
public class InsumoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idInsumo;
    private String nombre;
    private Double valorUnit;
    private Double stockMin;
    private Double stockMax;

    public Long getIdInsumo() {
        return this.idInsumo;
    }

    public void setIdInsumo(Long idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorUnit() {
        return this.valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Double getStockMin() {
        return this.stockMin;
    }

    public void setStockMin(Double stockMin) {
        this.stockMin = stockMin;
    }

    public Double getStockMax() {
        return this.stockMax;
    }

    public void setStockMax(Double stockMax) {
        this.stockMax = stockMax;
    }

    @Override
    public String toString() {
        return "{" +
                " idInsumo='" + getIdInsumo() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", valorUnit='" + getValorUnit() + "'" +
                ", stockMin='" + getStockMin() + "'" +
                ", stockMax='" + getStockMax() + "'" +
                "}";
    }

}
