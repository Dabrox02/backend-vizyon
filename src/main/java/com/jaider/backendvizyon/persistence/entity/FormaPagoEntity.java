package com.jaider.backendvizyon.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forma_pago")
public class FormaPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idFormaPago;
    private String descripcion;

    public Long getIdFormaPago() {
        return this.idFormaPago;
    }

    public void setIdFormaPago(Long idFormaPago) {
        this.idFormaPago = idFormaPago;
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
                " idFormaPago='" + getIdFormaPago() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                "}";
    }

}
