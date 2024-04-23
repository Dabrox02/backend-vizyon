package com.jaider.backendvizyon.persistence.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class OrdenDTO {

    private Long idOrden;
    private LocalDate fecha;
    private EmpleadoDTO empleado;
    private ClienteDTO cliente;
    private EstadoDTO estado;

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

    public EmpleadoDTO getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(EmpleadoDTO empleado) {
        this.empleado = empleado;
    }

    public ClienteDTO getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public EstadoDTO getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

}
