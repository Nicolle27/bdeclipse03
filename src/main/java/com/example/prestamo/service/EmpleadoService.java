package com.example.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prestamo.dao.Todo;
import com.example.prestamo.daoImpl.EmpleadoDaoIMpl;
import com.example.prestamo.entity.Empleado;

@Service
public class EmpleadoService implements Todo<Empleado>{
	@Autowired
	private EmpleadoDaoIMpl daoIMpl;
	@Override
	public int create(Empleado t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Empleado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

}
