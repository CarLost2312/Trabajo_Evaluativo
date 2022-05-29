package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.util.listaCandidato;

@Controller
public class CandidatosController {

@GetMapping("/candidatos")
public String getListaAlumnos(Model model) {
	listaCandidato listaAlumnos = new listaCandidato();
	model.addAttribute("alumnos", listaAlumnos.getCandidatos());
	return "lista_alumnos";
}
}
