/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jdiazd
 */
@Entity
@Table(name = "detalle")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Detalle.findAll", query = "SELECT d FROM Detalle d")
        , @NamedQuery(name = "Detalle.findByIddetalle", query = "SELECT d FROM Detalle d WHERE d.iddetalle = :iddetalle")
        , @NamedQuery(name = "Detalle.findByIdExterno", query = "SELECT d FROM Detalle d WHERE d.idExterno = :idExterno")
        , @NamedQuery(name = "Detalle.findByDocuMoneda", query = "SELECT d FROM Detalle d WHERE d.docuMoneda = :docuMoneda")
        , @NamedQuery(name = "Detalle.findByItemMoneda", query = "SELECT d FROM Detalle d WHERE d.itemMoneda = :itemMoneda")
        , @NamedQuery(name = "Detalle.findByItemOrden", query = "SELECT d FROM Detalle d WHERE d.itemOrden = :itemOrden")
        , @NamedQuery(name = "Detalle.findByItemUnidad", query = "SELECT d FROM Detalle d WHERE d.itemUnidad = :itemUnidad")
        , @NamedQuery(name = "Detalle.findByItemCantidad", query = "SELECT d FROM Detalle d WHERE d.itemCantidad = :itemCantidad")
        , @NamedQuery(name = "Detalle.findByItemCodproducto", query = "SELECT d FROM Detalle d WHERE d.itemCodproducto = :itemCodproducto")
        , @NamedQuery(name = "Detalle.findByItemCodproductoSunat", query = "SELECT d FROM Detalle d WHERE d.itemCodproductoSunat = :itemCodproductoSunat")
        , @NamedQuery(name = "Detalle.findByItemDescripcion", query = "SELECT d FROM Detalle d WHERE d.itemDescripcion = :itemDescripcion")
        , @NamedQuery(name = "Detalle.findByItemAfectacion", query = "SELECT d FROM Detalle d WHERE d.itemAfectacion = :itemAfectacion")
        , @NamedQuery(name = "Detalle.findByItemTipoPrecioVenta", query = "SELECT d FROM Detalle d WHERE d.itemTipoPrecioVenta = :itemTipoPrecioVenta")
        , @NamedQuery(name = "Detalle.findByItemPventa", query = "SELECT d FROM Detalle d WHERE d.itemPventa = :itemPventa")
        , @NamedQuery(name = "Detalle.findByItempventaIgv", query = "SELECT d FROM Detalle d WHERE d.itempventaIgv = :itempventaIgv")
        , @NamedQuery(name = "Detalle.findByItemPventaNohonerosa", query = "SELECT d FROM Detalle d WHERE d.itemPventaNohonerosa = :itemPventaNohonerosa")
        , @NamedQuery(name = "Detalle.findByItemTiSubtotal", query = "SELECT d FROM Detalle d WHERE d.itemTiSubtotal = :itemTiSubtotal")
        , @NamedQuery(name = "Detalle.findByItemBaseIgv", query = "SELECT d FROM Detalle d WHERE d.itemBaseIgv = :itemBaseIgv")
        , @NamedQuery(name = "Detalle.findByItemTasaIgv", query = "SELECT d FROM Detalle d WHERE d.itemTasaIgv = :itemTasaIgv")
        , @NamedQuery(name = "Detalle.findByItemTiIgv", query = "SELECT d FROM Detalle d WHERE d.itemTiIgv = :itemTiIgv")
        , @NamedQuery(name = "Detalle.findByItemIscTier", query = "SELECT d FROM Detalle d WHERE d.itemIscTier = :itemIscTier")
        , @NamedQuery(name = "Detalle.findByItemBaseIsc", query = "SELECT d FROM Detalle d WHERE d.itemBaseIsc = :itemBaseIsc")
        , @NamedQuery(name = "Detalle.findByItemTasaIsc", query = "SELECT d FROM Detalle d WHERE d.itemTasaIsc = :itemTasaIsc")
        , @NamedQuery(name = "Detalle.findByItemTiIsc", query = "SELECT d FROM Detalle d WHERE d.itemTiIsc = :itemTiIsc")
        , @NamedQuery(name = "Detalle.findByItemBaseOtrosTrib", query = "SELECT d FROM Detalle d WHERE d.itemBaseOtrosTrib = :itemBaseOtrosTrib")
        , @NamedQuery(name = "Detalle.findByItemTasaOtrosTrib", query = "SELECT d FROM Detalle d WHERE d.itemTasaOtrosTrib = :itemTasaOtrosTrib")
        , @NamedQuery(name = "Detalle.findByItemTiOtrosTrib", query = "SELECT d FROM Detalle d WHERE d.itemTiOtrosTrib = :itemTiOtrosTrib")
        , @NamedQuery(name = "Detalle.findByItemTotalTax", query = "SELECT d FROM Detalle d WHERE d.itemTotalTax = :itemTotalTax")
        , @NamedQuery(name = "Detalle.findByItemTributo", query = "SELECT d FROM Detalle d WHERE d.itemTributo = :itemTributo")
        , @NamedQuery(name = "Detalle.findByReteRelaTipoDocu", query = "SELECT d FROM Detalle d WHERE d.reteRelaTipoDocu = :reteRelaTipoDocu")
        , @NamedQuery(name = "Detalle.findByReteRelaNumeDocu", query = "SELECT d FROM Detalle d WHERE d.reteRelaNumeDocu = :reteRelaNumeDocu")
        , @NamedQuery(name = "Detalle.findByReteRelaFechDocu", query = "SELECT d FROM Detalle d WHERE d.reteRelaFechDocu = :reteRelaFechDocu")
        , @NamedQuery(name = "Detalle.findByReteRelaTipoMoneda", query = "SELECT d FROM Detalle d WHERE d.reteRelaTipoMoneda = :reteRelaTipoMoneda")
        , @NamedQuery(name = "Detalle.findByReteRelaTotalOriginal", query = "SELECT d FROM Detalle d WHERE d.reteRelaTotalOriginal = :reteRelaTotalOriginal")
        , @NamedQuery(name = "Detalle.findByReteRelaFechaPago", query = "SELECT d FROM Detalle d WHERE d.reteRelaFechaPago = :reteRelaFechaPago")
        , @NamedQuery(name = "Detalle.findByReteRelaNumeroPago", query = "SELECT d FROM Detalle d WHERE d.reteRelaNumeroPago = :reteRelaNumeroPago")
        , @NamedQuery(name = "Detalle.findByReteRelaImportePagadoOriginal", query = "SELECT d FROM Detalle d WHERE d.reteRelaImportePagadoOriginal = :reteRelaImportePagadoOriginal")
        , @NamedQuery(name = "Detalle.findByReteRelaTipoMonedaPago", query = "SELECT d FROM Detalle d WHERE d.reteRelaTipoMonedaPago = :reteRelaTipoMonedaPago")
        , @NamedQuery(name = "Detalle.findByReteImporteRetenidoNacional", query = "SELECT d FROM Detalle d WHERE d.reteImporteRetenidoNacional = :reteImporteRetenidoNacional")
        , @NamedQuery(name = "Detalle.findByReteImporteNetoNacional", query = "SELECT d FROM Detalle d WHERE d.reteImporteNetoNacional = :reteImporteNetoNacional")
        , @NamedQuery(name = "Detalle.findByReteTipoMonedaReferencia", query = "SELECT d FROM Detalle d WHERE d.reteTipoMonedaReferencia = :reteTipoMonedaReferencia")
        , @NamedQuery(name = "Detalle.findByReteTipoMonedaObjetivo", query = "SELECT d FROM Detalle d WHERE d.reteTipoMonedaObjetivo = :reteTipoMonedaObjetivo")
        , @NamedQuery(name = "Detalle.findByReteTipoMonedaTipoCambio", query = "SELECT d FROM Detalle d WHERE d.reteTipoMonedaTipoCambio = :reteTipoMonedaTipoCambio")
        , @NamedQuery(name = "Detalle.findByReteTipoMonedaFecha", query = "SELECT d FROM Detalle d WHERE d.reteTipoMonedaFecha = :reteTipoMonedaFecha")
        , @NamedQuery(name = "Detalle.findByItemOtros", query = "SELECT d FROM Detalle d WHERE d.itemOtros = :itemOtros")
        , @NamedQuery(name = "Detalle.findByBultos", query = "SELECT d FROM Detalle d WHERE d.bultos = :bultos")
        , @NamedQuery(name = "Detalle.findByColor", query = "SELECT d FROM Detalle d WHERE d.color = :color")
        , @NamedQuery(name = "Detalle.findByTalla", query = "SELECT d FROM Detalle d WHERE d.talla = :talla")
        , @NamedQuery(name = "Detalle.findByMatiz", query = "SELECT d FROM Detalle d WHERE d.matiz = :matiz")
        , @NamedQuery(name = "Detalle.findByLote", query = "SELECT d FROM Detalle d WHERE d.lote = :lote")
        , @NamedQuery(name = "Detalle.findByUmCofaco", query = "SELECT d FROM Detalle d WHERE d.umCofaco = :umCofaco")
        , @NamedQuery(name = "Detalle.findByCantidadBruta", query = "SELECT d FROM Detalle d WHERE d.cantidadBruta = :cantidadBruta")
        , @NamedQuery(name = "Detalle.findByCantidadNeta", query = "SELECT d FROM Detalle d WHERE d.cantidadNeta = :cantidadNeta")
        , @NamedQuery(name = "Detalle.findByItemConceptoTribNombre", query = "SELECT d FROM Detalle d WHERE d.itemConceptoTribNombre = :itemConceptoTribNombre")
        , @NamedQuery(name = "Detalle.findByItemConceptoTribCodigo", query = "SELECT d FROM Detalle d WHERE d.itemConceptoTribCodigo = :itemConceptoTribCodigo")
        , @NamedQuery(name = "Detalle.findByItemNumeroPlaca", query = "SELECT d FROM Detalle d WHERE d.itemNumeroPlaca = :itemNumeroPlaca")})
public class Detalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle")
    private Integer iddetalle;
    @Column(name = "idExterno")
    private String idExterno;
    @Column(name = "docu_moneda")
    private String docuMoneda;
    @Column(name = "item_moneda")
    private String itemMoneda;
    @Column(name = "item_orden")
    private String itemOrden;
    @Column(name = "item_unidad")
    private String itemUnidad;
    @Column(name = "item_cantidad")
    private String itemCantidad;
    @Column(name = "item_codproducto")
    private String itemCodproducto;
    @Column(name = "item_codproducto_sunat")
    private String itemCodproductoSunat;
    @Column(name = "item_descripcion")
    private String itemDescripcion;
    @Column(name = "item_afectacion")
    private String itemAfectacion;
    @Column(name = "item_tipo_precio_venta")
    private String itemTipoPrecioVenta;
    @Column(name = "item_pventa")
    private String itemPventa;
    @Column(name = "item_pventaIgv")
    private String itempventaIgv;
    @Column(name = "item_pventa_nohonerosa")
    private String itemPventaNohonerosa;
    @Column(name = "item_ti_subtotal")
    private String itemTiSubtotal;
    @Column(name = "item_base_igv")
    private String itemBaseIgv;
    @Column(name = "item_tasa_igv")
    private String itemTasaIgv;
    @Column(name = "item_ti_igv")
    private String itemTiIgv;
    @Column(name = "item_isc_tier")
    private String itemIscTier;
    @Column(name = "item_base_isc")
    private String itemBaseIsc;
    @Column(name = "item_tasa_isc")
    private String itemTasaIsc;
    @Column(name = "item_ti_isc")
    private String itemTiIsc;
    @Column(name = "item_base_otros_trib")
    private String itemBaseOtrosTrib;
    @Column(name = "item_tasa_otros_trib")
    private String itemTasaOtrosTrib;
    @Column(name = "item_ti_otros_trib")
    private String itemTiOtrosTrib;
    @Column(name = "item_total_tax")
    private String itemTotalTax;
    @Column(name = "item_tributo")
    private String itemTributo;
    @Column(name = "rete_rela_tipo_docu")
    private String reteRelaTipoDocu;
    @Column(name = "rete_rela_nume_docu")
    private String reteRelaNumeDocu;
    @Column(name = "rete_rela_fech_docu")
    private String reteRelaFechDocu;
    @Column(name = "rete_rela_tipo_moneda")
    private String reteRelaTipoMoneda;
    @Column(name = "rete_rela_total_original")
    private String reteRelaTotalOriginal;
    @Column(name = "rete_rela_fecha_pago")
    private String reteRelaFechaPago;
    @Column(name = "rete_rela_numero_pago")
    private String reteRelaNumeroPago;
    @Column(name = "rete_rela_importe_pagado_original")
    private String reteRelaImportePagadoOriginal;
    @Column(name = "rete_rela_tipo_moneda_pago")
    private String reteRelaTipoMonedaPago;
    @Column(name = "rete_importe_retenido_nacional")
    private String reteImporteRetenidoNacional;
    @Column(name = "rete_importe_neto_nacional")
    private String reteImporteNetoNacional;
    @Column(name = "rete_tipo_moneda_referencia")
    private String reteTipoMonedaReferencia;
    @Column(name = "rete_tipo_moneda_objetivo")
    private String reteTipoMonedaObjetivo;
    @Column(name = "rete_tipo_moneda_tipo_cambio")
    private String reteTipoMonedaTipoCambio;
    @Column(name = "rete_tipo_moneda_fecha")
    private String reteTipoMonedaFecha;
    @Column(name = "item_otros")
    private String itemOtros;
    @Column(name = "bultos")
    private String bultos;
    @Column(name = "color")
    private String color;
    @Column(name = "talla")
    private String talla;
    @Column(name = "matiz")
    private String matiz;
    @Column(name = "lote")
    private String lote;
    @Column(name = "um_cofaco")
    private String umCofaco;
    @Column(name = "cantidad_bruta")
    private String cantidadBruta;
    @Column(name = "cantidad_neta")
    private String cantidadNeta;
    @Column(name = "item_concepto_trib_nombre")
    private String itemConceptoTribNombre;
    @Column(name = "item_concepto_trib_codigo")
    private String itemConceptoTribCodigo;
    @Column(name = "item_numero_placa")
    private String itemNumeroPlaca;
    @JoinColumn(name = "docu_codigo", referencedColumnName = "docu_codigo")
    @ManyToOne(optional = false)
    private Cabecera docuCodigo;

    public Detalle() {
    }

    public Detalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public Integer getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    public String getDocuMoneda() {
        return docuMoneda;
    }

    public void setDocuMoneda(String docuMoneda) {
        this.docuMoneda = docuMoneda;
    }

    public String getItemMoneda() {
        return itemMoneda;
    }

    public void setItemMoneda(String itemMoneda) {
        this.itemMoneda = itemMoneda;
    }

    public String getItemOrden() {
        return itemOrden;
    }

    public void setItemOrden(String itemOrden) {
        this.itemOrden = itemOrden;
    }

    public String getItemUnidad() {
        return itemUnidad;
    }

    public void setItemUnidad(String itemUnidad) {
        this.itemUnidad = itemUnidad;
    }

    public String getItemCantidad() {
        return itemCantidad;
    }

    public void setItemCantidad(String itemCantidad) {
        this.itemCantidad = itemCantidad;
    }

    public String getItemCodproducto() {
        return itemCodproducto;
    }

    public void setItemCodproducto(String itemCodproducto) {
        this.itemCodproducto = itemCodproducto;
    }

    public String getItemCodproductoSunat() {
        return itemCodproductoSunat;
    }

    public void setItemCodproductoSunat(String itemCodproductoSunat) {
        this.itemCodproductoSunat = itemCodproductoSunat;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public String getItemAfectacion() {
        return itemAfectacion;
    }

    public void setItemAfectacion(String itemAfectacion) {
        this.itemAfectacion = itemAfectacion;
    }

    public String getItemTipoPrecioVenta() {
        return itemTipoPrecioVenta;
    }

    public void setItemTipoPrecioVenta(String itemTipoPrecioVenta) {
        this.itemTipoPrecioVenta = itemTipoPrecioVenta;
    }

    public String getItemPventa() {
        return itemPventa;
    }

    public void setItemPventa(String itemPventa) {
        this.itemPventa = itemPventa;
    }

    public String getItempventaIgv() {
        return itempventaIgv;
    }

    public void setItempventaIgv(String itempventaIgv) {
        this.itempventaIgv = itempventaIgv;
    }

    public String getItemPventaNohonerosa() {
        return itemPventaNohonerosa;
    }

    public void setItemPventaNohonerosa(String itemPventaNohonerosa) {
        this.itemPventaNohonerosa = itemPventaNohonerosa;
    }

    public String getItemTiSubtotal() {
        return itemTiSubtotal;
    }

    public void setItemTiSubtotal(String itemTiSubtotal) {
        this.itemTiSubtotal = itemTiSubtotal;
    }

    public String getItemBaseIgv() {
        return itemBaseIgv;
    }

    public void setItemBaseIgv(String itemBaseIgv) {
        this.itemBaseIgv = itemBaseIgv;
    }

    public String getItemTasaIgv() {
        return itemTasaIgv;
    }

    public void setItemTasaIgv(String itemTasaIgv) {
        this.itemTasaIgv = itemTasaIgv;
    }

    public String getItemTiIgv() {
        return itemTiIgv;
    }

    public void setItemTiIgv(String itemTiIgv) {
        this.itemTiIgv = itemTiIgv;
    }

    public String getItemIscTier() {
        return itemIscTier;
    }

    public void setItemIscTier(String itemIscTier) {
        this.itemIscTier = itemIscTier;
    }

    public String getItemBaseIsc() {
        return itemBaseIsc;
    }

    public void setItemBaseIsc(String itemBaseIsc) {
        this.itemBaseIsc = itemBaseIsc;
    }

    public String getItemTasaIsc() {
        return itemTasaIsc;
    }

    public void setItemTasaIsc(String itemTasaIsc) {
        this.itemTasaIsc = itemTasaIsc;
    }

    public String getItemTiIsc() {
        return itemTiIsc;
    }

    public void setItemTiIsc(String itemTiIsc) {
        this.itemTiIsc = itemTiIsc;
    }

    public String getItemBaseOtrosTrib() {
        return itemBaseOtrosTrib;
    }

    public void setItemBaseOtrosTrib(String itemBaseOtrosTrib) {
        this.itemBaseOtrosTrib = itemBaseOtrosTrib;
    }

    public String getItemTasaOtrosTrib() {
        return itemTasaOtrosTrib;
    }

    public void setItemTasaOtrosTrib(String itemTasaOtrosTrib) {
        this.itemTasaOtrosTrib = itemTasaOtrosTrib;
    }

    public String getItemTiOtrosTrib() {
        return itemTiOtrosTrib;
    }

    public void setItemTiOtrosTrib(String itemTiOtrosTrib) {
        this.itemTiOtrosTrib = itemTiOtrosTrib;
    }

    public String getItemTotalTax() {
        return itemTotalTax;
    }

    public void setItemTotalTax(String itemTotalTax) {
        this.itemTotalTax = itemTotalTax;
    }

    public String getItemTributo() {
        return itemTributo;
    }

    public void setItemTributo(String itemTributo) {
        this.itemTributo = itemTributo;
    }

    public String getReteRelaTipoDocu() {
        return reteRelaTipoDocu;
    }

    public void setReteRelaTipoDocu(String reteRelaTipoDocu) {
        this.reteRelaTipoDocu = reteRelaTipoDocu;
    }

    public String getReteRelaNumeDocu() {
        return reteRelaNumeDocu;
    }

    public void setReteRelaNumeDocu(String reteRelaNumeDocu) {
        this.reteRelaNumeDocu = reteRelaNumeDocu;
    }

    public String getReteRelaFechDocu() {
        return reteRelaFechDocu;
    }

    public void setReteRelaFechDocu(String reteRelaFechDocu) {
        this.reteRelaFechDocu = reteRelaFechDocu;
    }

    public String getReteRelaTipoMoneda() {
        return reteRelaTipoMoneda;
    }

    public void setReteRelaTipoMoneda(String reteRelaTipoMoneda) {
        this.reteRelaTipoMoneda = reteRelaTipoMoneda;
    }

    public String getReteRelaTotalOriginal() {
        return reteRelaTotalOriginal;
    }

    public void setReteRelaTotalOriginal(String reteRelaTotalOriginal) {
        this.reteRelaTotalOriginal = reteRelaTotalOriginal;
    }

    public String getReteRelaFechaPago() {
        return reteRelaFechaPago;
    }

    public void setReteRelaFechaPago(String reteRelaFechaPago) {
        this.reteRelaFechaPago = reteRelaFechaPago;
    }

    public String getReteRelaNumeroPago() {
        return reteRelaNumeroPago;
    }

    public void setReteRelaNumeroPago(String reteRelaNumeroPago) {
        this.reteRelaNumeroPago = reteRelaNumeroPago;
    }

    public String getReteRelaImportePagadoOriginal() {
        return reteRelaImportePagadoOriginal;
    }

    public void setReteRelaImportePagadoOriginal(String reteRelaImportePagadoOriginal) {
        this.reteRelaImportePagadoOriginal = reteRelaImportePagadoOriginal;
    }

    public String getReteRelaTipoMonedaPago() {
        return reteRelaTipoMonedaPago;
    }

    public void setReteRelaTipoMonedaPago(String reteRelaTipoMonedaPago) {
        this.reteRelaTipoMonedaPago = reteRelaTipoMonedaPago;
    }

    public String getReteImporteRetenidoNacional() {
        return reteImporteRetenidoNacional;
    }

    public void setReteImporteRetenidoNacional(String reteImporteRetenidoNacional) {
        this.reteImporteRetenidoNacional = reteImporteRetenidoNacional;
    }

    public String getReteImporteNetoNacional() {
        return reteImporteNetoNacional;
    }

    public void setReteImporteNetoNacional(String reteImporteNetoNacional) {
        this.reteImporteNetoNacional = reteImporteNetoNacional;
    }

    public String getReteTipoMonedaReferencia() {
        return reteTipoMonedaReferencia;
    }

    public void setReteTipoMonedaReferencia(String reteTipoMonedaReferencia) {
        this.reteTipoMonedaReferencia = reteTipoMonedaReferencia;
    }

    public String getReteTipoMonedaObjetivo() {
        return reteTipoMonedaObjetivo;
    }

    public void setReteTipoMonedaObjetivo(String reteTipoMonedaObjetivo) {
        this.reteTipoMonedaObjetivo = reteTipoMonedaObjetivo;
    }

    public String getReteTipoMonedaTipoCambio() {
        return reteTipoMonedaTipoCambio;
    }

    public void setReteTipoMonedaTipoCambio(String reteTipoMonedaTipoCambio) {
        this.reteTipoMonedaTipoCambio = reteTipoMonedaTipoCambio;
    }

    public String getReteTipoMonedaFecha() {
        return reteTipoMonedaFecha;
    }

    public void setReteTipoMonedaFecha(String reteTipoMonedaFecha) {
        this.reteTipoMonedaFecha = reteTipoMonedaFecha;
    }

    public String getItemOtros() {
        return itemOtros;
    }

    public void setItemOtros(String itemOtros) {
        this.itemOtros = itemOtros;
    }

    public String getBultos() {
        return bultos;
    }

    public void setBultos(String bultos) {
        this.bultos = bultos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMatiz() {
        return matiz;
    }

    public void setMatiz(String matiz) {
        this.matiz = matiz;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getUmCofaco() {
        return umCofaco;
    }

    public void setUmCofaco(String umCofaco) {
        this.umCofaco = umCofaco;
    }

    public String getCantidadBruta() {
        return cantidadBruta;
    }

    public void setCantidadBruta(String cantidadBruta) {
        this.cantidadBruta = cantidadBruta;
    }

    public String getCantidadNeta() {
        return cantidadNeta;
    }

    public void setCantidadNeta(String cantidadNeta) {
        this.cantidadNeta = cantidadNeta;
    }

    public String getItemConceptoTribNombre() {
        return itemConceptoTribNombre;
    }

    public void setItemConceptoTribNombre(String itemConceptoTribNombre) {
        this.itemConceptoTribNombre = itemConceptoTribNombre;
    }

    public String getItemConceptoTribCodigo() {
        return itemConceptoTribCodigo;
    }

    public void setItemConceptoTribCodigo(String itemConceptoTribCodigo) {
        this.itemConceptoTribCodigo = itemConceptoTribCodigo;
    }

    public String getItemNumeroPlaca() {
        return itemNumeroPlaca;
    }

    public void setItemNumeroPlaca(String itemNumeroPlaca) {
        this.itemNumeroPlaca = itemNumeroPlaca;
    }

    public Cabecera getDocuCodigo() {
        return docuCodigo;
    }

    public void setDocuCodigo(Cabecera docuCodigo) {
        this.docuCodigo = docuCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalle != null ? iddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalle)) {
            return false;
        }
        Detalle other = (Detalle) object;
        if ((this.iddetalle == null && other.iddetalle != null) || (this.iddetalle != null && !this.iddetalle.equals(other.iddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "iddetalle=" + iddetalle +
                ", idExterno='" + idExterno + '\'' +
                ", docuMoneda='" + docuMoneda + '\'' +
                ", itemMoneda='" + itemMoneda + '\'' +
                ", itemOrden='" + itemOrden + '\'' +
                ", itemUnidad='" + itemUnidad + '\'' +
                ", itemCantidad='" + itemCantidad + '\'' +
                ", itemCodproducto='" + itemCodproducto + '\'' +
                ", itemCodproductoSunat='" + itemCodproductoSunat + '\'' +
                ", itemDescripcion='" + itemDescripcion + '\'' +
                ", itemAfectacion='" + itemAfectacion + '\'' +
                ", itemTipoPrecioVenta='" + itemTipoPrecioVenta + '\'' +
                ", itemPventa='" + itemPventa + '\'' +
                ", itempventaIgv='" + itempventaIgv + '\'' +
                ", itemPventaNohonerosa='" + itemPventaNohonerosa + '\'' +
                ", itemTiSubtotal='" + itemTiSubtotal + '\'' +
                ", itemBaseIgv='" + itemBaseIgv + '\'' +
                ", itemTasaIgv='" + itemTasaIgv + '\'' +
                ", itemTiIgv='" + itemTiIgv + '\'' +
                ", itemIscTier='" + itemIscTier + '\'' +
                ", itemBaseIsc='" + itemBaseIsc + '\'' +
                ", itemTasaIsc='" + itemTasaIsc + '\'' +
                ", itemTiIsc='" + itemTiIsc + '\'' +
                ", itemBaseOtrosTrib='" + itemBaseOtrosTrib + '\'' +
                ", itemTasaOtrosTrib='" + itemTasaOtrosTrib + '\'' +
                ", itemTiOtrosTrib='" + itemTiOtrosTrib + '\'' +
                ", itemTotalTax='" + itemTotalTax + '\'' +
                ", itemTributo='" + itemTributo + '\'' +
                ", reteRelaTipoDocu='" + reteRelaTipoDocu + '\'' +
                ", reteRelaNumeDocu='" + reteRelaNumeDocu + '\'' +
                ", reteRelaFechDocu='" + reteRelaFechDocu + '\'' +
                ", reteRelaTipoMoneda='" + reteRelaTipoMoneda + '\'' +
                ", reteRelaTotalOriginal='" + reteRelaTotalOriginal + '\'' +
                ", reteRelaFechaPago='" + reteRelaFechaPago + '\'' +
                ", reteRelaNumeroPago='" + reteRelaNumeroPago + '\'' +
                ", reteRelaImportePagadoOriginal='" + reteRelaImportePagadoOriginal + '\'' +
                ", reteRelaTipoMonedaPago='" + reteRelaTipoMonedaPago + '\'' +
                ", reteImporteRetenidoNacional='" + reteImporteRetenidoNacional + '\'' +
                ", reteImporteNetoNacional='" + reteImporteNetoNacional + '\'' +
                ", reteTipoMonedaReferencia='" + reteTipoMonedaReferencia + '\'' +
                ", reteTipoMonedaObjetivo='" + reteTipoMonedaObjetivo + '\'' +
                ", reteTipoMonedaTipoCambio='" + reteTipoMonedaTipoCambio + '\'' +
                ", reteTipoMonedaFecha='" + reteTipoMonedaFecha + '\'' +
                ", itemOtros='" + itemOtros + '\'' +
                ", bultos='" + bultos + '\'' +
                ", color='" + color + '\'' +
                ", talla='" + talla + '\'' +
                ", matiz='" + matiz + '\'' +
                ", lote='" + lote + '\'' +
                ", umCofaco='" + umCofaco + '\'' +
                ", cantidadBruta='" + cantidadBruta + '\'' +
                ", cantidadNeta='" + cantidadNeta + '\'' +
                ", itemConceptoTribNombre='" + itemConceptoTribNombre + '\'' +
                ", itemConceptoTribCodigo='" + itemConceptoTribCodigo + '\'' +
                ", itemNumeroPlaca='" + itemNumeroPlaca + '\'' +
                ", docuCodigo=" + docuCodigo +
                '}';
    }
}
