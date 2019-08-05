package com.timestamp.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.timestamp.springboot.backend.apirest.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long> {

}
