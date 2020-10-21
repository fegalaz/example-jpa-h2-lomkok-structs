package com.ejemplo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.dto.request.AutoReq;
import com.ejemplo1.dto.respond.AutoDTO;
import com.ejemplo1.exception.ResourceNotFoundException;
import com.ejemplo1.service.AutoService;

@RestController
@Validated
public class ControllerEjemplo {

	@Autowired
	private AutoService autoService;

	@PostMapping(value = "/create")
	public ResponseEntity<?> create(@RequestBody AutoReq autoReq) {
		AutoDTO respond = autoService.createAuto(autoReq);
		return new ResponseEntity<>(respond, HttpStatus.OK);
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<List<AutoDTO>> findAllAutos() {
		List<AutoDTO> respond = autoService.findAllAutos();
		if(respond.isEmpty()) {
		      throw new ResourceNotFoundException("Not found data");
		}
		return new ResponseEntity<>(respond, HttpStatus.OK);
	}
	
	@GetMapping (value = "/findById/{id}")
	public ResponseEntity<AutoDTO> findById(@PathVariable("id") Integer id){
		AutoDTO respond = autoService.findById(id);
		return new ResponseEntity<>(respond, HttpStatus.OK);
	}
}