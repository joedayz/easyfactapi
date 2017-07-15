package pe.joedayz.easyfact.domain.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;

@MappedSuperclass
public class AuditingEntity implements BaseEntity {
    private String creador;

    private Date fechaCreacion;

    private String actualizador;

    private Date fechaActualizacion;

    private Long rowVersion;

    @Column(name = "creador")
    public String getCreador() {
        return this.creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Column(name = "fechaCreacion")
    public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "actualizador")
	public String getActualizador() {
		return actualizador;
	}

	public void setActualizador(String actualizador) {
		this.actualizador = actualizador;
	}

	@Column(name = "fechaActualizacion")
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Version
    @Column(name = "rowVersion")
    public Long getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
    }
}
