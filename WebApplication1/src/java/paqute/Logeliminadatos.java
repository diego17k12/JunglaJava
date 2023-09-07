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
@Table(name = "logeliminadatos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logeliminadatos.findAll", query = "SELECT l FROM Logeliminadatos l")
    , @NamedQuery(name = "Logeliminadatos.findById", query = "SELECT l FROM Logeliminadatos l WHERE l.id = :id")
    , @NamedQuery(name = "Logeliminadatos.findByUsuario", query = "SELECT l FROM Logeliminadatos l WHERE l.usuario = :usuario")
    , @NamedQuery(name = "Logeliminadatos.findByFecha", query = "SELECT l FROM Logeliminadatos l WHERE l.fecha = :fecha")
    , @NamedQuery(name = "Logeliminadatos.findByHora", query = "SELECT l FROM Logeliminadatos l WHERE l.hora = :hora")
    , @NamedQuery(name = "Logeliminadatos.findByRegistroEliminado", query = "SELECT l FROM Logeliminadatos l WHERE l.registroEliminado = :registroEliminado")})
public class Logeliminadatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Usuario")
    private String usuario;
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
    @Column(name = "registroEliminado")
    private String registroEliminado;

    public Logeliminadatos() {
    }

    public Logeliminadatos(Integer id) {
        this.id = id;
    }

    public Logeliminadatos(Integer id, String usuario, Date fecha, Date hora, String registroEliminado) {
        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
        this.registroEliminado = registroEliminado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getRegistroEliminado() {
        return registroEliminado;
    }

    public void setRegistroEliminado(String registroEliminado) {
        this.registroEliminado = registroEliminado;
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
        if (!(object instanceof Logeliminadatos)) {
            return false;
        }
        Logeliminadatos other = (Logeliminadatos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Logeliminadatos[ id=" + id + " ]";
    }
    
}
