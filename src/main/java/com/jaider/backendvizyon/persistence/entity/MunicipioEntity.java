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
@Table(name = "municipio")
public class MunicipioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idMunicipio;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk", referencedColumnName = "id")
    private DepartamentoEntity departamentoEntity;

    public Long getIdMunicipio() {
        return this.idMunicipio;
    }

    public void setIdMunicipio(Long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DepartamentoEntity getDepartamentoEntity() {
        return this.departamentoEntity;
    }

    public void setDepartamentoEntity(DepartamentoEntity departamentoEntity) {
        this.departamentoEntity = departamentoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idMunicipio='" + getIdMunicipio() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", departamentoEntity='" + getDepartamentoEntity() + "'" +
                "}";
    }

}
