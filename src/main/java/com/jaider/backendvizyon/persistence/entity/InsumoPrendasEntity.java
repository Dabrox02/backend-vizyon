package com.jaider.backendvizyon.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity()
@Table(name = "insumo_prendas")
public class InsumoPrendasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInsumoPrendas;

    @ManyToOne()
    @JoinColumn(name = "id_insumo_fk", referencedColumnName = "id")
    private InsumoEntity insumoEntity;
    @ManyToOne()
    @JoinColumn(name = "id_prenda_fk", referencedColumnName = "id")
    private PrendaEntity prendaEntity;
    private Integer cantidad;

    public InsumoEntity getInsumoEntity() {
        return this.insumoEntity;
    }

    public void setInsumoEntity(InsumoEntity insumoEntity) {
        this.insumoEntity = insumoEntity;
    }

    public PrendaEntity getPrendaEntity() {
        return this.prendaEntity;
    }

    public void setPrendaEntity(PrendaEntity prendaEntity) {
        this.prendaEntity = prendaEntity;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "{" +
                " insumoEntity='" + getInsumoEntity() + "'" +
                ", prendaEntity='" + getPrendaEntity() + "'" +
                ", cantidad='" + getCantidad() + "'" +
                "}";
    }

}
