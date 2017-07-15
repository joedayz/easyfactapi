package pe.joedayz.easyfact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.joedayz.easyfact.domain.model.repository.jdbc.ConsultaComprobanteElectronicoJdbcRepository;
import pe.joedayz.easyfact.dto.ComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronico;
import pe.joedayz.easyfact.dto.ConsultaComprobanteElectronicoInterno;
import pe.joedayz.easyfact.service.intf.ConsultaComprobanteElectronicoService;

@Service
public class ConsultaComprobanteElectronicoServiceImpl implements ConsultaComprobanteElectronicoService {

	@Autowired
	private ConsultaComprobanteElectronicoJdbcRepository repository;

	public ComprobanteElectronico consultarComprobanteElectronico(ConsultaComprobanteElectronico consultaComprobanteElectronico) {
		ComprobanteElectronico comprobanteElectronico = null;

		List<ComprobanteElectronico> lista = repository.consultarComprobanteElectronico(consultaComprobanteElectronico);

		if(lista!=null && lista.size()>0){
			comprobanteElectronico=lista.get(0);
		}
		
		return comprobanteElectronico;
	}

	@Override
	public List<ComprobanteElectronico> consultarComprobanteElectronicoInterno(
			ConsultaComprobanteElectronicoInterno consultaComprobanteElectronicoInterno) {
		ComprobanteElectronico comprobanteElectronico = null;

		List<ComprobanteElectronico> lista = repository.consultarComprobanteElectronicoInterno
				(consultaComprobanteElectronicoInterno);


		return lista;
	}

}
