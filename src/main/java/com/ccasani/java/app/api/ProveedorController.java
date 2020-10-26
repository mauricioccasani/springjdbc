package com.ccasani.java.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ccasani.java.app.dto.ProveedorDto;
import com.ccasani.java.app.service.IProveedorService;

@Controller
public class ProveedorController {
	
	@Autowired
	private IProveedorService proveedorService;
	@GetMapping("/listar")
	public ResponseEntity<?> listar() {
		List<ProveedorDto>listar= this.proveedorService.listarProveedor();
		return new ResponseEntity<List<ProveedorDto>>(listar,HttpStatus.OK);
	}

}
