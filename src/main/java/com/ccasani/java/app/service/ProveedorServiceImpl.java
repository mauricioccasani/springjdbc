package com.ccasani.java.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccasani.java.app.dao.ProveedorDao;
import com.ccasani.java.app.dto.ProveedorDto;
@Service
public class ProveedorServiceImpl implements IProveedorService {
	@Autowired
	private ProveedorDao proveedorDao;

	@Override
	public List<ProveedorDto> listarProveedor() {
		// TODO Auto-generated method stub
		return this.proveedorDao.proveedores();
	}

}
