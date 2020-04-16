package org.excel.io.exception;


/**
 * 
 * @author sairam.p
 *
 */
public class ExcelIOException extends RepositoryException {

	private static final long serialVersionUID = 1L;

	public ExcelIOException() { }

	public ExcelIOException(String message) { super(message); }

	public ExcelIOException(Throwable cause) { super(cause); }

	public ExcelIOException(String message, Throwable cause) { super(message, cause); }

	public ExcelIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}