package com.ccasani.java.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GenericoDto {
	@JsonIgnore
	private Integer audIdUsuario;
	@JsonIgnore
	private String idSession;
	@JsonIgnore
	private String audIp;
	@JsonIgnore
	private String audNombreEquipo;

	public Integer getAudIdUsuario() {
		return audIdUsuario;
	}

	public void setAudIdUsuario(Integer audIdUsuario) {
		this.audIdUsuario = audIdUsuario;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getAudIp() {
		return audIp;
	}

	public void setAudIp(String audIp) {
		this.audIp = audIp;
	}

	public String getAudNombreEquipo() {
		return audNombreEquipo;
	}

	public void setAudNombreEquipo(String audNombreEquipo) {
		this.audNombreEquipo = audNombreEquipo;
	}

}
