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
@Table(name = "resumenboleta")
@NamedQueries({
    @NamedQuery(name = "Resumenboleta.findAll", query = "SELECT r FROM Resumenboleta r"),
    @NamedQuery(name = "Resumenboleta.findByIdresumenboleta", query = "SELECT r FROM Resumenboleta r WHERE r.idresumenboleta = :idresumenboleta"),
    @NamedQuery(name = "Resumenboleta.findByResuFecha", query = "SELECT r FROM Resumenboleta r WHERE r.resuFecha = :resuFecha"),
    @NamedQuery(name = "Resumenboleta.findByResuFila", query = "SELECT r FROM Resumenboleta r WHERE r.resuFila = :resuFila"),
    @NamedQuery(name = "Resumenboleta.findByResuTipodoc", query = "SELECT r FROM Resumenboleta r WHERE r.resuTipodoc = :resuTipodoc"),
    @NamedQuery(name = "Resumenboleta.findByResuSerie", query = "SELECT r FROM Resumenboleta r WHERE r.resuSerie = :resuSerie"),
    @NamedQuery(name = "Resumenboleta.findByResuInicio", query = "SELECT r FROM Resumenboleta r WHERE r.resuInicio = :resuInicio"),
    @NamedQuery(name = "Resumenboleta.findByResuFinal", query = "SELECT r FROM Resumenboleta r WHERE r.resuFinal = :resuFinal"),
    @NamedQuery(name = "Resumenboleta.findByResuGravada", query = "SELECT r FROM Resumenboleta r WHERE r.resuGravada = :resuGravada"),
    @NamedQuery(name = "Resumenboleta.findByResuExonerada", query = "SELECT r FROM Resumenboleta r WHERE r.resuExonerada = :resuExonerada"),
    @NamedQuery(name = "Resumenboleta.findByResuInafecta", query = "SELECT r FROM Resumenboleta r WHERE r.resuInafecta = :resuInafecta"),
    @NamedQuery(name = "Resumenboleta.findByResuOtcargos", query = "SELECT r FROM Resumenboleta r WHERE r.resuOtcargos = :resuOtcargos"),
    @NamedQuery(name = "Resumenboleta.findByResuIsc", query = "SELECT r FROM Resumenboleta r WHERE r.resuIsc = :resuIsc"),
    @NamedQuery(name = "Resumenboleta.findByResuIgv", query = "SELECT r FROM Resumenboleta r WHERE r.resuIgv = :resuIgv"),
    @NamedQuery(name = "Resumenboleta.findByResuOttributos", query = "SELECT r FROM Resumenboleta r WHERE r.resuOttributos = :resuOttributos"),
    @NamedQuery(name = "Resumenboleta.findByResuTotal", query = "SELECT r FROM Resumenboleta r WHERE r.resuTotal = :resuTotal")})
public class Resumenboleta extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresumenboleta")
    private Integer idresumenboleta;
    @Column(name = "resu_fecha")
    private String resuFecha;
    @Column(name = "resu_fila")
    private String resuFila;
    @Column(name = "resu_tipodoc")
    private String resuTipodoc;
    @Column(name = "resu_serie")
    private String resuSerie;
    @Column(name = "resu_inicio")
    private String resuInicio;
    @Column(name = "resu_final")
    private String resuFinal;
    @Column(name = "resu_gravada")
    private String resuGravada;
    @Column(name = "resu_exonerada")
    private String resuExonerada;
    @Column(name = "resu_inafecta")
    private String resuInafecta;
    @Column(name = "resu_otcargos")
    private String resuOtcargos;
    @Column(name = "resu_isc")
    private String resuIsc;
    @Column(name = "resu_igv")
    private String resuIgv;
    @Column(name = "resu_ottributos")
    private String resuOttributos;
    @Column(name = "resu_total")
    private String resuTotal;
    @JoinColumn(name = "codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private ResumendiaCab codigo;

    public Resumenboleta() {
    }

    public Resumenboleta(Integer idresumenboleta) {
        this.idresumenboleta = idresumenboleta;
    }

    public Integer getIdresumenboleta() {
        return idresumenboleta;
    }

    public void setIdresumenboleta(Integer idresumenboleta) {
        this.idresumenboleta = idresumenboleta;
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

    public String getResuInicio() {
        return resuInicio;
    }

    public void setResuInicio(String resuInicio) {
        this.resuInicio = resuInicio;
    }

    public String getResuFinal() {
        return resuFinal;
    }

    public void setResuFinal(String resuFinal) {
        this.resuFinal = resuFinal;
    }

    public String getResuGravada() {
        return resuGravada;
    }

    public void setResuGravada(String resuGravada) {
        this.resuGravada = resuGravada;
    }

    public String getResuExonerada() {
        return resuExonerada;
    }

    public void setResuExonerada(String resuExonerada) {
        this.resuExonerada = resuExonerada;
    }

    public String getResuInafecta() {
        return resuInafecta;
    }

    public void setResuInafecta(String resuInafecta) {
        this.resuInafecta = resuInafecta;
    }

    public String getResuOtcargos() {
        return resuOtcargos;
    }

    public void setResuOtcargos(String resuOtcargos) {
        this.resuOtcargos = resuOtcargos;
    }

    public String getResuIsc() {
        return resuIsc;
    }

    public void setResuIsc(String resuIsc) {
        this.resuIsc = resuIsc;
    }

    public String getResuIgv() {
        return resuIgv;
    }

    public void setResuIgv(String resuIgv) {
        this.resuIgv = resuIgv;
    }

    public String getResuOttributos() {
        return resuOttributos;
    }

    public void setResuOttributos(String resuOttributos) {
        this.resuOttributos = resuOttributos;
    }

    public String getResuTotal() {
        return resuTotal;
    }

    public void setResuTotal(String resuTotal) {
        this.resuTotal = resuTotal;
    }

    public ResumendiaCab getCodigo() {
        return codigo;
    }

    public void setCodigo(ResumendiaCab codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresumenboleta != null ? idresumenboleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resumenboleta)) {
            return false;
        }
        Resumenboleta other = (Resumenboleta) object;
        if ((this.idresumenboleta == null && other.idresumenboleta != null) || (this.idresumenboleta != null && !this.idresumenboleta.equals(other.idresumenboleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Resumenboleta[ idresumenboleta=" + idresumenboleta + " ]";
    }
    
}

