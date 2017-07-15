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
@Table(name = "parametros")
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p"),
    @NamedQuery(name = "Parametros.findByIdparametros", query = "SELECT p FROM Parametros p WHERE p.idparametros = :idparametros"),
    @NamedQuery(name = "Parametros.findByRuc", query = "SELECT p FROM Parametros p WHERE p.ruc = :ruc"),
    @NamedQuery(name = "Parametros.findByCodParametro", query = "SELECT p FROM Parametros p WHERE p.codParametro = :codParametro"),
    @NamedQuery(name = "Parametros.findByDescripcion", query = "SELECT p FROM Parametros p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Parametros.findByValor", query = "SELECT p FROM Parametros p WHERE p.valor = :valor")})
public class Parametros extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparametros")
    private Integer idparametros;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "cod_parametro")
    private String codParametro;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valor")
    private String valor;

    public Parametros() {
    }

    public Parametros(Integer idparametros) {
        this.idparametros = idparametros;
    }

    public Integer getIdparametros() {
        return idparametros;
    }

    public void setIdparametros(Integer idparametros) {
        this.idparametros = idparametros;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCodParametro() {
        return codParametro;
    }

    public void setCodParametro(String codParametro) {
        this.codParametro = codParametro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparametros != null ? idparametros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametros)) {
            return false;
        }
        Parametros other = (Parametros) object;
        if ((this.idparametros == null && other.idparametros != null) || (this.idparametros != null && !this.idparametros.equals(other.idparametros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Parametros[ idparametros=" + idparametros + " ]";
    }
    
}
