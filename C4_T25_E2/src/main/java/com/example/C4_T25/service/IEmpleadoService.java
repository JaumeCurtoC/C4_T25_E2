package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Empleado;

public interface IEmpleadoService {
	
	// CREATE
	public Empleado guardarEmpleado(Empleado empleado);
	
	// READ
	public Empleado empleadoXID(Long id);
	
	// UPDATE 
	public Empleado actualizarEmpleado(Empleado empleado);
	
	// DELETE
	public void eliminarEmpleado(Long id);
	
	// Listar todos los empleados
	public List<Empleado> listarEmpleados();

}
