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
@Table(name = "departamento")
public class DepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idDepartamento;
    private String nombre;
    @ManyToOne()
    @JoinColumn(name = "id_pais_fk", referencedColumnName = "id", nullable = false)
    private PaisEntity paisEntity;

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PaisEntity getPaisEntity() {
        return this.paisEntity;
    }

    public void setPaisEntity(PaisEntity paisEntity) {
        this.paisEntity = paisEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idDepartamento='" + getIdDepartamento() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", paisEntity='" + getPaisEntity() + "'" +
                "}";
    }

}
