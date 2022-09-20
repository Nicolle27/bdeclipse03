package com.example.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prestamo.entity.Alumno;
import com.example.prestamo.service.AlumnoService;

@RestController

public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;
	@GetMapping("/alumno")
	public List<Alumno> getList(){
		return alumnoService.readAll();
	}
}
