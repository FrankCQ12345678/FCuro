package edu.elp.FranCuro.entity;

import javax.persistence.*;

@Entity
@Table(name ="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante {
    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 8)
    private String serie;
    @ManyToOne(optional = false, cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    private Direccion direccion;
    public Estudiante() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
