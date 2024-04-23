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
@Table(name = "orden")
public class OrdenEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_empleado_fk", referencedColumnName = "id")
    private EmpleadoEntity empleadoEntity;
    @ManyToOne
    @JoinColumn(name = "id_cliente_fk", referencedColumnName = "id")
    private ClienteEntity clienteEntity;
    @ManyToOne
    @JoinColumn(name = "id_estado_fk", referencedColumnName = "id")
    private EstadoEntity estadoEntity;

    public Long getIdOrden() {
        return this.idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EmpleadoEntity getEmpleadoEntity() {
        return this.empleadoEntity;
    }

    public void setEmpleadoEntity(EmpleadoEntity empleadoEntity) {
        this.empleadoEntity = empleadoEntity;
    }

    public ClienteEntity getClienteEntity() {
        return this.clienteEntity;
    }

    public void setClienteEntity(ClienteEntity clienteEntity) {
        this.clienteEntity = clienteEntity;
    }

    public EstadoEntity getEstadoEntity() {
        return this.estadoEntity;
    }

    public void setEstadoEntity(EstadoEntity estadoEntity) {
        this.estadoEntity = estadoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idOrden='" + getIdOrden() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", empleadoEntity='" + getEmpleadoEntity() + "'" +
                ", clienteEntity='" + getClienteEntity() + "'" +
                ", estadoEntity='" + getEstadoEntity() + "'" +
                "}";
    }

}
