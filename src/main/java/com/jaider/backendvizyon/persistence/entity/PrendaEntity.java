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
@Table(name = "prenda")
public class PrendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPrenda;

    private String nombre;
    private Double valorUnitCop;
    private Double valorUnitUsd;
    private String codigo;

    @ManyToOne()
    @JoinColumn(name = "id_estado_fk", referencedColumnName = "id")
    private EstadoEntity estadoEntity;
    @ManyToOne()
    @JoinColumn(name = "id_tipo_estado_fk", referencedColumnName = "id")
    private TipoEstadoEntity tipoEstadoEntity;
    @ManyToOne()
    @JoinColumn(name = "id_genero_fk", referencedColumnName = "id")
    private GeneroEntity generoEntity;
    @ManyToOne()
    @JoinColumn(name = "id_tipo_proteccion_fk", referencedColumnName = "id")
    private TipoProteccionEntity tipoProteccionEntity;

    public Long getIdPrenda() {
        return this.idPrenda;
    }

    public void setIdPrenda(Long idPrenda) {
        this.idPrenda = idPrenda;
    }

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

    public EstadoEntity getEstadoEntity() {
        return this.estadoEntity;
    }

    public void setEstadoEntity(EstadoEntity estadoEntity) {
        this.estadoEntity = estadoEntity;
    }

    public TipoEstadoEntity getTipoEstadoEntity() {
        return this.tipoEstadoEntity;
    }

    public void setTipoEstadoEntity(TipoEstadoEntity tipoEstadoEntity) {
        this.tipoEstadoEntity = tipoEstadoEntity;
    }

    public GeneroEntity getGeneroEntity() {
        return this.generoEntity;
    }

    public void setGeneroEntity(GeneroEntity generoEntity) {
        this.generoEntity = generoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idPrenda='" + getIdPrenda() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", valorUnitCop='" + getValorUnitCop() + "'" +
                ", valorUnitUsd='" + getValorUnitUsd() + "'" +
                ", codigo='" + getCodigo() + "'" +
                ", estadoEntity='" + getEstadoEntity() + "'" +
                ", tipoEstadoEntity='" + getTipoEstadoEntity() + "'" +
                ", generoEntity='" + getGeneroEntity() + "'" +
                "}";
    }

}
