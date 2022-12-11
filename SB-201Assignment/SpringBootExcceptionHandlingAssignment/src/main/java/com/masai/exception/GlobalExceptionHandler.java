package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(BookNotFoundException ie,WebRequest re){
		
		MyErrorDetails me=new MyErrorDetails();
		me.setTimestamp(LocalDateTime.now());
		me.setMessege(ie.getMessage());
		me.setDetails(re.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails> (me,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyHandler(Exception ie,WebRequest re){
		
		MyErrorDetails me=new MyErrorDetails();
		me.setTimestamp(LocalDateTime.now());
		me.setMessege(ie.getMessage());
		me.setDetails(re.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails> (me,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	
	
	
	}
		
	
}
