package com.jaider.backendvizyon.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String idCliente;
    private LocalDate fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_tipo_persona_fk", referencedColumnName = "Id")
    private TipoPersonaEntity tipoPersonaEntity;

    @ManyToOne
    @JoinColumn(name = "id_municipio_fk", referencedColumnName = "id")
    private MunicipioEntity municipioEntity;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public TipoPersonaEntity getTipoPersonaEntity() {
        return this.tipoPersonaEntity;
    }

    public void setTipoPersonaEntity(TipoPersonaEntity tipoPersonaEntity) {
        this.tipoPersonaEntity = tipoPersonaEntity;
    }

    public MunicipioEntity getMunicipioEntity() {
        return this.municipioEntity;
    }

    public void setMunicipioEntity(MunicipioEntity municipioEntity) {
        this.municipioEntity = municipioEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", idCliente='" + getIdCliente() + "'" +
                ", fechaRegistro='" + getFechaRegistro() + "'" +
                ", tipoPersonaEntity='" + getTipoPersonaEntity() + "'" +
                ", municipioEntity='" + getMunicipioEntity() + "'" +
                "}";
    }

}
