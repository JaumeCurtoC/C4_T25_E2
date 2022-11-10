package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.IDepartamentoDAO;
import com.example.C4_T25.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	IDepartamentoDAO departamentoDAO;

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long id) {
		// TODO Auto-generated method stub
		return departamentoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizardDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		// TODO Auto-generated method stub
		departamentoDAO.deleteById(id);
	}

	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return departamentoDAO.findAll();
	}

}
