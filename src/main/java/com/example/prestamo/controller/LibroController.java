package com.example.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prestamo.entity.Libro;
import com.example.prestamo.service.LibroService;

@RestController

public class LibroController {
	@Autowired
	private LibroService libroService;
	@GetMapping("/libro")
	public List<Libro> getList(){
		return libroService.readAll();
	}
}
