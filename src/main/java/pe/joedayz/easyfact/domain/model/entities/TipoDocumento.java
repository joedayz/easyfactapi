package pe.joedayz.easyfact.domain.model.entities;

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

import pe.joedayz.easyfact.domain.model.base.AuditingEntity;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "tipo_documento")
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t"),
    @NamedQuery(name = "TipoDocumento.findByIdeTipoDocumento", query = "SELECT t FROM TipoDocumento t WHERE t.ideTipoDocumento = :ideTipoDocumento"),
    @NamedQuery(name = "TipoDocumento.findByNombreDocu", query = "SELECT t FROM TipoDocumento t WHERE t.nombreDocu = :nombreDocu"),
    @NamedQuery(name = "TipoDocumento.findByDocuTipodocumento", query = "SELECT t FROM TipoDocumento t WHERE t.docuTipodocumento = :docuTipodocumento")})
public class TipoDocumento extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ide_tipo_documento")
    private Integer ideTipoDocumento;
    @Basic(optional = false)
    @Column(name = "nombre_docu")
    private String nombreDocu;
    @Basic(optional = false)
    @Column(name = "docu_tipodocumento")
    private String docuTipodocumento;

    public TipoDocumento() {
    }

    public TipoDocumento(Integer ideTipoDocumento) {
        this.ideTipoDocumento = ideTipoDocumento;
    }

    public TipoDocumento(Integer ideTipoDocumento, String nombreDocu, String docuTipodocumento) {
        this.ideTipoDocumento = ideTipoDocumento;
        this.nombreDocu = nombreDocu;
        this.docuTipodocumento = docuTipodocumento;
    }

    public Integer getIdeTipoDocumento() {
        return ideTipoDocumento;
    }

    public void setIdeTipoDocumento(Integer ideTipoDocumento) {
        this.ideTipoDocumento = ideTipoDocumento;
    }

    public String getNombreDocu() {
        return nombreDocu;
    }

    public void setNombreDocu(String nombreDocu) {
        this.nombreDocu = nombreDocu;
    }

    public String getDocuTipodocumento() {
        return docuTipodocumento;
    }

    public void setDocuTipodocumento(String docuTipodocumento) {
        this.docuTipodocumento = docuTipodocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideTipoDocumento != null ? ideTipoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumento)) {
            return false;
        }
        TipoDocumento other = (TipoDocumento) object;
        if ((this.ideTipoDocumento == null && other.ideTipoDocumento != null) || (this.ideTipoDocumento != null && !this.ideTipoDocumento.equals(other.ideTipoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.TipoDocumento[ ideTipoDocumento=" + ideTipoDocumento + " ]";
    }
    
}
