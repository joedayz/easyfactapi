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
@Table(name = "resumendia_baja")
@NamedQueries({
    @NamedQuery(name = "ResumendiaBaja.findAll", query = "SELECT r FROM ResumendiaBaja r"),
    @NamedQuery(name = "ResumendiaBaja.findByCodigo", query = "SELECT r FROM ResumendiaBaja r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "ResumendiaBaja.findByEmprRazonsocial", query = "SELECT r FROM ResumendiaBaja r WHERE r.emprRazonsocial = :emprRazonsocial"),
    @NamedQuery(name = "ResumendiaBaja.findByEmprNroruc", query = "SELECT r FROM ResumendiaBaja r WHERE r.emprNroruc = :emprNroruc"),
    @NamedQuery(name = "ResumendiaBaja.findByResuFechaDoc", query = "SELECT r FROM ResumendiaBaja r WHERE r.resuFechaDoc = :resuFechaDoc"),
    @NamedQuery(name = "ResumendiaBaja.findByResuIdentificador", query = "SELECT r FROM ResumendiaBaja r WHERE r.resuIdentificador = :resuIdentificador"),
    @NamedQuery(name = "ResumendiaBaja.findByResuFechaCom", query = "SELECT r FROM ResumendiaBaja r WHERE r.resuFechaCom = :resuFechaCom"),
    @NamedQuery(name = "ResumendiaBaja.findByResuTipo", query = "SELECT r FROM ResumendiaBaja r WHERE r.resuTipo = :resuTipo"),
    @NamedQuery(name = "ResumendiaBaja.findByNroticket", query = "SELECT r FROM ResumendiaBaja r WHERE r.nroticket = :nroticket"),
    @NamedQuery(name = "ResumendiaBaja.findByResuProceStatus", query = "SELECT r FROM ResumendiaBaja r WHERE r.resuProceStatus = :resuProceStatus")})
public class ResumendiaBaja extends AuditingEntity implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "resu_tipo")
    private String resuTipo;
    @Column(name = "nroticket")
    private String nroticket;
    @Column(name = "resu_proce_status")
    private String resuProceStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigo")
    private List<Comunicabaja> comunicabajaList;

    public ResumendiaBaja() {
    }

    public ResumendiaBaja(Integer codigo) {
        this.codigo = codigo;
    }

    public ResumendiaBaja(Integer codigo, String resuTipo) {
        this.codigo = codigo;
        this.resuTipo = resuTipo;
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

    public List<Comunicabaja> getComunicabajaList() {
        return comunicabajaList;
    }

    public void setComunicabajaList(List<Comunicabaja> comunicabajaList) {
        this.comunicabajaList = comunicabajaList;
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
        if (!(object instanceof ResumendiaBaja)) {
            return false;
        }
        ResumendiaBaja other = (ResumendiaBaja) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.ResumendiaBaja[ codigo=" + codigo + " ]";
    }
    
}
