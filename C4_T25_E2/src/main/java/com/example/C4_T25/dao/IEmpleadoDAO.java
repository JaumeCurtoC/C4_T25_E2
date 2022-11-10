package com.example.C4_T25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T25.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}
