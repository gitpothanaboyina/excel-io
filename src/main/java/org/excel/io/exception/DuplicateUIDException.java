package org.excel.io.exception;


/**
 * 
 * @author sairam.p
 *
 */
public class DuplicateUIDException extends RepositoryException {

	private static final long serialVersionUID = 1L;

	public DuplicateUIDException() { }

	public DuplicateUIDException(String message) { super(message); }

	public DuplicateUIDException(Throwable cause) { super(cause); }

	public DuplicateUIDException(String message, Throwable cause) { super(message, cause); }

	public DuplicateUIDException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}