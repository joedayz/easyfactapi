package pe.joedayz.easyfact.service.intf;

import pe.joedayz.easyfact.dto.ComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronicoInterno;

import java.util.List;

public interface ConsultaComprobanteElectronicoService {

	public ComprobanteElectronico consultarComprobanteElectronico(ConsultaComprobanteElectronico consultaComprobanteElectronico);
	
	public List<ComprobanteElectronico> consultarComprobanteElectronicoInterno(
			ConsultaComprobanteElectronicoInterno consultaComprobanteElectronicoInterno);
}
