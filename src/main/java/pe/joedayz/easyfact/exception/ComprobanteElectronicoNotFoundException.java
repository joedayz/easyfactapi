package pe.joedayz.easyfact.exception;

public class ComprobanteElectronicoNotFoundException extends RuntimeException{

	
	public ComprobanteElectronicoNotFoundException(String numeroYSerie) {
		super("could not find comprobante electronico '" + numeroYSerie + "'.");
	}
}



