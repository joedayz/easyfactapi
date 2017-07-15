package pe.joedayz.easyfact.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pe.joedayz.easyfact.json.JsonDateSimpleDeserializer;
import pe.joedayz.easyfact.json.JsonDateSimpleSerializer;

import java.io.Serializable;
import java.util.Date;

public class ComprobanteElectronico implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 2054683308668924467L;

	private Integer docuCodigo;

	private String idExterno;

	private String emprRazonsocial;

	private String emprUbigeo;

	private String emprNombrecomercial;

	private String emprDireccion;

	private String emprProvincia;

	private String emprDepartamento;

	private String emprDistrito;

	private String emprPais;

	private String emprNroruc;

	private String emprTipodoc;

	private String clieNumero;

	private String clieTipodoc;

	private String clieNombre;

	private String docuFecha;

	private String docuTipodocumento;

	private String docuNumero;

	private String docuMoneda;

	private String docuGravada;

	private String docuInafecta;

	private String docuExonerada;

	private String docuGratuita;

	private String docuDescuento;

	private String docuSubtotal;

	private String docuTotal;

	private String docuIgv;

	private String tasaIgv;

	private String docuIsc;

	private String tasaIsc;

	private String docuOtrostributos;

	private String tasaOtrostributos;

	private String reteRegi;

	private String reteTasa;

	private String reteTotalElec;

	private String reteTotalRete;

	private String docuOtroscargos;

	private String docuPercepcion;

	private String notaMotivo;

	private String notaSustento;

	private String notaTipodoc;

	private String notaDocumento;

	private String hashcode;

	private byte[] barcode;

	private String cdr;

	private String cdrNota;

	private String docuEnviaws;

	private String docuProceStatus;

	@JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date docuProceFecha;

	private String docuLinkPdf;

	private String docuLinkCdr;

	private String docuLinkXml;

	private String docuFormaPago;

	private String docuObservacion;

	private String clieDireccion;

	private String docuVendedor;

	private String docuPedido;

	private String docuGuiaRemision;

	private String clieOrdenCompra;

	private String clieCorreoCpe1;

	private String clieCorreoCpe2;

	private String clieCorreoCpe0;

	private String docuLeyendaA;

	private String docuLeyendaB;

	private String docuLeyendaC;

	private String docuLeyendaD;

	private String docuLeyendaE;

	private String docuLeyendaF;

	public Integer getDocuCodigo() {
		return docuCodigo;
	}

	public void setDocuCodigo(Integer docuCodigo) {
		this.docuCodigo = docuCodigo;
	}

	public String getIdExterno() {
		return idExterno;
	}

	public void setIdExterno(String idExterno) {
		this.idExterno = idExterno;
	}

	public String getEmprRazonsocial() {
		return emprRazonsocial;
	}

	public void setEmprRazonsocial(String emprRazonsocial) {
		this.emprRazonsocial = emprRazonsocial;
	}

	public String getEmprUbigeo() {
		return emprUbigeo;
	}

	public void setEmprUbigeo(String emprUbigeo) {
		this.emprUbigeo = emprUbigeo;
	}

	public String getEmprNombrecomercial() {
		return emprNombrecomercial;
	}

	public void setEmprNombrecomercial(String emprNombrecomercial) {
		this.emprNombrecomercial = emprNombrecomercial;
	}

	public String getEmprDireccion() {
		return emprDireccion;
	}

	public void setEmprDireccion(String emprDireccion) {
		this.emprDireccion = emprDireccion;
	}

	public String getEmprProvincia() {
		return emprProvincia;
	}

	public void setEmprProvincia(String emprProvincia) {
		this.emprProvincia = emprProvincia;
	}

	public String getEmprDepartamento() {
		return emprDepartamento;
	}

	public void setEmprDepartamento(String emprDepartamento) {
		this.emprDepartamento = emprDepartamento;
	}

	public String getEmprDistrito() {
		return emprDistrito;
	}

	public void setEmprDistrito(String emprDistrito) {
		this.emprDistrito = emprDistrito;
	}

	public String getEmprPais() {
		return emprPais;
	}

	public void setEmprPais(String emprPais) {
		this.emprPais = emprPais;
	}

	public String getEmprNroruc() {
		return emprNroruc;
	}

	public void setEmprNroruc(String emprNroruc) {
		this.emprNroruc = emprNroruc;
	}

	public String getEmprTipodoc() {
		return emprTipodoc;
	}

	public void setEmprTipodoc(String emprTipodoc) {
		this.emprTipodoc = emprTipodoc;
	}

	public String getClieNumero() {
		return clieNumero;
	}

	public void setClieNumero(String clieNumero) {
		this.clieNumero = clieNumero;
	}

	public String getClieTipodoc() {
		return clieTipodoc;
	}

	public void setClieTipodoc(String clieTipodoc) {
		this.clieTipodoc = clieTipodoc;
	}

	public String getClieNombre() {
		return clieNombre;
	}

	public void setClieNombre(String clieNombre) {
		this.clieNombre = clieNombre;
	}

	public String getDocuFecha() {
		return docuFecha;
	}

	public void setDocuFecha(String docuFecha) {
		this.docuFecha = docuFecha;
	}

	public String getDocuTipodocumento() {
		return docuTipodocumento;
	}

	public void setDocuTipodocumento(String docuTipodocumento) {
		this.docuTipodocumento = docuTipodocumento;
	}

	public String getDocuNumero() {
		return docuNumero;
	}

	public void setDocuNumero(String docuNumero) {
		this.docuNumero = docuNumero;
	}

	public String getDocuMoneda() {
		return docuMoneda;
	}

	public void setDocuMoneda(String docuMoneda) {
		this.docuMoneda = docuMoneda;
	}

	public String getDocuGravada() {
		return docuGravada;
	}

	public void setDocuGravada(String docuGravada) {
		this.docuGravada = docuGravada;
	}

	public String getDocuInafecta() {
		return docuInafecta;
	}

	public void setDocuInafecta(String docuInafecta) {
		this.docuInafecta = docuInafecta;
	}

	public String getDocuExonerada() {
		return docuExonerada;
	}

	public void setDocuExonerada(String docuExonerada) {
		this.docuExonerada = docuExonerada;
	}

	public String getDocuGratuita() {
		return docuGratuita;
	}

	public void setDocuGratuita(String docuGratuita) {
		this.docuGratuita = docuGratuita;
	}

	public String getDocuDescuento() {
		return docuDescuento;
	}

	public void setDocuDescuento(String docuDescuento) {
		this.docuDescuento = docuDescuento;
	}

	public String getDocuSubtotal() {
		return docuSubtotal;
	}

	public void setDocuSubtotal(String docuSubtotal) {
		this.docuSubtotal = docuSubtotal;
	}

	public String getDocuTotal() {
		return docuTotal;
	}

	public void setDocuTotal(String docuTotal) {
		this.docuTotal = docuTotal;
	}

	public String getDocuIgv() {
		return docuIgv;
	}

	public void setDocuIgv(String docuIgv) {
		this.docuIgv = docuIgv;
	}

	public String getTasaIgv() {
		return tasaIgv;
	}

	public void setTasaIgv(String tasaIgv) {
		this.tasaIgv = tasaIgv;
	}

	public String getDocuIsc() {
		return docuIsc;
	}

	public void setDocuIsc(String docuIsc) {
		this.docuIsc = docuIsc;
	}

	public String getTasaIsc() {
		return tasaIsc;
	}

	public void setTasaIsc(String tasaIsc) {
		this.tasaIsc = tasaIsc;
	}

	public String getDocuOtrostributos() {
		return docuOtrostributos;
	}

	public void setDocuOtrostributos(String docuOtrostributos) {
		this.docuOtrostributos = docuOtrostributos;
	}

	public String getTasaOtrostributos() {
		return tasaOtrostributos;
	}

	public void setTasaOtrostributos(String tasaOtrostributos) {
		this.tasaOtrostributos = tasaOtrostributos;
	}

	public String getReteRegi() {
		return reteRegi;
	}

	public void setReteRegi(String reteRegi) {
		this.reteRegi = reteRegi;
	}

	public String getReteTasa() {
		return reteTasa;
	}

	public void setReteTasa(String reteTasa) {
		this.reteTasa = reteTasa;
	}

	public String getReteTotalElec() {
		return reteTotalElec;
	}

	public void setReteTotalElec(String reteTotalElec) {
		this.reteTotalElec = reteTotalElec;
	}

	public String getReteTotalRete() {
		return reteTotalRete;
	}

	public void setReteTotalRete(String reteTotalRete) {
		this.reteTotalRete = reteTotalRete;
	}

	public String getDocuOtroscargos() {
		return docuOtroscargos;
	}

	public void setDocuOtroscargos(String docuOtroscargos) {
		this.docuOtroscargos = docuOtroscargos;
	}

	public String getDocuPercepcion() {
		return docuPercepcion;
	}

	public void setDocuPercepcion(String docuPercepcion) {
		this.docuPercepcion = docuPercepcion;
	}

	public String getNotaMotivo() {
		return notaMotivo;
	}

	public void setNotaMotivo(String notaMotivo) {
		this.notaMotivo = notaMotivo;
	}

	public String getNotaSustento() {
		return notaSustento;
	}

	public void setNotaSustento(String notaSustento) {
		this.notaSustento = notaSustento;
	}

	public String getNotaTipodoc() {
		return notaTipodoc;
	}

	public void setNotaTipodoc(String notaTipodoc) {
		this.notaTipodoc = notaTipodoc;
	}

	public String getNotaDocumento() {
		return notaDocumento;
	}

	public void setNotaDocumento(String notaDocumento) {
		this.notaDocumento = notaDocumento;
	}

	public String getHashcode() {
		return hashcode;
	}

	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}

	public byte[] getBarcode() {
		return barcode;
	}

	public void setBarcode(byte[] barcode) {
		this.barcode = barcode;
	}

	public String getCdr() {
		return cdr;
	}

	public void setCdr(String cdr) {
		this.cdr = cdr;
	}

	public String getCdrNota() {
		return cdrNota;
	}

	public void setCdrNota(String cdrNota) {
		this.cdrNota = cdrNota;
	}

	public String getDocuEnviaws() {
		return docuEnviaws;
	}

	public void setDocuEnviaws(String docuEnviaws) {
		this.docuEnviaws = docuEnviaws;
	}

	public String getDocuProceStatus() {
		return docuProceStatus;
	}

	public void setDocuProceStatus(String docuProceStatus) {
		this.docuProceStatus = docuProceStatus;
	}

	public Date getDocuProceFecha() {
		return docuProceFecha;
	}

	public void setDocuProceFecha(Date docuProceFecha) {
		this.docuProceFecha = docuProceFecha;
	}

	public String getDocuLinkPdf() {
		return docuLinkPdf;
	}

	public void setDocuLinkPdf(String docuLinkPdf) {
		this.docuLinkPdf = docuLinkPdf;
	}

	public String getDocuLinkCdr() {
		return docuLinkCdr;
	}

	public void setDocuLinkCdr(String docuLinkCdr) {
		this.docuLinkCdr = docuLinkCdr;
	}

	public String getDocuLinkXml() {
		return docuLinkXml;
	}

	public void setDocuLinkXml(String docuLinkXml) {
		this.docuLinkXml = docuLinkXml;
	}

	public String getDocuFormaPago() {
		return docuFormaPago;
	}

	public void setDocuFormaPago(String docuFormaPago) {
		this.docuFormaPago = docuFormaPago;
	}

	public String getDocuObservacion() {
		return docuObservacion;
	}

	public void setDocuObservacion(String docuObservacion) {
		this.docuObservacion = docuObservacion;
	}

	public String getClieDireccion() {
		return clieDireccion;
	}

	public void setClieDireccion(String clieDireccion) {
		this.clieDireccion = clieDireccion;
	}

	public String getDocuVendedor() {
		return docuVendedor;
	}

	public void setDocuVendedor(String docuVendedor) {
		this.docuVendedor = docuVendedor;
	}

	public String getDocuPedido() {
		return docuPedido;
	}

	public void setDocuPedido(String docuPedido) {
		this.docuPedido = docuPedido;
	}

	public String getDocuGuiaRemision() {
		return docuGuiaRemision;
	}

	public void setDocuGuiaRemision(String docuGuiaRemision) {
		this.docuGuiaRemision = docuGuiaRemision;
	}

	public String getClieOrdenCompra() {
		return clieOrdenCompra;
	}

	public void setClieOrdenCompra(String clieOrdenCompra) {
		this.clieOrdenCompra = clieOrdenCompra;
	}

	public String getClieCorreoCpe1() {
		return clieCorreoCpe1;
	}

	public void setClieCorreoCpe1(String clieCorreoCpe1) {
		this.clieCorreoCpe1 = clieCorreoCpe1;
	}

	public String getClieCorreoCpe2() {
		return clieCorreoCpe2;
	}

	public void setClieCorreoCpe2(String clieCorreoCpe2) {
		this.clieCorreoCpe2 = clieCorreoCpe2;
	}

	public String getClieCorreoCpe0() {
		return clieCorreoCpe0;
	}

	public void setClieCorreoCpe0(String clieCorreoCpe0) {
		this.clieCorreoCpe0 = clieCorreoCpe0;
	}

	public String getDocuLeyendaA() {
		return docuLeyendaA;
	}

	public void setDocuLeyendaA(String docuLeyendaA) {
		this.docuLeyendaA = docuLeyendaA;
	}

	public String getDocuLeyendaB() {
		return docuLeyendaB;
	}

	public void setDocuLeyendaB(String docuLeyendaB) {
		this.docuLeyendaB = docuLeyendaB;
	}

	public String getDocuLeyendaC() {
		return docuLeyendaC;
	}

	public void setDocuLeyendaC(String docuLeyendaC) {
		this.docuLeyendaC = docuLeyendaC;
	}

	public String getDocuLeyendaD() {
		return docuLeyendaD;
	}

	public void setDocuLeyendaD(String docuLeyendaD) {
		this.docuLeyendaD = docuLeyendaD;
	}

	public String getDocuLeyendaE() {
		return docuLeyendaE;
	}

	public void setDocuLeyendaE(String docuLeyendaE) {
		this.docuLeyendaE = docuLeyendaE;
	}

	public String getDocuLeyendaF() {
		return docuLeyendaF;
	}

	public void setDocuLeyendaF(String docuLeyendaF) {
		this.docuLeyendaF = docuLeyendaF;
	}
	
	

}
