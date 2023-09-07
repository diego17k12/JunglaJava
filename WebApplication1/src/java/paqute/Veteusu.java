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
@Table(name = "veteusu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veteusu.findAll", query = "SELECT v FROM Veteusu v")
    , @NamedQuery(name = "Veteusu.findByIdVeteUsu", query = "SELECT v FROM Veteusu v WHERE v.idVeteUsu = :idVeteUsu")})
public class Veteusu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVeteUsu")
    private Integer idVeteUsu;
    @JoinColumn(name = "id_usu", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Usuario idUsu;
    @JoinColumn(name = "id_veterinario", referencedColumnName = "id_Asis")
    @ManyToOne(optional = false)
    private Veterinario idVeterinario;

    public Veteusu() {
    }

    public Veteusu(Integer idVeteUsu) {
        this.idVeteUsu = idVeteUsu;
    }

    public Integer getIdVeteUsu() {
        return idVeteUsu;
    }

    public void setIdVeteUsu(Integer idVeteUsu) {
        this.idVeteUsu = idVeteUsu;
    }

    public Usuario getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Usuario idUsu) {
        this.idUsu = idUsu;
    }

    public Veterinario getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Veterinario idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeteUsu != null ? idVeteUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veteusu)) {
            return false;
        }
        Veteusu other = (Veteusu) object;
        if ((this.idVeteUsu == null && other.idVeteUsu != null) || (this.idVeteUsu != null && !this.idVeteUsu.equals(other.idVeteUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Veteusu[ idVeteUsu=" + idVeteUsu + " ]";
    }
    
}
