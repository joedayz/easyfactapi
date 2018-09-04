/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.joedayz.perufact.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "cabecera")
@NamedQueries({
    @NamedQuery(name = "Cabecera.findAll", query = "SELECT c FROM Cabecera c")})
public class Cabecera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "docu_codigo")
    private Integer docuCodigo;
    @Column(name = "idExterno")
    private String idExterno;
    @Column(name = "empr_razonsocial")
    private String emprRazonsocial;
    @Column(name = "empr_ubigeo")
    private String emprUbigeo;
    @Column(name = "empr_nombrecomercial")
    private String emprNombrecomercial;
    @Column(name = "empr_direccion")
    private String emprDireccion;
    @Column(name = "empr_provincia")
    private String emprProvincia;
    @Column(name = "empr_departamento")
    private String emprDepartamento;
    @Column(name = "empr_distrito")
    private String emprDistrito;
    @Column(name = "empr_pais")
    private String emprPais;
    @Column(name = "empr_nroruc")
    private String emprNroruc;
    @Column(name = "empr_tipodoc")
    private String emprTipodoc;
    @Column(name = "clie_numero")
    private String clieNumero;
    @Column(name = "clie_tipodoc")
    private String clieTipodoc;
    @Column(name = "clie_nombre")
    private String clieNombre;
    @Column(name = "docu_fecha")
    private String docuFecha;
    @Column(name = "docu_tipodocumento")
    private String docuTipodocumento;
    @Column(name = "docu_numero")
    private String docuNumero;
    @Column(name = "docu_moneda")
    private String docuMoneda;
    @Column(name = "docu_gravada")
    private String docuGravada;
    @Column(name = "docu_inafecta")
    private String docuInafecta;
    @Column(name = "docu_exonerada")
    private String docuExonerada;
    @Column(name = "docu_gratuita")
    private String docuGratuita;
    @Column(name = "docu_descuento")
    private String docuDescuento;
    @Column(name = "docu_subtotal")
    private String docuSubtotal;
    @Column(name = "docu_total")
    private String docuTotal;
    @Column(name = "docu_igv")
    private String docuIgv;
    @Column(name = "tasa_igv")
    private String tasaIgv;
    @Column(name = "docu_isc")
    private String docuIsc;
    @Column(name = "tasa_isc")
    private String tasaIsc;
    @Column(name = "docu_otrostributos")
    private String docuOtrostributos;
    @Column(name = "tasa_otrostributos")
    private String tasaOtrostributos;
    @Column(name = "rete_regi")
    private String reteRegi;
    @Column(name = "rete_tasa")
    private String reteTasa;
    @Column(name = "rete_total_elec")
    private String reteTotalElec;
    @Column(name = "rete_total_rete")
    private String reteTotalRete;
    @Column(name = "docu_otroscargos")
    private String docuOtroscargos;
    @Column(name = "docu_percepcion")
    private String docuPercepcion;
    @Column(name = "nota_motivo")
    private String notaMotivo;
    @Column(name = "nota_sustento")
    private String notaSustento;
    @Column(name = "nota_tipodoc")
    private String notaTipodoc;
    @Column(name = "nota_documento")
    private String notaDocumento;
    @Column(name = "hashcode")
    private String hashcode;
    @Lob
    @Column(name = "barcode")
    private byte[] barcode;
    @Column(name = "cdr")
    private String cdr;
    @Column(name = "cdr_nota")
    private String cdrNota;
    @Column(name = "cdr_observacion")
    private String cdrObservacion;
    @Column(name = "docu_enviaws")
    private String docuEnviaws;
    @Column(name = "docu_proce_status")
    private String docuProceStatus;
    @Column(name = "docu_proce_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docuProceFecha;
    @Column(name = "docu_link_pdf")
    private String docuLinkPdf;
    @Column(name = "docu_link_cdr")
    private String docuLinkCdr;
    @Column(name = "docu_link_xml")
    private String docuLinkXml;
    @Column(name = "docu_forma_pago")
    private String docuFormaPago;
    @Column(name = "docu_observacion")
    private String docuObservacion;
    @Column(name = "clie_direccion")
    private String clieDireccion;
    @Column(name = "docu_vendedor")
    private String docuVendedor;
    @Column(name = "docu_pedido")
    private String docuPedido;
    @Column(name = "docu_guia_remision")
    private String docuGuiaRemision;
    @Column(name = "clie_orden_compra")
    private String clieOrdenCompra;
    @Column(name = "clie_correo_cpe1")
    private String clieCorreoCpe1;
    @Column(name = "clie_correo_cpe2")
    private String clieCorreoCpe2;
    @Column(name = "clie_correo_cpe0")
    private String clieCorreoCpe0;
    @Column(name = "docu_tipo_operacion")
    private String docuTipoOperacion;
    @Column(name = "docu_anticipo_total")
    private String docuAnticipoTotal;
    @Column(name = "empr_direccion_suc")
    private String emprDireccionSuc;
    @Column(name = "empr_ubigeo_suc")
    private String emprUbigeoSuc;
    @Column(name = "empr_departamento_suc")
    private String emprDepartamentoSuc;
    @Column(name = "empr_provincia_suc")
    private String emprProvinciaSuc;
    @Column(name = "empr_distrito_suc")
    private String emprDistritoSuc;
    @Column(name = "resu_fecha_generacion")
    private String resuFechaGeneracion;
    @Column(name = "resu_identificador")
    private String resuIdentificador;
    @Column(name = "resu_fila")
    private String resuFila;
    @Column(name = "resu_version")
    private String resuVersion;
    @Column(name = "resu_estado")
    private String resuEstado;
    @Column(name = "item_estado")
    private String itemEstado;
    @Column(name = "flg_xml")
    private String flgXml;
    @Column(name = "flg_pdf")
    private String flgPdf;
    @Column(name = "flg_ftp")
    private String flgFtp;
    @Column(name = "flg_sunat")
    private String flgSunat;
    @Column(name = "flg_email")
    private String flgEmail;
    @Column(name = "resu_fecha_generacion_baja")
    private String resuFechaGeneracionBaja;
    @Column(name = "resu_identificador_baja")
    private String resuIdentificadorBaja;
    @Column(name = "resu_fila_baja")
    private String resuFilaBaja;
    @Column(name = "item_estado_baja")
    private String itemEstadoBaja;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docuCodigo")
    private List<Leyenda> leyendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docuCodigo")
    private List<Detalle> detalleList;

    public Cabecera() {
    }

    public Cabecera(Integer docuCodigo) {
        this.docuCodigo = docuCodigo;
    }

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

    public String getCdrObservacion() {
        return cdrObservacion;
    }

    public void setCdrObservacion(String cdrObservacion) {
        this.cdrObservacion = cdrObservacion;
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

    public String getDocuTipoOperacion() {
        return docuTipoOperacion;
    }

    public void setDocuTipoOperacion(String docuTipoOperacion) {
        this.docuTipoOperacion = docuTipoOperacion;
    }

    public String getDocuAnticipoTotal() {
        return docuAnticipoTotal;
    }

    public void setDocuAnticipoTotal(String docuAnticipoTotal) {
        this.docuAnticipoTotal = docuAnticipoTotal;
    }

    public String getEmprDireccionSuc() {
        return emprDireccionSuc;
    }

    public void setEmprDireccionSuc(String emprDireccionSuc) {
        this.emprDireccionSuc = emprDireccionSuc;
    }

    public String getEmprUbigeoSuc() {
        return emprUbigeoSuc;
    }

    public void setEmprUbigeoSuc(String emprUbigeoSuc) {
        this.emprUbigeoSuc = emprUbigeoSuc;
    }

    public String getEmprDepartamentoSuc() {
        return emprDepartamentoSuc;
    }

    public void setEmprDepartamentoSuc(String emprDepartamentoSuc) {
        this.emprDepartamentoSuc = emprDepartamentoSuc;
    }

    public String getEmprProvinciaSuc() {
        return emprProvinciaSuc;
    }

    public void setEmprProvinciaSuc(String emprProvinciaSuc) {
        this.emprProvinciaSuc = emprProvinciaSuc;
    }

    public String getEmprDistritoSuc() {
        return emprDistritoSuc;
    }

    public void setEmprDistritoSuc(String emprDistritoSuc) {
        this.emprDistritoSuc = emprDistritoSuc;
    }

    public String getResuFechaGeneracion() {
        return resuFechaGeneracion;
    }

    public void setResuFechaGeneracion(String resuFechaGeneracion) {
        this.resuFechaGeneracion = resuFechaGeneracion;
    }

    public String getResuIdentificador() {
        return resuIdentificador;
    }

    public void setResuIdentificador(String resuIdentificador) {
        this.resuIdentificador = resuIdentificador;
    }

    public String getResuFila() {
        return resuFila;
    }

    public void setResuFila(String resuFila) {
        this.resuFila = resuFila;
    }

    public String getResuVersion() {
        return resuVersion;
    }

    public void setResuVersion(String resuVersion) {
        this.resuVersion = resuVersion;
    }

    public String getResuEstado() {
        return resuEstado;
    }

    public void setResuEstado(String resuEstado) {
        this.resuEstado = resuEstado;
    }

    public String getItemEstado() {
        return itemEstado;
    }

    public void setItemEstado(String itemEstado) {
        this.itemEstado = itemEstado;
    }

    public String getFlgXml() {
        return flgXml;
    }

    public void setFlgXml(String flgXml) {
        this.flgXml = flgXml;
    }

    public String getFlgPdf() {
        return flgPdf;
    }

    public void setFlgPdf(String flgPdf) {
        this.flgPdf = flgPdf;
    }

    public String getFlgFtp() {
        return flgFtp;
    }

    public void setFlgFtp(String flgFtp) {
        this.flgFtp = flgFtp;
    }

    public String getFlgSunat() {
        return flgSunat;
    }

    public void setFlgSunat(String flgSunat) {
        this.flgSunat = flgSunat;
    }

    public String getFlgEmail() {
        return flgEmail;
    }

    public void setFlgEmail(String flgEmail) {
        this.flgEmail = flgEmail;
    }

    public String getResuFechaGeneracionBaja() {
        return resuFechaGeneracionBaja;
    }

    public void setResuFechaGeneracionBaja(String resuFechaGeneracionBaja) {
        this.resuFechaGeneracionBaja = resuFechaGeneracionBaja;
    }

    public String getResuIdentificadorBaja() {
        return resuIdentificadorBaja;
    }

    public void setResuIdentificadorBaja(String resuIdentificadorBaja) {
        this.resuIdentificadorBaja = resuIdentificadorBaja;
    }

    public String getResuFilaBaja() {
        return resuFilaBaja;
    }

    public void setResuFilaBaja(String resuFilaBaja) {
        this.resuFilaBaja = resuFilaBaja;
    }

    public String getItemEstadoBaja() {
        return itemEstadoBaja;
    }

    public void setItemEstadoBaja(String itemEstadoBaja) {
        this.itemEstadoBaja = itemEstadoBaja;
    }



    public List<Leyenda> getLeyendaList() {
        return leyendaList;
    }

    public void setLeyendaList(List<Leyenda> leyendaList) {
        this.leyendaList = leyendaList;
    }

    public List<Detalle> getDetalleList() {
        return detalleList;
    }

    public void setDetalleList(List<Detalle> detalleList) {
        this.detalleList = detalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docuCodigo != null ? docuCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabecera)) {
            return false;
        }
        Cabecera other = (Cabecera) object;
        if ((this.docuCodigo == null && other.docuCodigo != null) || (this.docuCodigo != null && !this.docuCodigo.equals(other.docuCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.joedayz.perufact.Cabecera[ docuCodigo=" + docuCodigo + " ]";
    }
    
}
