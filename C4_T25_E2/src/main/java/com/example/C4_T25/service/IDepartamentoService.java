package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Departamento;

public interface IDepartamentoService {

	// CREATE
	public Departamento guardarDepartamento(Departamento departamento);
	
	// READ
	public Departamento departamentoXID(Long id);
	
	// UPDATE
	public Departamento actualizardDepartamento(Departamento departamento);
	
	// DELETE
	public void eliminarDepartamento(Long id);
	
	// Listar todos los fabricantes
	public List<Departamento> listarDepartamentos();
	
}
