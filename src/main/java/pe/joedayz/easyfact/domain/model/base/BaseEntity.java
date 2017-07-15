package pe.joedayz.easyfact.domain.model.base;

import java.util.Date;

/**
 * Created by josediaz on 10/10/2016.
 */
public interface BaseEntity {

    public String getCreador();

    public void setCreador(String creador);

    public Date getFechaCreacion() ;

    public void setFechaCreacion(Date fechaCreacion);

    public String getActualizador();

    public void setActualizador(String actualizador);

    public Date getFechaActualizacion();

    public void setFechaActualizacion(Date fechaActualizacion);
}
