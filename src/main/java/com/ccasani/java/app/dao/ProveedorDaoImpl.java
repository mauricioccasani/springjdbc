package com.ccasani.java.app.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ccasani.java.app.dto.ProveedorDto;

import oracle.jdbc.OracleTypes;

@Repository
public class ProveedorDaoImpl implements ProveedorDao {

	@Autowired
	private DataSource ds;

	@Override
	public List<ProveedorDto> proveedores() {
		String sql = "{ CALL PKG_PROVEEDORES.SP_LISTAR_PROVEEDOR(?) }";
		ResultSet rs = null;
		List<ProveedorDto> proveedors=null;
		try (Connection cn = ds.getConnection()) {
			CallableStatement cs = cn.prepareCall(sql);
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.execute();
			rs = (ResultSet) cs.getObject(1);
			proveedors = new ArrayList<ProveedorDto>();
			while (rs.next()) {
				ProveedorDto p = new ProveedorDto();
				p.setId(rs.getInt("ID_PROVEEDOR"));
				p.setDni(rs.getString("DNI"));
				p.setNombre(rs.getString("NOMBRE"));
				p.setDireccion(rs.getString("DIRECCION"));
				p.setTelefono(rs.getString("TELEFONO"));

				proveedors.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return proveedors;
	}

	@Override
	public boolean insertar(ProveedorDto proveedorDto) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
