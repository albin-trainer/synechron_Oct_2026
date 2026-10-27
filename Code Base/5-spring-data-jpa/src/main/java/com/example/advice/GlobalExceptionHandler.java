package com.example.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.exceptions.ApplicationException;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(exception = ApplicationException.class)
  public ResponseEntity<String> handleAppException(Exception e) {
		ResponseEntity<String> res=
				new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	  return res;
  }
}
