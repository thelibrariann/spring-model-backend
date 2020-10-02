package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Size(min = 3, message = "Nombre ingresado debe tener minimo 3 caracteres")
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;
	
	@Size(min = 2, message = "Apellido ingresado debe tener minimo 2 caractares")
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;
	
	@Size(min = 3, max = 150, message = "Direccion ingresada debe tener minimo 3 caractaretes")
	@Column(name = "direccion", nullable = true, length = 150)
	private String direccion;
	
	@Size(min = 9, max = 9, message = "Telefono ingresado debe tener 9 caracteres")
	@Column(name = "telefono", nullable = true, length = 9)
	private String telefono;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
