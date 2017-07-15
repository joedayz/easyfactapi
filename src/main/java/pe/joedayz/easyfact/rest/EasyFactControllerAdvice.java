package pe.joedayz.easyfact.rest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import pe.joedayz.easyfact.exception.ComprobanteElectronicoNotFoundException;

@ControllerAdvice
public class EasyFactControllerAdvice {
	
	
	@ResponseBody
	@ExceptionHandler(ComprobanteElectronicoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors userNotFoundExceptionHandler(ComprobanteElectronicoNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}


}
