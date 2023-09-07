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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "clieusu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clieusu.findAll", query = "SELECT c FROM Clieusu c")
    , @NamedQuery(name = "Clieusu.findByIdClieUsu", query = "SELECT c FROM Clieusu c WHERE c.idClieUsu = :idClieUsu")})
public class Clieusu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClieUsu")
    private Integer idClieUsu;
    @JoinColumn(name = "id_usuario", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "id_Cliente", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Cliente idCliente;

    public Clieusu() {
    }

    public Clieusu(Integer idClieUsu) {
        this.idClieUsu = idClieUsu;
    }

    public Integer getIdClieUsu() {
        return idClieUsu;
    }

    public void setIdClieUsu(Integer idClieUsu) {
        this.idClieUsu = idClieUsu;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClieUsu != null ? idClieUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clieusu)) {
            return false;
        }
        Clieusu other = (Clieusu) object;
        if ((this.idClieUsu == null && other.idClieUsu != null) || (this.idClieUsu != null && !this.idClieUsu.equals(other.idClieUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Clieusu[ idClieUsu=" + idClieUsu + " ]";
    }
    
}
