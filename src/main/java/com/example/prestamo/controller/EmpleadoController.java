package com.example.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prestamo.entity.Empleado;
import com.example.prestamo.service.EmpleadoService;

@RestController

public class EmpleadoController {
	@Autowired
	private EmpleadoService empleadoService;
	@GetMapping("/empleado")
	public List<Empleado> getList(){
		return empleadoService.readAll();
	}
}
