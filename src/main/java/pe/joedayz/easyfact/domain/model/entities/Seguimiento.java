package pe.joedayz.easyfact.domain.model.entities;

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

import pe.joedayz.easyfact.domain.model.base.AuditingEntity;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "seguimiento")
@NamedQueries({
    @NamedQuery(name = "Seguimiento.findAll", query = "SELECT s FROM Seguimiento s"),
    @NamedQuery(name = "Seguimiento.findByIdseguimiento", query = "SELECT s FROM Seguimiento s WHERE s.idseguimiento = :idseguimiento"),
    @NamedQuery(name = "Seguimiento.findByDocuCodigo", query = "SELECT s FROM Seguimiento s WHERE s.docuCodigo = :docuCodigo"),
    @NamedQuery(name = "Seguimiento.findByFechaSeguimiento", query = "SELECT s FROM Seguimiento s WHERE s.fechaSeguimiento = :fechaSeguimiento"),
    @NamedQuery(name = "Seguimiento.findByEstadoSeguimiento", query = "SELECT s FROM Seguimiento s WHERE s.estadoSeguimiento = :estadoSeguimiento")})
public class Seguimiento extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idseguimiento")
    private Integer idseguimiento;
    @Column(name = "docu_codigo")
    private Integer docuCodigo;
    @Column(name = "fecha_seguimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSeguimiento;
    @Column(name = "estado_seguimiento")
    private String estadoSeguimiento;

    public Seguimiento() {
    }

    public Seguimiento(Integer idseguimiento) {
        this.idseguimiento = idseguimiento;
    }

    public Integer getIdseguimiento() {
        return idseguimiento;
    }

    public void setIdseguimiento(Integer idseguimiento) {
        this.idseguimiento = idseguimiento;
    }

    public Integer getDocuCodigo() {
        return docuCodigo;
    }

    public void setDocuCodigo(Integer docuCodigo) {
        this.docuCodigo = docuCodigo;
    }

    public Date getFechaSeguimiento() {
        return fechaSeguimiento;
    }

    public void setFechaSeguimiento(Date fechaSeguimiento) {
        this.fechaSeguimiento = fechaSeguimiento;
    }

    public String getEstadoSeguimiento() {
        return estadoSeguimiento;
    }

    public void setEstadoSeguimiento(String estadoSeguimiento) {
        this.estadoSeguimiento = estadoSeguimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idseguimiento != null ? idseguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguimiento)) {
            return false;
        }
        Seguimiento other = (Seguimiento) object;
        if ((this.idseguimiento == null && other.idseguimiento != null) || (this.idseguimiento != null && !this.idseguimiento.equals(other.idseguimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Seguimiento[ idseguimiento=" + idseguimiento + " ]";
    }
    
}
