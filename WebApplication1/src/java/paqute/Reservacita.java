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
@Table(name = "reservacita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacita.findAll", query = "SELECT r FROM Reservacita r")
    , @NamedQuery(name = "Reservacita.findByIdReserva", query = "SELECT r FROM Reservacita r WHERE r.idReserva = :idReserva")
    , @NamedQuery(name = "Reservacita.findByNombre", query = "SELECT r FROM Reservacita r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Reservacita.findByApellido", query = "SELECT r FROM Reservacita r WHERE r.apellido = :apellido")
    , @NamedQuery(name = "Reservacita.findByCorreo", query = "SELECT r FROM Reservacita r WHERE r.correo = :correo")
    , @NamedQuery(name = "Reservacita.findByTelefono", query = "SELECT r FROM Reservacita r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "Reservacita.findByNombreMascota", query = "SELECT r FROM Reservacita r WHERE r.nombreMascota = :nombreMascota")
    , @NamedQuery(name = "Reservacita.findByTipoMascota", query = "SELECT r FROM Reservacita r WHERE r.tipoMascota = :tipoMascota")
    , @NamedQuery(name = "Reservacita.findByTipoServicio", query = "SELECT r FROM Reservacita r WHERE r.tipoServicio = :tipoServicio")
    , @NamedQuery(name = "Reservacita.findByEstado", query = "SELECT r FROM Reservacita r WHERE r.estado = :estado")})
public class Reservacita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReserva")
    private Integer idReserva;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreMascota")
    private String nombreMascota;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipoMascota")
    private String tipoMascota;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipoServicio")
    private String tipoServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "estado")
    private String estado;

    public Reservacita() {
    }

    public Reservacita(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Reservacita(Integer idReserva, String nombre, String apellido, String correo, String telefono, String nombreMascota, String tipoMascota, String tipoServicio, String estado) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.tipoServicio = tipoServicio;
        this.estado = estado;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacita)) {
            return false;
        }
        Reservacita other = (Reservacita) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Reservacita[ idReserva=" + idReserva + " ]";
    }
    
}
