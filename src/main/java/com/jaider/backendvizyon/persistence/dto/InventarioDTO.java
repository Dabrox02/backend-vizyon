package com.jaider.backendvizyon.persistence.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class InventarioDTO {
    private Long idInventario;
    private String codInv;
    private Double valorVtaCop;
    private Double valorVtaUsd;
    private PrendaDTO prenda;
    private List<TallaDTO> tallas;

    public Long getIdInventario() {
        return this.idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodInv() {
        return this.codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public Double getValorVtaCop() {
        return this.valorVtaCop;
    }

    public void setValorVtaCop(Double valorVtaCop) {
        this.valorVtaCop = valorVtaCop;
    }

    public Double getValorVtaUsd() {
        return this.valorVtaUsd;
    }

    public void setValorVtaUsd(Double valorVtaUsd) {
        this.valorVtaUsd = valorVtaUsd;
    }

    public PrendaDTO getPrenda() {
        return this.prenda;
    }

    public void setPrenda(PrendaDTO prenda) {
        this.prenda = prenda;
    }

    public List<TallaDTO> getTallas() {
        return this.tallas;
    }

    public void setTallas(List<TallaDTO> tallas) {
        this.tallas = tallas;
    }

    @Override
    public String toString() {
        return "{" +
                " idInventario='" + getIdInventario() + "'" +
                ", codInv='" + getCodInv() + "'" +
                ", valorVtaCop='" + getValorVtaCop() + "'" +
                ", valorVtaUsd='" + getValorVtaUsd() + "'" +
                ", prenda='" + getPrenda() + "'" +
                ", tallas='" + getTallas() + "'" +
                "}";
    }

}
