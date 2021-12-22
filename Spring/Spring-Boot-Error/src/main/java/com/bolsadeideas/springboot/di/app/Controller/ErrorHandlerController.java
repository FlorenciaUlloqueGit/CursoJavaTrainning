package com.bolsadeideas.springboot.di.app.Controller;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.di.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice //no se anota con controller sino con @ControllerAdvice
public class ErrorHandlerController {
	
	
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(Exception ex, Model model) {
		model.addAttribute("error", "Error aritmético");
		model.addAttribute("message", ex.getMessage() );
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value() );
		model.addAttribute("timestamp", new Date() );
		return "error/Generica";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberExceptionError(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Error: Formato número inválido");
		model.addAttribute("message", ex.getMessage() );
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value() );
		model.addAttribute("timestamp", new Date() );
		return "error/Generica"; //pudeo usar generica  para las dos porque son casi iguales o sino púedo usar ua plantilla para cada una
		
	}
	
	
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String usuarioNoEncontrado(UsuarioNoEncontradoException ex, Model model) {
		model.addAttribute("error", "Error: El usuario con el id especificado no existe");
		model.addAttribute("message", ex.getMessage() );
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value() );
		model.addAttribute("timestamp", new Date() );
		return "error/usuario"; 
		
	}
	
	

}
