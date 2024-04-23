package com.jaider.backendvizyon.persistence.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class ProveedorEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;

    private String nitProveedor;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_tipo_persona_fk", referencedColumnName = "Id")
    private TipoPersonaEntity tipoPersonaEntity;

    @ManyToOne
    @JoinColumn(name = "id_municipio_fk", referencedColumnName = "id")
    private MunicipioEntity municipioEntity;

    @ManyToMany
    @JoinTable(name = "insumo_proveedor", joinColumns = { @JoinColumn(name = "id_insumo_fk") }, inverseJoinColumns = {
            @JoinColumn(name = "id_proveedor_fk") })
    private List<InsumoEntity> insumos;

    public Long getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNitProveedor() {
        return this.nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                " idProveedor='" + getIdProveedor() + "'" +
                ", nitProveedor='" + getNitProveedor() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", tipoPersonaEntity='" + getTipoPersonaEntity() + "'" +
                ", municipioEntity='" + getMunicipioEntity() + "'" +
                "}";
    }

}
