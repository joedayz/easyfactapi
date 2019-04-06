/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jdiazd
 */
@Entity
@Table(name = "leyenda")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Leyenda.findAll", query = "SELECT l FROM Leyenda l")
        , @NamedQuery(name = "Leyenda.findByIdLeyenda", query = "SELECT l FROM Leyenda l WHERE l.idLeyenda = :idLeyenda")
        , @NamedQuery(name = "Leyenda.findByLeyendaCodigo", query = "SELECT l FROM Leyenda l WHERE l.leyendaCodigo = :leyendaCodigo")
        , @NamedQuery(name = "Leyenda.findByLeyendaTexto", query = "SELECT l FROM Leyenda l WHERE l.leyendaTexto = :leyendaTexto")})
public class Leyenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_leyenda")
    private Integer idLeyenda;
    @Basic(optional = false)
    @Column(name = "leyenda_codigo")
    private String leyendaCodigo;
    @Basic(optional = false)
    @Column(name = "leyenda_texto")
    private String leyendaTexto;
    @JoinColumn(name = "docu_codigo", referencedColumnName = "docu_codigo")
    @ManyToOne(optional = false)
    private Cabecera docuCodigo;

    public Leyenda() {
    }

    public Leyenda(Integer idLeyenda) {
        this.idLeyenda = idLeyenda;
    }

    public Leyenda(Integer idLeyenda, String leyendaCodigo, String leyendaTexto) {
        this.idLeyenda = idLeyenda;
        this.leyendaCodigo = leyendaCodigo;
        this.leyendaTexto = leyendaTexto;
    }

    public Integer getIdLeyenda() {
        return idLeyenda;
    }

    public void setIdLeyenda(Integer idLeyenda) {
        this.idLeyenda = idLeyenda;
    }

    public String getLeyendaCodigo() {
        return leyendaCodigo;
    }

    public void setLeyendaCodigo(String leyendaCodigo) {
        this.leyendaCodigo = leyendaCodigo;
    }

    public String getLeyendaTexto() {
        return leyendaTexto;
    }

    public void setLeyendaTexto(String leyendaTexto) {
        this.leyendaTexto = leyendaTexto;
    }

    public Cabecera getDocuCodigo() {
        return docuCodigo;
    }

    public void setDocuCodigo(Cabecera docuCodigo) {
        this.docuCodigo = docuCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLeyenda != null ? idLeyenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leyenda)) {
            return false;
        }
        Leyenda other = (Leyenda) object;
        if ((this.idLeyenda == null && other.idLeyenda != null) || (this.idLeyenda != null && !this.idLeyenda.equals(other.idLeyenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.joedayz.kallpa.model.Leyenda[ idLeyenda=" + idLeyenda + " ]";
    }

}
