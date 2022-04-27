package edu.elp.FranCuro.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dirrecion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long iddireccion;
    private String calle;
    private String ciudad;
    private String estado;
    private String codigopostal;
    private String pais;
    @OneToMany(mappedBy = "direccion")
    private List<Estudiante> estudiantelis;

    public Direccion() {
    }

    public Long getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Estudiante> getEstudiantelis() {
        return estudiantelis;
    }

    public void setEstudiantelis(List<Estudiante> estudiantelis) {
        this.estudiantelis = estudiantelis;
    }
}
