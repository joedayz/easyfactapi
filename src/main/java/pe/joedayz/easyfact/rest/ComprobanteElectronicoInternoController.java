package pe.joedayz.easyfact.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.joedayz.easyfact.dto.ComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronicoInterno;
import pe.joedayz.easyfact.exception.ComprobanteElectronicoNotFoundException;
import pe.joedayz.easyfact.service.intf.ConsultaComprobanteElectronicoService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ComprobanteElectronicoInternoController {

	@Autowired
	private ConsultaComprobanteElectronicoService service;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="/ConsultaComprobanteElectronicoInterno")
	public @ResponseBody List<ComprobanteElectronico> consultar(@RequestBody ConsultaComprobanteElectronicoInterno consultaComprobanteElectronicoInterno) {
		List<ComprobanteElectronico> result = new ArrayList<>();
		result = service.consultarComprobanteElectronicoInterno(consultaComprobanteElectronicoInterno);		
		if (result==null)
			throw new ComprobanteElectronicoNotFoundException(consultaComprobanteElectronicoInterno.getSerieYNumero());
		return result;

	}
}
