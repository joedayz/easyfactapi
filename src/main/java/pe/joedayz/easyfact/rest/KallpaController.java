package pe.joedayz.easyfact.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.joedayz.easyfact.domain.model.entities.Cabecera;
import pe.joedayz.easyfact.domain.model.entities.Detalle;
import pe.joedayz.easyfact.domain.model.repository.jpa.CabeceraRepository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/cargar")
public class KallpaController {


    @Autowired
    private CabeceraRepository cabeceraRepository;

    @GetMapping("/cabecera")
    public ResponseEntity<String> cargarCabecera() {
        List<String> lines = new ArrayList<>();


        try {

            //Leer la cabecera
            lines = Files.
                    readAllLines(Paths.get("src/main/resources/cabecera.txt"), StandardCharsets.ISO_8859_1);

            String docuCodigoInterno = "";

            for (String line : lines) {

                //Llenar cabecera
                String[] dataCabecera = line.split("\\|");

                Cabecera cabecera = new Cabecera();
                docuCodigoInterno = dataCabecera[0];
                cabecera.setIdExterno(dataCabecera[1]);
                cabecera.setEmprRazonsocial(dataCabecera[2]);
                cabecera.setEmprUbigeo(dataCabecera[3]);
                cabecera.setEmprNombrecomercial(dataCabecera[4]);
                cabecera.setEmprLocal(dataCabecera[5]);
                cabecera.setEmprDireccion(dataCabecera[6]);
                cabecera.setEmprUrbanizacion(dataCabecera[7]);
                cabecera.setEmprProvincia(dataCabecera[8]);
                cabecera.setEmprDepartamento(dataCabecera[9]);
                cabecera.setEmprDistrito(dataCabecera[10]);
                cabecera.setEmprPais(dataCabecera[11]);
                cabecera.setEmprNroruc(dataCabecera[12]);
                cabecera.setEmprTipodoc(dataCabecera[13]);
                cabecera.setEmprCtaBancoNacionDetraccion(dataCabecera[14]);
                cabecera.setClieNumero(dataCabecera[15]);
                cabecera.setClieTipodoc(dataCabecera[16]);
                cabecera.setClieNombre(dataCabecera[17]);
                cabecera.setClieDireccion(dataCabecera[18]);
                cabecera.setClieUbigeo(dataCabecera[19]);
                cabecera.setCliePais(dataCabecera[20]);
                cabecera.setClieDepartamento(dataCabecera[21]);
                cabecera.setClieProvincia(dataCabecera[22]);
                cabecera.setClieDistrito(dataCabecera[23]);
                cabecera.setClieUrbanizacion(dataCabecera[24]);
                cabecera.setDocuFecha(dataCabecera[25]);
                cabecera.setDocuHora(dataCabecera[26]);
                cabecera.setDocuFechaVencimiento(dataCabecera[27]);
                cabecera.setDocuTipodocumento(dataCabecera[28]);
                cabecera.setDocuNumero(dataCabecera[29]);
                cabecera.setDocuMoneda(dataCabecera[30]);
                cabecera.setDocuGravada(dataCabecera[31]);
                cabecera.setDocuInafecta(dataCabecera[32]);
                cabecera.setDocuExonerada(dataCabecera[33]);
                cabecera.setDocuExportada(dataCabecera[34]);
                cabecera.setDocuGratuita(dataCabecera[35]);
                cabecera.setDocuDescuento(dataCabecera[36]);
                cabecera.setDocuRedondeo(dataCabecera[37]);
                cabecera.setDocuSubtotal(dataCabecera[38]);
                cabecera.setDocuTotal(dataCabecera[39]);
                cabecera.setDocuIgv(dataCabecera[40]);
                cabecera.setTasaIgv(dataCabecera[41]);
                cabecera.setDocuIsc(dataCabecera[42]);
                cabecera.setTasaIsc(dataCabecera[43]);
                cabecera.setDocuOtrostributos(dataCabecera[44]);
                cabecera.setTasaOtrostributos(dataCabecera[45]);
                cabecera.setDocuTotalTax(dataCabecera[46]);
                cabecera.setDocuOtroscargos(dataCabecera[47]);
                cabecera.setDocuPercepcion(dataCabecera[48]);
                cabecera.setDocuCodigoBienDetraccion(dataCabecera[49]);
                cabecera.setDocuTasaDetraccion(dataCabecera[50]);
                cabecera.setDocuDetraccion(dataCabecera[51]);
                cabecera.setNotaMotivo(dataCabecera[52]);
                cabecera.setNotaSustento(dataCabecera[53]);
                cabecera.setNotaTipodoc(dataCabecera[54]);
                cabecera.setNotaDocumento(dataCabecera[55]);
                cabecera.setNotaDocumentoFecha(dataCabecera[56]);
                cabecera.setDocuEnviaws(dataCabecera[57]);
                cabecera.setDocuProceStatus(dataCabecera[58]);
                cabecera.setDocuFormaPago(dataCabecera[59]);
                cabecera.setDocuObservacion(dataCabecera[60]);
                cabecera.setDocuVendedor(dataCabecera[61]);
                cabecera.setDocuPedido(dataCabecera[62]);
                cabecera.setDocuGuiaRemision(dataCabecera[63]);
                cabecera.setClieOrdenCompra(dataCabecera[64]);
                cabecera.setClieCorreoCpe1(dataCabecera[65]);
                cabecera.setClieCorreoCpe2(dataCabecera[66]);
                cabecera.setClieCorreoCpe0(dataCabecera[67]);
                cabecera.setDocuTipoOperacion(dataCabecera[68]);
                cabecera.setDocuAnticipoTotal(dataCabecera[69]);


                System.out.println(cabecera);

                //Llenar detalle

                List<String> lineDetalles = buscarDetalles(docuCodigoInterno);

                Set<Detalle> detalleSet = new HashSet<>();

                for(String lineDetalle: lineDetalles){

                    String[] dataDetalle = lineDetalle.split("\\|");
                    Detalle detalle = new Detalle();
                    detalle.setIdExterno(dataDetalle[1]);
                    detalle.setDocuCodigo(cabecera);
                    detalle.setDocuMoneda(dataDetalle[3]);
                    detalle.setItemMoneda(dataDetalle[4]);
                    detalle.setItemOrden(dataDetalle[5]);
                    detalle.setItemUnidad(dataDetalle[6]);

                    detalle.setItemCantidad(dataDetalle[7]);

                    detalle.setItemCodproducto(dataDetalle[8]);
                    detalle.setItemCodproductoSunat(dataDetalle[9]);
                    detalle.setItemDescripcion(dataDetalle[10]);
                    detalle.setItemAfectacion(dataDetalle[11]);
                    detalle.setItemTipoPrecioVenta(dataDetalle[12]);
                    detalle.setItemPventa(dataDetalle[13]);
                    detalle.setItempventaIgv(dataDetalle[14]);
                    detalle.setItemPventaNohonerosa(dataDetalle[15]);
                    detalle.setItemTiSubtotal(dataDetalle[16]);
                    detalle.setItemBaseIgv(dataDetalle[17]);
                    detalle.setItemTasaIgv(dataDetalle[18]);
                    detalle.setItemTiIgv(dataDetalle[19]);
                    detalle.setItemIscTier(dataDetalle[20]);
                    detalle.setItemBaseIsc(dataDetalle[21]);
                    detalle.setItemTasaIsc(dataDetalle[22]);
                    detalle.setItemTiIsc(dataDetalle[23]);
                    detalle.setItemBaseOtrosTrib(dataDetalle[24]);
                    detalle.setItemTasaOtrosTrib(dataDetalle[25]);
                    detalle.setItemTiOtrosTrib(dataDetalle[26]);
                    detalle.setItemTotalTax(dataDetalle[27]);
                    detalle.setItemTributo(dataDetalle[28]);

                    System.out.println(detalle);

                    detalleSet.add(detalle);


                }

                //Llenar leyenda

                //grabar toda la cabecera

                cabecera.setDetalleSet(detalleSet);

                cabeceraRepository.save(cabecera);
            }


        } catch (IOException e) {

            e.printStackTrace();
            return new ResponseEntity<>(
                    "Fallo la Carga de Cabecera",
                    HttpStatus.BAD_REQUEST);
        }


        return  new ResponseEntity<>("Finalizada la Carga de Cabecera!", HttpStatus.OK);
    }

    private List<String> buscarDetalles(String docuCodigoInterno) {

        List<String> lines = new ArrayList<>();


        try {

            //Leer la cabecera
            List<String> linesInterno = Files.
                    readAllLines(Paths.get("src/main/resources/detalle.txt"), StandardCharsets.ISO_8859_1);

            for (String line : linesInterno) {

                //Llenar cabecera
                String[] dataDetalle = line.split("\\|");

                if (dataDetalle[0].equals(docuCodigoInterno)) {
                    lines.add(line);
                } else {
                    continue;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        return lines;
    }
}