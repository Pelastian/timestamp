package com.timestamp.springboot.backend.apirest.models.services;

import java.util.List;

import com.timestamp.springboot.backend.apirest.models.entity.Empleado;

public interface IEmpleadoService {
		public List<Empleado> findAll();
		
		public Empleado save(Empleado empleado);
		
		public void delete(Long id);
		
		public Empleado findById(Long id);
}
