package org.spring.ysj.sample.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RestException.class)
	public ResponseEntity<ErrorMessage> handleErrorException(RestException ex) {
		return new ResponseEntity<ErrorMessage>(ex.getErrorMessage(), ex.getStatus());
	}

}
