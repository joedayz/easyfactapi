package pe.joedayz.easyfact.domain.model.entities;

import java.io.Serializable;
import java.util.List;
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

import pe.joedayz.easyfact.domain.model.base.AuditingEntity;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "resumendia_cab")
@NamedQueries({
    @NamedQuery(name = "ResumendiaCab.findAll", query = "SELECT r FROM ResumendiaCab r"),
    @NamedQuery(name = "ResumendiaCab.findByCodigo", query = "SELECT r FROM ResumendiaCab r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "ResumendiaCab.findByEmprRazonsocial", query = "SELECT r FROM ResumendiaCab r WHERE r.emprRazonsocial = :emprRazonsocial"),
    @NamedQuery(name = "ResumendiaCab.findByEmprNroruc", query = "SELECT r FROM ResumendiaCab r WHERE r.emprNroruc = :emprNroruc"),
    @NamedQuery(name = "ResumendiaCab.findByResuFechaDoc", query = "SELECT r FROM ResumendiaCab r WHERE r.resuFechaDoc = :resuFechaDoc"),
    @NamedQuery(name = "ResumendiaCab.findByResuIdentificador", query = "SELECT r FROM ResumendiaCab r WHERE r.resuIdentificador = :resuIdentificador"),
    @NamedQuery(name = "ResumendiaCab.findByResuFechaCom", query = "SELECT r FROM ResumendiaCab r WHERE r.resuFechaCom = :resuFechaCom"),
    @NamedQuery(name = "ResumendiaCab.findByResuTipo", query = "SELECT r FROM ResumendiaCab r WHERE r.resuTipo = :resuTipo"),
    @NamedQuery(name = "ResumendiaCab.findByNroticket", query = "SELECT r FROM ResumendiaCab r WHERE r.nroticket = :nroticket"),
    @NamedQuery(name = "ResumendiaCab.findByResuProceStatus", query = "SELECT r FROM ResumendiaCab r WHERE r.resuProceStatus = :resuProceStatus"),
    @NamedQuery(name = "ResumendiaCab.findByVersion", query = "SELECT r FROM ResumendiaCab r WHERE r.version = :version")})
public class ResumendiaCab extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "empr_razonsocial")
    private String emprRazonsocial;
    @Column(name = "empr_nroruc")
    private String emprNroruc;
    @Column(name = "resu_fecha_doc")
    private String resuFechaDoc;
    @Column(name = "resu_identificador")
    private String resuIdentificador;
    @Column(name = "resu_fecha_com")
    private String resuFechaCom;
    @Column(name = "resu_tipo")
    private String resuTipo;
    @Column(name = "nroticket")
    private String nroticket;
    @Column(name = "resu_proce_status")
    private String resuProceStatus;
    @Column(name = "version")
    private String version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigo")
    private List<Resumenboleta> resumenboletaList;

    public ResumendiaCab() {
    }

    public ResumendiaCab(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEmprRazonsocial() {
        return emprRazonsocial;
    }

    public void setEmprRazonsocial(String emprRazonsocial) {
        this.emprRazonsocial = emprRazonsocial;
    }

    public String getEmprNroruc() {
        return emprNroruc;
    }

    public void setEmprNroruc(String emprNroruc) {
        this.emprNroruc = emprNroruc;
    }

    public String getResuFechaDoc() {
        return resuFechaDoc;
    }

    public void setResuFechaDoc(String resuFechaDoc) {
        this.resuFechaDoc = resuFechaDoc;
    }

    public String getResuIdentificador() {
        return resuIdentificador;
    }

    public void setResuIdentificador(String resuIdentificador) {
        this.resuIdentificador = resuIdentificador;
    }

    public String getResuFechaCom() {
        return resuFechaCom;
    }

    public void setResuFechaCom(String resuFechaCom) {
        this.resuFechaCom = resuFechaCom;
    }

    public String getResuTipo() {
        return resuTipo;
    }

    public void setResuTipo(String resuTipo) {
        this.resuTipo = resuTipo;
    }

    public String getNroticket() {
        return nroticket;
    }

    public void setNroticket(String nroticket) {
        this.nroticket = nroticket;
    }

    public String getResuProceStatus() {
        return resuProceStatus;
    }

    public void setResuProceStatus(String resuProceStatus) {
        this.resuProceStatus = resuProceStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Resumenboleta> getResumenboletaList() {
        return resumenboletaList;
    }

    public void setResumenboletaList(List<Resumenboleta> resumenboletaList) {
        this.resumenboletaList = resumenboletaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResumendiaCab)) {
            return false;
        }
        ResumendiaCab other = (ResumendiaCab) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.ResumendiaCab[ codigo=" + codigo + " ]";
    }
    
}
