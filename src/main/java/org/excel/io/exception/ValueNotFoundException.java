package org.excel.io.exception;


/**
 * 
 * @author sairam.p
 *
 */
public class ValueNotFoundException extends RepositoryException {

	private static final long serialVersionUID = 1L;

	public ValueNotFoundException() { }

	public ValueNotFoundException(String message) { super(message); }

	public ValueNotFoundException(Throwable cause) { super(cause); }

	public ValueNotFoundException(String message, Throwable cause) { super(message, cause); }

	public ValueNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
