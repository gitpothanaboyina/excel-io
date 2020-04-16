package org.excel.io.exception;


/**
 * 
 * @author sairam.p
 *
 */
public class ExcelRepositoryException extends RepositoryException {

	private static final long serialVersionUID = 1L;

	public ExcelRepositoryException() { }

	public ExcelRepositoryException(String message) { super(message); }

	public ExcelRepositoryException(Throwable cause) { super(cause); }

	public ExcelRepositoryException(String message, Throwable cause) { super(message, cause); }

	public ExcelRepositoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}