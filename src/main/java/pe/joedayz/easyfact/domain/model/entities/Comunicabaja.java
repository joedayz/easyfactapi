package pe.joedayz.easyfact.domain.model.entities;

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

import pe.joedayz.easyfact.domain.model.base.AuditingEntity;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "comunicabaja")
@NamedQueries({
    @NamedQuery(name = "Comunicabaja.findAll", query = "SELECT c FROM Comunicabaja c"),
    @NamedQuery(name = "Comunicabaja.findByIdcomunicabaja", query = "SELECT c FROM Comunicabaja c WHERE c.idcomunicabaja = :idcomunicabaja"),
    @NamedQuery(name = "Comunicabaja.findByResuFecha", query = "SELECT c FROM Comunicabaja c WHERE c.resuFecha = :resuFecha"),
    @NamedQuery(name = "Comunicabaja.findByResuFila", query = "SELECT c FROM Comunicabaja c WHERE c.resuFila = :resuFila"),
    @NamedQuery(name = "Comunicabaja.findByResuTipodoc", query = "SELECT c FROM Comunicabaja c WHERE c.resuTipodoc = :resuTipodoc"),
    @NamedQuery(name = "Comunicabaja.findByResuSerie", query = "SELECT c FROM Comunicabaja c WHERE c.resuSerie = :resuSerie"),
    @NamedQuery(name = "Comunicabaja.findByResuNumero", query = "SELECT c FROM Comunicabaja c WHERE c.resuNumero = :resuNumero"),
    @NamedQuery(name = "Comunicabaja.findByResuMotivo", query = "SELECT c FROM Comunicabaja c WHERE c.resuMotivo = :resuMotivo"),
    @NamedQuery(name = "Comunicabaja.findByResuIdentificador", query = "SELECT c FROM Comunicabaja c WHERE c.resuIdentificador = :resuIdentificador")})
public class Comunicabaja extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomunicabaja")
    private Integer idcomunicabaja;
    @Column(name = "resu_fecha")
    private String resuFecha;
    @Column(name = "resu_fila")
    private String resuFila;
    @Column(name = "resu_tipodoc")
    private String resuTipodoc;
    @Column(name = "resu_serie")
    private String resuSerie;
    @Column(name = "resu_numero")
    private String resuNumero;
    @Column(name = "resu_motivo")
    private String resuMotivo;
    @Column(name = "resu_identificador")
    private String resuIdentificador;
    @JoinColumn(name = "codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private ResumendiaBaja codigo;

    public Comunicabaja() {
    }

    public Comunicabaja(Integer idcomunicabaja) {
        this.idcomunicabaja = idcomunicabaja;
    }

    public Integer getIdcomunicabaja() {
        return idcomunicabaja;
    }

    public void setIdcomunicabaja(Integer idcomunicabaja) {
        this.idcomunicabaja = idcomunicabaja;
    }

    public String getResuFecha() {
        return resuFecha;
    }

    public void setResuFecha(String resuFecha) {
        this.resuFecha = resuFecha;
    }

    public String getResuFila() {
        return resuFila;
    }

    public void setResuFila(String resuFila) {
        this.resuFila = resuFila;
    }

    public String getResuTipodoc() {
        return resuTipodoc;
    }

    public void setResuTipodoc(String resuTipodoc) {
        this.resuTipodoc = resuTipodoc;
    }

    public String getResuSerie() {
        return resuSerie;
    }

    public void setResuSerie(String resuSerie) {
        this.resuSerie = resuSerie;
    }

    public String getResuNumero() {
        return resuNumero;
    }

    public void setResuNumero(String resuNumero) {
        this.resuNumero = resuNumero;
    }

    public String getResuMotivo() {
        return resuMotivo;
    }

    public void setResuMotivo(String resuMotivo) {
        this.resuMotivo = resuMotivo;
    }

    public String getResuIdentificador() {
        return resuIdentificador;
    }

    public void setResuIdentificador(String resuIdentificador) {
        this.resuIdentificador = resuIdentificador;
    }

    public ResumendiaBaja getCodigo() {
        return codigo;
    }

    public void setCodigo(ResumendiaBaja codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomunicabaja != null ? idcomunicabaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comunicabaja)) {
            return false;
        }
        Comunicabaja other = (Comunicabaja) object;
        if ((this.idcomunicabaja == null && other.idcomunicabaja != null) || (this.idcomunicabaja != null && !this.idcomunicabaja.equals(other.idcomunicabaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Comunicabaja[ idcomunicabaja=" + idcomunicabaja + " ]";
    }
    
}
