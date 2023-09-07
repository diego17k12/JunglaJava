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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c")
    , @NamedQuery(name = "Citas.findByIdCitas", query = "SELECT c FROM Citas c WHERE c.idCitas = :idCitas")
    , @NamedQuery(name = "Citas.findByFechaCitas", query = "SELECT c FROM Citas c WHERE c.fechaCitas = :fechaCitas")
    , @NamedQuery(name = "Citas.findByTipoServicio", query = "SELECT c FROM Citas c WHERE c.tipoServicio = :tipoServicio")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCitas")
    private Integer idCitas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCitas")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCitas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TipoServicio")
    private String tipoServicio;
    @JoinColumn(name = "id_Veterinario", referencedColumnName = "id_Asis")
    @ManyToOne(optional = false)
    private Veterinario idVeterinario;
    @JoinColumn(name = "id_Mascota", referencedColumnName = "id_Mascota")
    @ManyToOne(optional = false)
    private Mascota idMascota;

    public Citas() {
    }

    public Citas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Citas(Integer idCitas, Date fechaCitas, String tipoServicio) {
        this.idCitas = idCitas;
        this.fechaCitas = fechaCitas;
        this.tipoServicio = tipoServicio;
    }

    public Integer getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Date getFechaCitas() {
        return fechaCitas;
    }

    public void setFechaCitas(Date fechaCitas) {
        this.fechaCitas = fechaCitas;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Veterinario getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Veterinario idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCitas != null ? idCitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.idCitas == null && other.idCitas != null) || (this.idCitas != null && !this.idCitas.equals(other.idCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paqute.Citas[ idCitas=" + idCitas + " ]";
    }
    
}
