package br.com.rd.gestaoTransporte.configuration;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BusinessException(String e) {
        super(e);
    }

}
