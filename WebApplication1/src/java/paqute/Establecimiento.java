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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "establecimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Establecimiento.findAll", query = "SELECT e FROM Establecimiento e")
    , @NamedQuery(name = "Establecimiento.findByIdEstablecimiento", query = "SELECT e FROM Establecimiento e WHERE e.idEstablecimiento = :idEstablecimiento")
    , @NamedQuery(name = "Establecimiento.findByNombre", query = "SELECT e FROM Establecimiento e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Establecimiento.findByDireccion", query = "SELECT e FROM Establecimiento e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Establecimiento.findByTelefono", query = "SELECT e FROM Establecimiento e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Establecimiento.findByCorreo", query = "SELECT e FROM Establecimiento e WHERE e.correo = :correo")})
public class Establecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Establecimiento")
    private Integer idEstablecimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Size(max = 100)
    @Column(name = "Correo")
    private String correo;

    public Establecimiento() {
    }

    public Establecimiento(Integer idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public Establecimiento(Integer idEstablecimiento, String nombre, int telefono) {
        this.idEstablecimiento = idEstablecimiento;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Integer getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Integer idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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
        hash += (idEstablecimiento != null ? idEstablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if ((this.idEstablecimiento == null && other.idEstablecimiento != null) || (this.idEstablecimiento != null && !this.idEstablecimiento.equals(other.idEstablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Establecimiento[ idEstablecimiento=" + idEstablecimiento + " ]";
    }
    
}
