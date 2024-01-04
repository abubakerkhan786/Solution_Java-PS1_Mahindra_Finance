package net.java.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidGenderTypeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidGenderTypeException(String message) {
		super(message);
	}
}