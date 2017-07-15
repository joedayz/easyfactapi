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
@Table(name = "detalle_otro")
@NamedQueries({
    @NamedQuery(name = "DetalleOtro.findAll", query = "SELECT d FROM DetalleOtro d"),
    @NamedQuery(name = "DetalleOtro.findByIddetalleOtro", query = "SELECT d FROM DetalleOtro d WHERE d.iddetalleOtro = :iddetalleOtro"),
    @NamedQuery(name = "DetalleOtro.findByMotor", query = "SELECT d FROM DetalleOtro d WHERE d.motor = :motor"),
    @NamedQuery(name = "DetalleOtro.findByChasis", query = "SELECT d FROM DetalleOtro d WHERE d.chasis = :chasis"),
    @NamedQuery(name = "DetalleOtro.findByColor", query = "SELECT d FROM DetalleOtro d WHERE d.color = :color"),
    @NamedQuery(name = "DetalleOtro.findByFabricacion", query = "SELECT d FROM DetalleOtro d WHERE d.fabricacion = :fabricacion"),
    @NamedQuery(name = "DetalleOtro.findByMarca", query = "SELECT d FROM DetalleOtro d WHERE d.marca = :marca"),
    @NamedQuery(name = "DetalleOtro.findByModeloPeriodo", query = "SELECT d FROM DetalleOtro d WHERE d.modeloPeriodo = :modeloPeriodo"),
    @NamedQuery(name = "DetalleOtro.findByModelo", query = "SELECT d FROM DetalleOtro d WHERE d.modelo = :modelo")})
public class DetalleOtro extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle_otro")
    private Integer iddetalleOtro;
    @Column(name = "motor")
    private String motor;
    @Column(name = "chasis")
    private String chasis;
    @Column(name = "color")
    private String color;
    @Column(name = "fabricacion")
    private String fabricacion;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo_periodo")
    private String modeloPeriodo;
    @Column(name = "modelo")
    private String modelo;
    @JoinColumn(name = "iddetalle", referencedColumnName = "iddetalle")
    @ManyToOne(optional = false)
    private Detalle iddetalle;

    public DetalleOtro() {
    }

    public DetalleOtro(Integer iddetalleOtro) {
        this.iddetalleOtro = iddetalleOtro;
    }

    public Integer getIddetalleOtro() {
        return iddetalleOtro;
    }

    public void setIddetalleOtro(Integer iddetalleOtro) {
        this.iddetalleOtro = iddetalleOtro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloPeriodo() {
        return modeloPeriodo;
    }

    public void setModeloPeriodo(String modeloPeriodo) {
        this.modeloPeriodo = modeloPeriodo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Detalle getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(Detalle iddetalle) {
        this.iddetalle = iddetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleOtro != null ? iddetalleOtro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOtro)) {
            return false;
        }
        DetalleOtro other = (DetalleOtro) object;
        if ((this.iddetalleOtro == null && other.iddetalleOtro != null) || (this.iddetalleOtro != null && !this.iddetalleOtro.equals(other.iddetalleOtro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.DetalleOtro[ iddetalleOtro=" + iddetalleOtro + " ]";
    }
    
}
