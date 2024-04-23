package com.jaider.backendvizyon.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEmpleado;
    private String nombre;
    private LocalDate fechaIngreso;
    @ManyToOne
    @JoinColumn(name = "id_municipio_fk", referencedColumnName = "id")
    private MunicipioEntity municipioEntity;
    @ManyToOne
    @JoinColumn(name = "id_cargo_fk", referencedColumnName = "id")
    private CargoEntity cargoEntity;

    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public MunicipioEntity getMunicipioEntity() {
        return this.municipioEntity;
    }

    public void setMunicipioEntity(MunicipioEntity municipioEntity) {
        this.municipioEntity = municipioEntity;
    }

    public CargoEntity getCargoEntity() {
        return this.cargoEntity;
    }

    public void setCargoEntity(CargoEntity cargoEntity) {
        this.cargoEntity = cargoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idEmpleado='" + getIdEmpleado() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", fechaIngreso='" + getFechaIngreso() + "'" +
                ", municipioEntity='" + getMunicipioEntity() + "'" +
                ", cargoEntity='" + getCargoEntity() + "'" +
                "}";
    }

}
