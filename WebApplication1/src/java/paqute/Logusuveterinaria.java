/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqute;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "logusuveterinaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logusuveterinaria.findAll", query = "SELECT l FROM Logusuveterinaria l")
    , @NamedQuery(name = "Logusuveterinaria.findById", query = "SELECT l FROM Logusuveterinaria l WHERE l.id = :id")
    , @NamedQuery(name = "Logusuveterinaria.findByFecha", query = "SELECT l FROM Logusuveterinaria l WHERE l.fecha = :fecha")
    , @NamedQuery(name = "Logusuveterinaria.findByHora", query = "SELECT l FROM Logusuveterinaria l WHERE l.hora = :hora")
    , @NamedQuery(name = "Logusuveterinaria.findByNombreUsuario", query = "SELECT l FROM Logusuveterinaria l WHERE l.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Logusuveterinaria.findByEstado", query = "SELECT l FROM Logusuveterinaria l WHERE l.estado = :estado")
    , @NamedQuery(name = "Logusuveterinaria.findByFormulario", query = "SELECT l FROM Logusuveterinaria l WHERE l.formulario = :formulario")})
public class Logusuveterinaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    @Size(max = 20)
    @Column(name = "Estado")
    private String estado;
    @Size(max = 70)
    @Column(name = "Formulario")
    private String formulario;

    public Logusuveterinaria() {
    }

    public Logusuveterinaria(Integer id) {
        this.id = id;
    }

    public Logusuveterinaria(Integer id, Date fecha, Date hora, String nombreUsuario) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logusuveterinaria)) {
            return false;
        }
        Logusuveterinaria other = (Logusuveterinaria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Logusuveterinaria[ id=" + id + " ]";
    }
    
}
