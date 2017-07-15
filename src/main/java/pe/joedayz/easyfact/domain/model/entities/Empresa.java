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
@Table(name = "empresa")
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByIdeEmpresa", query = "SELECT e FROM Empresa e WHERE e.ideEmpresa = :ideEmpresa"),
    @NamedQuery(name = "Empresa.findByEmprRuc", query = "SELECT e FROM Empresa e WHERE e.emprRuc = :emprRuc"),
    @NamedQuery(name = "Empresa.findByEmprRazonSocial", query = "SELECT e FROM Empresa e WHERE e.emprRazonSocial = :emprRazonSocial"),
    @NamedQuery(name = "Empresa.findByEmprTipo", query = "SELECT e FROM Empresa e WHERE e.emprTipo = :emprTipo")})
public class Empresa extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ide_empresa")
    private Integer ideEmpresa;
    @Column(name = "empr_ruc")
    private String emprRuc;
    @Column(name = "empr_razon_social")
    private String emprRazonSocial;
    @Column(name = "empr_tipo")
    private String emprTipo;

    public Empresa() {
    }

    public Empresa(Integer ideEmpresa) {
        this.ideEmpresa = ideEmpresa;
    }

    public Integer getIdeEmpresa() {
        return ideEmpresa;
    }

    public void setIdeEmpresa(Integer ideEmpresa) {
        this.ideEmpresa = ideEmpresa;
    }

    public String getEmprRuc() {
        return emprRuc;
    }

    public void setEmprRuc(String emprRuc) {
        this.emprRuc = emprRuc;
    }

    public String getEmprRazonSocial() {
        return emprRazonSocial;
    }

    public void setEmprRazonSocial(String emprRazonSocial) {
        this.emprRazonSocial = emprRazonSocial;
    }

    public String getEmprTipo() {
        return emprTipo;
    }

    public void setEmprTipo(String emprTipo) {
        this.emprTipo = emprTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideEmpresa != null ? ideEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.ideEmpresa == null && other.ideEmpresa != null) || (this.ideEmpresa != null && !this.ideEmpresa.equals(other.ideEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Empresa[ ideEmpresa=" + ideEmpresa + " ]";
    }
    
}
