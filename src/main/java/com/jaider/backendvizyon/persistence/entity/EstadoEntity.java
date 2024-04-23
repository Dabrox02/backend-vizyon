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
@Table(name = "estado")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEstado;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_tipo_estado_fk", referencedColumnName = "id")
    private TipoEstadoEntity tipoEstadoEntity;

    public Long getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoEstadoEntity getTipoEstadoEntity() {
        return this.tipoEstadoEntity;
    }

    public void setTipoEstadoEntity(TipoEstadoEntity tipoEstadoEntity) {
        this.tipoEstadoEntity = tipoEstadoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idEstado='" + getIdEstado() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                ", tipoEstadoEntity='" + getTipoEstadoEntity() + "'" +
                "}";
    }

}
