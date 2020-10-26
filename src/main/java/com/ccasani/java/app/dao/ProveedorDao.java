package com.ccasani.java.app.dao;

import java.util.List;

import com.ccasani.java.app.dto.ProveedorDto;

public interface ProveedorDao {
	public List<ProveedorDto>proveedores();
	
	public boolean insertar(ProveedorDto proveedorDto);

}
