package pe.joedayz.easyfact.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



import pe.joedayz.easyfact.json.JsonDateSimpleDeserializer;
import pe.joedayz.easyfact.json.JsonDateSimpleSerializer;

public class ConsultaComprobanteElectronicoInterno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String serieYNumero;
	private String ruc;
	
   	private String tipoDocumento;

    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date fechaDesde;
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date fechaHasta;	
    
	private String razonSocial;
	

	public String getSerieYNumero() {
		return serieYNumero;
	}
	public void setSerieYNumero(String serieYNumero) {
		this.serieYNumero = serieYNumero;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
}
