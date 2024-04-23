package com.jaider.backendvizyon.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_proteccion")
public class TipoProteccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTipoProteccion;
    private String descripcion;

    public Long getIdTipoProteccion() {
        return this.idTipoProteccion;
    }

    public void setIdTipoProteccion(Long idTipoProteccion) {
        this.idTipoProteccion = idTipoProteccion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "{" +
                " idTipoProteccion='" + getIdTipoProteccion() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                "}";
    }

}
