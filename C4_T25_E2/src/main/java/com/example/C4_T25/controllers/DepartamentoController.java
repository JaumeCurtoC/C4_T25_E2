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

import com.example.C4_T25.dto.Departamento;
import com.example.C4_T25.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	// Listar Departamentos
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	// Listar Departamento por ID
	@GetMapping("/departamentos/id/{id}")
	public Departamento departamentoXID(@PathVariable(name = "id") Long id) {
		return departamentoServiceImpl.departamentoXID(id);
	}
	
	// Insertar Departamento
	@PostMapping("/departamentos")
	public Departamento guardardDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	// Actualizar Departamento
	@GetMapping("/departamentos/{id}")
	public Departamento actualizardDepartamento(@PathVariable(name = "id") Long id, @RequestBody Departamento departamento) {
		Departamento dep_selec = new Departamento();
		Departamento dep_actu = new Departamento();
		
		dep_selec = departamentoServiceImpl.departamentoXID(id);
		
		dep_selec.setNombre(departamento.getNombre());
		dep_selec.setPresupuesto(departamento.getPresupuesto());
		
		dep_actu = departamentoServiceImpl.actualizardDepartamento(dep_selec);
		
		System.out.println("Departamento actualizado: " + dep_actu);
		
		return dep_actu;
	}
	
	// Eliminar departamento
	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name = "id") Long id) {
		departamentoServiceImpl.eliminarDepartamento(id);
	}
	
}
