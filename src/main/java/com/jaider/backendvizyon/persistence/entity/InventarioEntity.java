package com.jaider.backendvizyon.persistence.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class InventarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idInventario;
    private String codInv;
    private Double valorVtaCop;
    private Double valorVtaUsd;

    @ManyToOne()
    @JoinColumn(name = "id_prenda_fk", referencedColumnName = "id")
    private PrendaEntity prendaEntity;

    @ManyToMany()
    @JoinTable(name = "inventario_talla", joinColumns = { @JoinColumn(name = "id_inv_fk") }, inverseJoinColumns = {
            @JoinColumn(name = "id_talla_fk") })
    private List<TallaEntity> tallas;

    public Long getIdInventario() {
        return this.idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodInv() {
        return this.codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public Double getValorVtaCop() {
        return this.valorVtaCop;
    }

    public void setValorVtaCop(Double valorVtaCop) {
        this.valorVtaCop = valorVtaCop;
    }

    public Double getValorVtaUsd() {
        return this.valorVtaUsd;
    }

    public void setValorVtaUsd(Double valorVtaUsd) {
        this.valorVtaUsd = valorVtaUsd;
    }

    public PrendaEntity getPrendaEntity() {
        return this.prendaEntity;
    }

    public void setPrendaEntity(PrendaEntity prendaEntity) {
        this.prendaEntity = prendaEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idInventario='" + getIdInventario() + "'" +
                ", codInv='" + getCodInv() + "'" +
                ", valorVtaCop='" + getValorVtaCop() + "'" +
                ", valorVtaUsd='" + getValorVtaUsd() + "'" +
                ", prendaEntity='" + getPrendaEntity() + "'" +
                "}";
    }

}
