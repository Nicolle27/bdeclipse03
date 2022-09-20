package com.example.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.prestamo.entity.Prestamo;
import com.example.prestamo.service.PrestamoService;

@RestController
public class PrestamoController {
	@Autowired
	private PrestamoService prestamoService;
	@GetMapping("/prestamo")
	public List<Prestamo> getList(){
		return prestamoService.readAll();
	}
}
