package pe.joedayz.easyfact.domain.model.repository.jdbc;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.joedayz.easyfact.dto.ComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronicoInterno;
import pe.joedayz.easyfact.support.WhereParams;

@Repository
public class ConsultaComprobanteElectronicoJdbcRepository {

	
	private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    DataSource dataSource;

    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
    private String getConsultaComprobanteElectronico(ConsultaComprobanteElectronico dto, WhereParams params) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from cabecera ");
		sql.append(" WHERE 1=1 ");
		sql.append(" AND docu_tipodocumento = '"+dto.getTipoComprobante() +"'");
		sql.append(" AND docu_numero = '"+dto.getSerieYNumero() +"'"); 
		sql.append(" AND empr_nroruc = '"+dto.getRuc() +"'"); 
		sql.append(" AND docu_fecha = '"+dto.getFechaEmision() +"'"); 
		sql.append(" AND docu_total = "+dto.getMontoTotalComprobante()); 
		 
		return sql.toString();
	}    
    
	private String getConsultaComprobanteElectronicoInterno(ConsultaComprobanteElectronicoInterno dto, WhereParams params) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from cabecera ");
		sql.append(" WHERE 1=1 ");		

		sql.append(params.filter(" AND docu_numero =  :docu_numero ", dto.getSerieYNumero()));
		sql.append(params.filter(" AND empr_nroruc =  :empr_nroruc ", dto.getRuc()));
		sql.append(params.filter(" AND docu_tipodocumento = :docu_tipodocumento ", dto.getTipoDocumento()));
		sql.append(params.filter(" AND UPPER(empr_razonsocial) LIKE UPPER('%' + :value + '%') ", dto.getRazonSocial()));
		if(dto.getFechaDesde()!=null)
			sql.append(params.filterDate(" AND (docu_fecha >= :fechaDesde ", dto.getFechaDesde()));
		if(dto.getFechaHasta()!=null)
			sql.append(params.filterDate(" AND docu_fecha <= :fechaHasta )", dto.getFechaHasta()));
		 
		return sql.toString();
	}
    
    public List<ComprobanteElectronico> consultarComprobanteElectronico(ConsultaComprobanteElectronico dto) {
        WhereParams params = new WhereParams();
        String sql = getConsultaComprobanteElectronico(dto, params);

        return jdbcTemplate.query(sql.toString(),
                params.getParams(), new BeanPropertyRowMapper<ComprobanteElectronico>(ComprobanteElectronico.class));
        
        
                
    }

    
    public List<ComprobanteElectronico> consultarComprobanteElectronicoInterno(
    		ConsultaComprobanteElectronicoInterno dto) {
        WhereParams params = new WhereParams();
        String sql = getConsultaComprobanteElectronicoInterno(dto, params);

        return jdbcTemplate.query(sql,
                params.getParams(), new BeanPropertyRowMapper<ComprobanteElectronico>(ComprobanteElectronico.class));


                
    }


    
    
}
