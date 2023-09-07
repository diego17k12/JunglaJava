/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqute;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "dueno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dueno.findAll", query = "SELECT d FROM Dueno d")
    , @NamedQuery(name = "Dueno.findByIdDueno", query = "SELECT d FROM Dueno d WHERE d.idDueno = :idDueno")
    , @NamedQuery(name = "Dueno.findByNombre", query = "SELECT d FROM Dueno d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Dueno.findByApellido", query = "SELECT d FROM Dueno d WHERE d.apellido = :apellido")
    , @NamedQuery(name = "Dueno.findByDireccion", query = "SELECT d FROM Dueno d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Dueno.findByCelular", query = "SELECT d FROM Dueno d WHERE d.celular = :celular")
    , @NamedQuery(name = "Dueno.findByCorreo", query = "SELECT d FROM Dueno d WHERE d.correo = :correo")})
public class Dueno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_dueno")
    private Integer idDueno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 50)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Celular")
    private int celular;
    @Size(max = 100)
    @Column(name = "Correo")
    private String correo;

    public Dueno() {
    }

    public Dueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public Dueno(Integer idDueno, String nombre, String apellido, int celular) {
        this.idDueno = idDueno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public Integer getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDueno != null ? idDueno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dueno)) {
            return false;
        }
        Dueno other = (Dueno) object;
        if ((this.idDueno == null && other.idDueno != null) || (this.idDueno != null && !this.idDueno.equals(other.idDueno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Dueno[ idDueno=" + idDueno + " ]";
    }
    
}
