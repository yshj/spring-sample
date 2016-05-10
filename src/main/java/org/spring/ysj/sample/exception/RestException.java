package org.spring.ysj.sample.exception;

import org.springframework.http.HttpStatus;

public class RestException extends RuntimeException {

	private HttpStatus status;

	private ErrorMessage errorMessage;

	private static final long serialVersionUID = 1L;

	public RestException(HttpStatus status, String code, String message) {
		this.status = status;
		errorMessage = new ErrorMessage();
		errorMessage.setCode(code);
		errorMessage.setMessage(message);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

}
