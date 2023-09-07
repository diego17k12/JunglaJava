/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqute;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "veterinario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veterinario.findAll", query = "SELECT v FROM Veterinario v")
    , @NamedQuery(name = "Veterinario.findByIdAsis", query = "SELECT v FROM Veterinario v WHERE v.idAsis = :idAsis")
    , @NamedQuery(name = "Veterinario.findByNombre", query = "SELECT v FROM Veterinario v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Veterinario.findByApellido", query = "SELECT v FROM Veterinario v WHERE v.apellido = :apellido")
    , @NamedQuery(name = "Veterinario.findByDireccion", query = "SELECT v FROM Veterinario v WHERE v.direccion = :direccion")
    , @NamedQuery(name = "Veterinario.findByTelefono", query = "SELECT v FROM Veterinario v WHERE v.telefono = :telefono")
    , @NamedQuery(name = "Veterinario.findByCorreo", query = "SELECT v FROM Veterinario v WHERE v.correo = :correo")
    , @NamedQuery(name = "Veterinario.findByCedula", query = "SELECT v FROM Veterinario v WHERE v.cedula = :cedula")})
public class Veterinario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Asis")
    private Integer idAsis;
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
    @Size(min = 1, max = 11)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula")
    private int cedula;
    @OneToMany(mappedBy = "idAsis")
    private Collection<Cliente> clienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVeterinario")
    private Collection<Citas> citasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVeterinario")
    private Collection<Veteusu> veteusuCollection;

    public Veterinario() {
    }

    public Veterinario(Integer idAsis) {
        this.idAsis = idAsis;
    }

    public Veterinario(Integer idAsis, String nombre, String apellido, String telefono, int cedula) {
        this.idAsis = idAsis;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public Integer getIdAsis() {
        return idAsis;
    }

    public void setIdAsis(Integer idAsis) {
        this.idAsis = idAsis;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @XmlTransient
    public Collection<Citas> getCitasCollection() {
        return citasCollection;
    }

    public void setCitasCollection(Collection<Citas> citasCollection) {
        this.citasCollection = citasCollection;
    }

    @XmlTransient
    public Collection<Veteusu> getVeteusuCollection() {
        return veteusuCollection;
    }

    public void setVeteusuCollection(Collection<Veteusu> veteusuCollection) {
        this.veteusuCollection = veteusuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsis != null ? idAsis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veterinario)) {
            return false;
        }
        Veterinario other = (Veterinario) object;
        if ((this.idAsis == null && other.idAsis != null) || (this.idAsis != null && !this.idAsis.equals(other.idAsis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Veterinario[ idAsis=" + idAsis + " ]";
    }
    
}
