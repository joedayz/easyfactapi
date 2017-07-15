package pe.joedayz.easyfact.dto;

import java.io.Serializable;

public class ConsultaComprobanteElectronico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoComprobante;
	private String serieYNumero;
	private String ruc;
	private String fechaEmision;
	private Double montoTotalComprobante;
	private String email;
	
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
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
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Double getMontoTotalComprobante() {
		return montoTotalComprobante;
	}
	public void setMontoTotalComprobante(Double montoTotalComprobante) {
		this.montoTotalComprobante = montoTotalComprobante;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
}
