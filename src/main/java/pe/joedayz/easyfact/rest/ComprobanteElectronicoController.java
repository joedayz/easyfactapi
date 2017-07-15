

package pe.joedayz.easyfact.rest;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.joedayz.easyfact.dto.ComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronico;
import pe.joedayz.easyfact.exception.ComprobanteElectronicoNotFoundException;
import pe.joedayz.easyfact.service.intf.ConsultaComprobanteElectronicoService;

@RestController
public class ComprobanteElectronicoController {
	
    @Autowired
    private JavaMailSender emailSender;
    
    @Value("${spring.mail.host}")
    String host;

    @Value("${spring.mail.sender}")
    String sender;
	
    @Value("${spring.mail.fromIP}")
    String hostIpAddress;
    
	@Autowired
	private ConsultaComprobanteElectronicoService service;

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="/ConsultaComprobanteElectronico")
	public @ResponseBody ComprobanteElectronico consultar(@RequestBody ConsultaComprobanteElectronico consultaComprobanteElectronico) {
		ComprobanteElectronico result = new ComprobanteElectronico();
		result = service.consultarComprobanteElectronico(consultaComprobanteElectronico);		
		if (result==null)
			throw new ComprobanteElectronicoNotFoundException(consultaComprobanteElectronico.getSerieYNumero());
		else
			enviarComprobanteElectronico(consultaComprobanteElectronico, result);
		return result;

	}

	private void enviarComprobanteElectronico(ConsultaComprobanteElectronico consultaComprobanteElectronico, ComprobanteElectronico comprobanteElectronico) {
		sendEmail(consultaComprobanteElectronico, comprobanteElectronico);		
	}
	
	
    private void sendEmail(ConsultaComprobanteElectronico consultaComprobanteElectronico, ComprobanteElectronico comprobanteElectronico){
    	 MimeMessage mail = emailSender.createMimeMessage();
         try {
             MimeMessageHelper helper = new MimeMessageHelper(mail, true);
             helper.setTo(consultaComprobanteElectronico.getEmail());
             helper.setReplyTo(sender);
             helper.setFrom(sender);
             helper.setSubject("Comprobante Electrónico # " + consultaComprobanteElectronico.getSerieYNumero());
             helper.setText(buildEmailTextBody(consultaComprobanteElectronico));
             
             //adjuntando archivos
             FileSystemResource filePDF = new FileSystemResource(new File(comprobanteElectronico.getDocuLinkPdf()));
             helper.addAttachment("PDF", filePDF);
             
             FileSystemResource fileCDR = new FileSystemResource(new File(comprobanteElectronico.getDocuLinkCdr()));
             helper.addAttachment("CDR", fileCDR);
             
             FileSystemResource fileXML = new FileSystemResource(new File(comprobanteElectronico.getDocuLinkXml()));
             helper.addAttachment("XML", fileXML);
             
         } catch (MessagingException e) {
             //LOGGER.error("Error Building email body", e);
             e.printStackTrace();
         } finally {}

         emailSender.send(mail);    	 
    }

    private String buildEmailTextBody(ConsultaComprobanteElectronico consultaComprobanteElectronico){
        StringBuilder sb = new StringBuilder();
        sb.append("Estimado Cliente, adjuntamos su comprobante electrónico solicitado con los siguientes datos: ");
        sb.append(System.getProperty("line.separator"));
        sb.append("Tipo Documento   : " + consultaComprobanteElectronico.getTipoComprobante());sb.append(System.getProperty("line.separator"));
        sb.append("Número Documento : " + consultaComprobanteElectronico.getSerieYNumero());sb.append(System.getProperty("line.separator"));
        sb.append("RUC			    : " + consultaComprobanteElectronico.getRuc());sb.append(System.getProperty("line.separator"));
        sb.append("Fecha Emisión    : " + consultaComprobanteElectronico.getFechaEmision());sb.append(System.getProperty("line.separator"));
        sb.append("Monto Total      : " + consultaComprobanteElectronico.getMontoTotalComprobante());sb.append(System.getProperty("line.separator"));
        
        
        return sb.toString();
    }
	
}
