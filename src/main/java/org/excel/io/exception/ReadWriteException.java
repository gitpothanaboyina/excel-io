package org.excel.io.exception;

public class ReadWriteException extends RepositoryException {

	private static final long serialVersionUID = 1L;

	public ReadWriteException() { }

	public ReadWriteException(String message) { super(message);}

	public ReadWriteException(Throwable cause) { super(cause); }

	public ReadWriteException(String message, Throwable cause) { super(message, cause); }

	public ReadWriteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { super(message, cause, enableSuppression, writableStackTrace); }
}