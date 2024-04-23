package com.jaider.backendvizyon.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDate;

@JsonInclude(Include.NON_EMPTY)
public class VentaDTO {

    private Long idVenta;
    private LocalDate fecha;
    private EmpleadoDTO empleado;
    private ClienteDTO cliente;
    private FormaPagoDTO formaPago;

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EmpleadoDTO getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoDTO empleado) {
        this.empleado = empleado;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public FormaPagoDTO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPagoDTO formaPago) {
        this.formaPago = formaPago;
    }
}
