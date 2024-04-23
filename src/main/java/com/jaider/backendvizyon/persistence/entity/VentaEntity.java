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
@Table(name = "venta")
public class VentaEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_empleado_fk", referencedColumnName = "id")
    private EmpleadoEntity empleadoEntity;
    @ManyToOne
    @JoinColumn(name = "id_cliente_fk", referencedColumnName = "id")
    private ClienteEntity clienteEntity;
    @ManyToOne
    @JoinColumn(name = "id_forma_pago_fk", referencedColumnName = "id")
    private FormaPagoEntity formaPagoEntity;

    public Long getIdVenta() {
        return this.idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
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

    public FormaPagoEntity getFormaPagoEntity() {
        return this.formaPagoEntity;
    }

    public void setFormaPagoEntity(FormaPagoEntity formaPagoEntity) {
        this.formaPagoEntity = formaPagoEntity;
    }

    @Override
    public String toString() {
        return "{" +
                " idVenta='" + getIdVenta() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", empleadoEntity='" + getEmpleadoEntity() + "'" +
                ", clienteEntity='" + getClienteEntity() + "'" +
                ", formaPagoEntity='" + getFormaPagoEntity() + "'" +
                "}";
    }

}
