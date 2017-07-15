package pe.joedayz.easyfact.domain.model.entities;

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

import pe.joedayz.easyfact.domain.model.base.AuditingEntity;

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "cabecera")
@NamedQueries({
    @NamedQuery(name = "Cabecera.findAll", query = "SELECT c FROM Cabecera c"),
    @NamedQuery(name = "Cabecera.findByDocuCodigo", query = "SELECT c FROM Cabecera c WHERE c.docuCodigo = :docuCodigo"),
    @NamedQuery(name = "Cabecera.findByIdExterno", query = "SELECT c FROM Cabecera c WHERE c.idExterno = :idExterno"),
    @NamedQuery(name = "Cabecera.findByEmprRazonsocial", query = "SELECT c FROM Cabecera c WHERE c.emprRazonsocial = :emprRazonsocial"),
    @NamedQuery(name = "Cabecera.findByEmprUbigeo", query = "SELECT c FROM Cabecera c WHERE c.emprUbigeo = :emprUbigeo"),
    @NamedQuery(name = "Cabecera.findByEmprNombrecomercial", query = "SELECT c FROM Cabecera c WHERE c.emprNombrecomercial = :emprNombrecomercial"),
    @NamedQuery(name = "Cabecera.findByEmprDireccion", query = "SELECT c FROM Cabecera c WHERE c.emprDireccion = :emprDireccion"),
    @NamedQuery(name = "Cabecera.findByEmprProvincia", query = "SELECT c FROM Cabecera c WHERE c.emprProvincia = :emprProvincia"),
    @NamedQuery(name = "Cabecera.findByEmprDepartamento", query = "SELECT c FROM Cabecera c WHERE c.emprDepartamento = :emprDepartamento"),
    @NamedQuery(name = "Cabecera.findByEmprDistrito", query = "SELECT c FROM Cabecera c WHERE c.emprDistrito = :emprDistrito"),
    @NamedQuery(name = "Cabecera.findByEmprPais", query = "SELECT c FROM Cabecera c WHERE c.emprPais = :emprPais"),
    @NamedQuery(name = "Cabecera.findByEmprNroruc", query = "SELECT c FROM Cabecera c WHERE c.emprNroruc = :emprNroruc"),
    @NamedQuery(name = "Cabecera.findByEmprTipodoc", query = "SELECT c FROM Cabecera c WHERE c.emprTipodoc = :emprTipodoc"),
    @NamedQuery(name = "Cabecera.findByClieNumero", query = "SELECT c FROM Cabecera c WHERE c.clieNumero = :clieNumero"),
    @NamedQuery(name = "Cabecera.findByClieTipodoc", query = "SELECT c FROM Cabecera c WHERE c.clieTipodoc = :clieTipodoc"),
    @NamedQuery(name = "Cabecera.findByClieNombre", query = "SELECT c FROM Cabecera c WHERE c.clieNombre = :clieNombre"),
    @NamedQuery(name = "Cabecera.findByDocuFecha", query = "SELECT c FROM Cabecera c WHERE c.docuFecha = :docuFecha"),
    @NamedQuery(name = "Cabecera.findByDocuTipodocumento", query = "SELECT c FROM Cabecera c WHERE c.docuTipodocumento = :docuTipodocumento"),
    @NamedQuery(name = "Cabecera.findByDocuNumero", query = "SELECT c FROM Cabecera c WHERE c.docuNumero = :docuNumero"),
    @NamedQuery(name = "Cabecera.findByDocuMoneda", query = "SELECT c FROM Cabecera c WHERE c.docuMoneda = :docuMoneda"),
    @NamedQuery(name = "Cabecera.findByDocuGravada", query = "SELECT c FROM Cabecera c WHERE c.docuGravada = :docuGravada"),
    @NamedQuery(name = "Cabecera.findByDocuInafecta", query = "SELECT c FROM Cabecera c WHERE c.docuInafecta = :docuInafecta"),
    @NamedQuery(name = "Cabecera.findByDocuExonerada", query = "SELECT c FROM Cabecera c WHERE c.docuExonerada = :docuExonerada"),
    @NamedQuery(name = "Cabecera.findByDocuGratuita", query = "SELECT c FROM Cabecera c WHERE c.docuGratuita = :docuGratuita"),
    @NamedQuery(name = "Cabecera.findByDocuDescuento", query = "SELECT c FROM Cabecera c WHERE c.docuDescuento = :docuDescuento"),
    @NamedQuery(name = "Cabecera.findByDocuSubtotal", query = "SELECT c FROM Cabecera c WHERE c.docuSubtotal = :docuSubtotal"),
    @NamedQuery(name = "Cabecera.findByDocuTotal", query = "SELECT c FROM Cabecera c WHERE c.docuTotal = :docuTotal"),
    @NamedQuery(name = "Cabecera.findByDocuIgv", query = "SELECT c FROM Cabecera c WHERE c.docuIgv = :docuIgv"),
    @NamedQuery(name = "Cabecera.findByTasaIgv", query = "SELECT c FROM Cabecera c WHERE c.tasaIgv = :tasaIgv"),
    @NamedQuery(name = "Cabecera.findByDocuIsc", query = "SELECT c FROM Cabecera c WHERE c.docuIsc = :docuIsc"),
    @NamedQuery(name = "Cabecera.findByTasaIsc", query = "SELECT c FROM Cabecera c WHERE c.tasaIsc = :tasaIsc"),
    @NamedQuery(name = "Cabecera.findByDocuOtrostributos", query = "SELECT c FROM Cabecera c WHERE c.docuOtrostributos = :docuOtrostributos"),
    @NamedQuery(name = "Cabecera.findByTasaOtrostributos", query = "SELECT c FROM Cabecera c WHERE c.tasaOtrostributos = :tasaOtrostributos"),
    @NamedQuery(name = "Cabecera.findByReteRegi", query = "SELECT c FROM Cabecera c WHERE c.reteRegi = :reteRegi"),
    @NamedQuery(name = "Cabecera.findByReteTasa", query = "SELECT c FROM Cabecera c WHERE c.reteTasa = :reteTasa"),
    @NamedQuery(name = "Cabecera.findByReteTotalElec", query = "SELECT c FROM Cabecera c WHERE c.reteTotalElec = :reteTotalElec"),
    @NamedQuery(name = "Cabecera.findByReteTotalRete", query = "SELECT c FROM Cabecera c WHERE c.reteTotalRete = :reteTotalRete"),
    @NamedQuery(name = "Cabecera.findByDocuOtroscargos", query = "SELECT c FROM Cabecera c WHERE c.docuOtroscargos = :docuOtroscargos"),
    @NamedQuery(name = "Cabecera.findByDocuPercepcion", query = "SELECT c FROM Cabecera c WHERE c.docuPercepcion = :docuPercepcion"),
    @NamedQuery(name = "Cabecera.findByNotaMotivo", query = "SELECT c FROM Cabecera c WHERE c.notaMotivo = :notaMotivo"),
    @NamedQuery(name = "Cabecera.findByNotaSustento", query = "SELECT c FROM Cabecera c WHERE c.notaSustento = :notaSustento"),
    @NamedQuery(name = "Cabecera.findByNotaTipodoc", query = "SELECT c FROM Cabecera c WHERE c.notaTipodoc = :notaTipodoc"),
    @NamedQuery(name = "Cabecera.findByNotaDocumento", query = "SELECT c FROM Cabecera c WHERE c.notaDocumento = :notaDocumento"),
    @NamedQuery(name = "Cabecera.findByHashcode", query = "SELECT c FROM Cabecera c WHERE c.hashcode = :hashcode"),
    @NamedQuery(name = "Cabecera.findByCdr", query = "SELECT c FROM Cabecera c WHERE c.cdr = :cdr"),
    @NamedQuery(name = "Cabecera.findByCdrNota", query = "SELECT c FROM Cabecera c WHERE c.cdrNota = :cdrNota"),
    @NamedQuery(name = "Cabecera.findByDocuEnviaws", query = "SELECT c FROM Cabecera c WHERE c.docuEnviaws = :docuEnviaws"),
    @NamedQuery(name = "Cabecera.findByDocuProceStatus", query = "SELECT c FROM Cabecera c WHERE c.docuProceStatus = :docuProceStatus"),
    @NamedQuery(name = "Cabecera.findByDocuProceFecha", query = "SELECT c FROM Cabecera c WHERE c.docuProceFecha = :docuProceFecha"),
    @NamedQuery(name = "Cabecera.findByDocuLinkPdf", query = "SELECT c FROM Cabecera c WHERE c.docuLinkPdf = :docuLinkPdf"),
    @NamedQuery(name = "Cabecera.findByDocuLinkCdr", query = "SELECT c FROM Cabecera c WHERE c.docuLinkCdr = :docuLinkCdr"),
    @NamedQuery(name = "Cabecera.findByDocuLinkXml", query = "SELECT c FROM Cabecera c WHERE c.docuLinkXml = :docuLinkXml"),
    @NamedQuery(name = "Cabecera.findByDocuFormaPago", query = "SELECT c FROM Cabecera c WHERE c.docuFormaPago = :docuFormaPago"),
    @NamedQuery(name = "Cabecera.findByDocuObservacion", query = "SELECT c FROM Cabecera c WHERE c.docuObservacion = :docuObservacion"),
    @NamedQuery(name = "Cabecera.findByClieDireccion", query = "SELECT c FROM Cabecera c WHERE c.clieDireccion = :clieDireccion"),
    @NamedQuery(name = "Cabecera.findByDocuVendedor", query = "SELECT c FROM Cabecera c WHERE c.docuVendedor = :docuVendedor"),
    @NamedQuery(name = "Cabecera.findByDocuPedido", query = "SELECT c FROM Cabecera c WHERE c.docuPedido = :docuPedido"),
    @NamedQuery(name = "Cabecera.findByDocuGuiaRemision", query = "SELECT c FROM Cabecera c WHERE c.docuGuiaRemision = :docuGuiaRemision"),
    @NamedQuery(name = "Cabecera.findByClieOrdenCompra", query = "SELECT c FROM Cabecera c WHERE c.clieOrdenCompra = :clieOrdenCompra"),
    @NamedQuery(name = "Cabecera.findByClieCorreoCpe1", query = "SELECT c FROM Cabecera c WHERE c.clieCorreoCpe1 = :clieCorreoCpe1"),
    @NamedQuery(name = "Cabecera.findByClieCorreoCpe2", query = "SELECT c FROM Cabecera c WHERE c.clieCorreoCpe2 = :clieCorreoCpe2"),
    @NamedQuery(name = "Cabecera.findByClieCorreoCpe0", query = "SELECT c FROM Cabecera c WHERE c.clieCorreoCpe0 = :clieCorreoCpe0"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaA", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaA = :docuLeyendaA"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaB", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaB = :docuLeyendaB"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaC", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaC = :docuLeyendaC"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaD", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaD = :docuLeyendaD"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaE", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaE = :docuLeyendaE"),
    @NamedQuery(name = "Cabecera.findByDocuLeyendaF", query = "SELECT c FROM Cabecera c WHERE c.docuLeyendaF = :docuLeyendaF")})
public class Cabecera extends AuditingEntity implements Serializable {

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
    @Column(name = "docu_leyenda_a")
    private String docuLeyendaA;
    @Column(name = "docu_leyenda_b")
    private String docuLeyendaB;
    @Column(name = "docu_leyenda_c")
    private String docuLeyendaC;
    @Column(name = "docu_leyenda_d")
    private String docuLeyendaD;
    @Column(name = "docu_leyenda_e")
    private String docuLeyendaE;
    @Column(name = "docu_leyenda_f")
    private String docuLeyendaF;
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
        return "javaapplication2.Cabecera[ docuCodigo=" + docuCodigo + " ]";
    }
    
}