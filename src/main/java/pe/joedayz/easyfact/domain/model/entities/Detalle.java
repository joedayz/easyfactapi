/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.joedayz.perufact.domain;

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

/**
 *
 * @author josediaz
 */
@Entity
@Table(name = "detalle")

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
    @Column(name = "item_descripcion")
    private String itemDescripcion;
    @Column(name = "item_afectacion")
    private String itemAfectacion;
    @Column(name = "item_tipo_precio_venta")
    private String itemTipoPrecioVenta;
    @Column(name = "item_pventa")
    private String itemPventa;
    @Column(name = "item_pventa_nohonerosa")
    private String itemPventaNohonerosa;
    @Column(name = "item_ti_subtotal")
    private String itemTiSubtotal;
    @Column(name = "item_ti_igv")
    private String itemTiIgv;
    @Column(name = "item_isc_tier")
    private String itemIscTier;
    @Column(name = "item_ti_isc")
    private String itemTiIsc;
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

    public String getItemTiIsc() {
        return itemTiIsc;
    }

    public void setItemTiIsc(String itemTiIsc) {
        this.itemTiIsc = itemTiIsc;
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
        return "pe.joedayz.perufact.Detalle[ iddetalle=" + iddetalle + " ]";
    }
    
}
