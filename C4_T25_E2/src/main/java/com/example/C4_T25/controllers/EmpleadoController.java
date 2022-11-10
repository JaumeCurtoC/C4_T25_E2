package com.example.C4_T25.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T25.dto.Empleado;
import com.example.C4_T25.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	// Metodo Listar Empleados
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImpl.listarEmpleados();
	}
	
	// Metodo listar por id
	@GetMapping("/empleados/id/{id}")
	public Empleado listarEmpleadoXID(@PathVariable(name = "id") Long id) {
		return empleadoServiceImpl.empleadoXID(id);
	}
	
	// Metodo insertar Empleado
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	// Metodo actualizar Empleado
	@GetMapping("/empleados/{id}")
	public Empleado actualizareEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {
		Empleado emp_selec = new Empleado();
		Empleado emp_actu = new Empleado();
		
		emp_selec = empleadoServiceImpl.empleadoXID(id);
		
		emp_selec.setNombre(empleado.getNombre());
		emp_selec.setApellidos(empleado.getApellidos());
		emp_selec.setDepartamento(empleado.getDepartamento());
		
		emp_actu = empleadoServiceImpl.actualizarEmpleado(emp_selec);
		
		System.out.println("Empleado actualizado: " + emp_actu);
		
		return emp_actu;
	}
	
	// Metodo eliminar Empleado
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}
