package org.excel.io.exception;


/**
 * 
 * @author sairam.p
 *
 */
public class RepositoryException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RepositoryException() {}

	public RepositoryException(String message) { super(message);}

	public RepositoryException(Throwable cause) { super(cause); }

	public RepositoryException(String message, Throwable cause) { super(message, cause); }

	public RepositoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
