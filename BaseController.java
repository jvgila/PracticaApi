package com.govertispractica.pr.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	//IMPLEMENTED BY JVG.

	@GetMapping
	public String base() {
		
		return "Starting Govertis Api Rest 2022 Implemented By JVG....." 
				+ "Based on Spring Boot with a basic Web Service API REST";
	}
	
	@RequestMapping
	public ResponseEntity<BaseController> getBaseController(){
		
		BaseController basecontroller = new BaseController();
		basecontroller.setId(1L);
		basecontroller.setName("basecontroller JVG");
		return ResponseEntity.ok(basecontroller);
		
	}

	private void setName(String name) {
	// TODO Auto-generated method stub. Nombre como cadena.
		
	}
	private void setId(long l) {
		// TODO Auto-generated method stub. Id como valor entero.
		
	}

	
}
